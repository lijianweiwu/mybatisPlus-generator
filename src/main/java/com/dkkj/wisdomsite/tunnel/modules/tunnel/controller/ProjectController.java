package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IProjectService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Project;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"项目信息表"})
@RestController
@RequestMapping("/project")
public class ProjectController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IProjectService projectService;


    @ApiOperation(value = "新增项目信息表")
    @PostMapping()
    public int add(@RequestBody Project project){
        return projectService.add(project);
    }

    @ApiOperation(value = "删除项目信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return projectService.delete(id);
    }

    @ApiOperation(value = "更新项目信息表")
    @PutMapping()
    public int update(@RequestBody Project project){
        return projectService.updateData(project);
    }

    @ApiOperation(value = "查询项目信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Project> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return projectService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询项目信息表")
    @GetMapping("{id}")
    public Project findById(@PathVariable Long id){
        return projectService.findById(id);
    }

}
