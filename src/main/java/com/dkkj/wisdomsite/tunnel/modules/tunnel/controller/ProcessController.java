package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IProcessService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Process;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道施工工序 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道施工工序"})
@RestController
@RequestMapping("/process")
public class ProcessController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IProcessService processService;


    @ApiOperation(value = "新增隧道施工工序")
    @PostMapping()
    public int add(@RequestBody Process process){
        return processService.add(process);
    }

    @ApiOperation(value = "删除隧道施工工序")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return processService.delete(id);
    }

    @ApiOperation(value = "更新隧道施工工序")
    @PutMapping()
    public int update(@RequestBody Process process){
        return processService.updateData(process);
    }

    @ApiOperation(value = "查询隧道施工工序分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Process> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return processService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道施工工序")
    @GetMapping("{id}")
    public Process findById(@PathVariable Long id){
        return processService.findById(id);
    }

}
