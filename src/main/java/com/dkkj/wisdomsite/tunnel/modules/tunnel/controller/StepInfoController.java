package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IStepInfoService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StepInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 安全步距信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"安全步距信息表"})
@RestController
@RequestMapping("/step-info")
public class StepInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IStepInfoService stepInfoService;


    @ApiOperation(value = "新增安全步距信息表")
    @PostMapping()
    public int add(@RequestBody StepInfo stepInfo){
        return stepInfoService.add(stepInfo);
    }

    @ApiOperation(value = "删除安全步距信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return stepInfoService.delete(id);
    }

    @ApiOperation(value = "更新安全步距信息表")
    @PutMapping()
    public int update(@RequestBody StepInfo stepInfo){
        return stepInfoService.updateData(stepInfo);
    }

    @ApiOperation(value = "查询安全步距信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<StepInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return stepInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询安全步距信息表")
    @GetMapping("{id}")
    public StepInfo findById(@PathVariable Long id){
        return stepInfoService.findById(id);
    }

}
