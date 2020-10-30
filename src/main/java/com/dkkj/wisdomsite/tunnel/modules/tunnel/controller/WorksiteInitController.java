package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteInitService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteInit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 工点初始化信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"工点初始化信息表"})
@RestController
@RequestMapping("/worksite-init")
public class WorksiteInitController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWorksiteInitService worksiteInitService;


    @ApiOperation(value = "新增工点初始化信息表")
    @PostMapping()
    public int add(@RequestBody WorksiteInit worksiteInit){
        return worksiteInitService.add(worksiteInit);
    }

    @ApiOperation(value = "删除工点初始化信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return worksiteInitService.delete(id);
    }

    @ApiOperation(value = "更新工点初始化信息表")
    @PutMapping()
    public int update(@RequestBody WorksiteInit worksiteInit){
        return worksiteInitService.updateData(worksiteInit);
    }

    @ApiOperation(value = "查询工点初始化信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WorksiteInit> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return worksiteInitService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询工点初始化信息表")
    @GetMapping("{id}")
    public WorksiteInit findById(@PathVariable Long id){
        return worksiteInitService.findById(id);
    }

}
