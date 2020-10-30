package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IMachineService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Machine;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道作业设备 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道作业设备"})
@RestController
@RequestMapping("/machine")
public class MachineController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMachineService machineService;


    @ApiOperation(value = "新增隧道作业设备")
    @PostMapping()
    public int add(@RequestBody Machine machine){
        return machineService.add(machine);
    }

    @ApiOperation(value = "删除隧道作业设备")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return machineService.delete(id);
    }

    @ApiOperation(value = "更新隧道作业设备")
    @PutMapping()
    public int update(@RequestBody Machine machine){
        return machineService.updateData(machine);
    }

    @ApiOperation(value = "查询隧道作业设备分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Machine> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return machineService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道作业设备")
    @GetMapping("{id}")
    public Machine findById(@PathVariable Long id){
        return machineService.findById(id);
    }

}
