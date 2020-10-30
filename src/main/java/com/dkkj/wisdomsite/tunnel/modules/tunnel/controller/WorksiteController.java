package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Worksite;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 工作点（面）信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"工作点（面）信息表"})
@RestController
@RequestMapping("/worksite")
public class WorksiteController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWorksiteService worksiteService;


    @ApiOperation(value = "新增工作点（面）信息表")
    @PostMapping()
    public int add(@RequestBody Worksite worksite){
        return worksiteService.add(worksite);
    }

    @ApiOperation(value = "删除工作点（面）信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return worksiteService.delete(id);
    }

    @ApiOperation(value = "更新工作点（面）信息表")
    @PutMapping()
    public int update(@RequestBody Worksite worksite){
        return worksiteService.updateData(worksite);
    }

    @ApiOperation(value = "查询工作点（面）信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Worksite> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return worksiteService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询工作点（面）信息表")
    @GetMapping("{id}")
    public Worksite findById(@PathVariable Long id){
        return worksiteService.findById(id);
    }

}
