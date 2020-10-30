package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteFillService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteFill;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 工点填报记录表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"工点填报记录表"})
@RestController
@RequestMapping("/worksite-fill")
public class WorksiteFillController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWorksiteFillService worksiteFillService;


    @ApiOperation(value = "新增工点填报记录表")
    @PostMapping()
    public int add(@RequestBody WorksiteFill worksiteFill){
        return worksiteFillService.add(worksiteFill);
    }

    @ApiOperation(value = "删除工点填报记录表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return worksiteFillService.delete(id);
    }

    @ApiOperation(value = "更新工点填报记录表")
    @PutMapping()
    public int update(@RequestBody WorksiteFill worksiteFill){
        return worksiteFillService.updateData(worksiteFill);
    }

    @ApiOperation(value = "查询工点填报记录表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WorksiteFill> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return worksiteFillService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询工点填报记录表")
    @GetMapping("{id}")
    public WorksiteFill findById(@PathVariable Long id){
        return worksiteFillService.findById(id);
    }

}
