package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ISectionService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Section;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 标段信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"标段信息表"})
@RestController
@RequestMapping("/section")
public class SectionController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISectionService sectionService;


    @ApiOperation(value = "新增标段信息表")
    @PostMapping()
    public int add(@RequestBody Section section){
        return sectionService.add(section);
    }

    @ApiOperation(value = "删除标段信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return sectionService.delete(id);
    }

    @ApiOperation(value = "更新标段信息表")
    @PutMapping()
    public int update(@RequestBody Section section){
        return sectionService.updateData(section);
    }

    @ApiOperation(value = "查询标段信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Section> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return sectionService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询标段信息表")
    @GetMapping("{id}")
    public Section findById(@PathVariable Long id){
        return sectionService.findById(id);
    }

}
