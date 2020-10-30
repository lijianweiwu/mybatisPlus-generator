package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IEnvironmentMonitorService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.EnvironmentMonitor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道环境监测 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道环境监测"})
@RestController
@RequestMapping("/environment-monitor")
public class EnvironmentMonitorController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IEnvironmentMonitorService environmentMonitorService;


    @ApiOperation(value = "新增隧道环境监测")
    @PostMapping()
    public int add(@RequestBody EnvironmentMonitor environmentMonitor){
        return environmentMonitorService.add(environmentMonitor);
    }

    @ApiOperation(value = "删除隧道环境监测")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return environmentMonitorService.delete(id);
    }

    @ApiOperation(value = "更新隧道环境监测")
    @PutMapping()
    public int update(@RequestBody EnvironmentMonitor environmentMonitor){
        return environmentMonitorService.updateData(environmentMonitor);
    }

    @ApiOperation(value = "查询隧道环境监测分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<EnvironmentMonitor> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return environmentMonitorService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道环境监测")
    @GetMapping("{id}")
    public EnvironmentMonitor findById(@PathVariable Long id){
        return environmentMonitorService.findById(id);
    }

}
