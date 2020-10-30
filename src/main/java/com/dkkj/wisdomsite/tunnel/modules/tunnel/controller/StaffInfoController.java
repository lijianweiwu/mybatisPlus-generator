package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IStaffInfoService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StaffInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道人员信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道人员信息表"})
@RestController
@RequestMapping("/staff-info")
public class StaffInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IStaffInfoService staffInfoService;


    @ApiOperation(value = "新增隧道人员信息表")
    @PostMapping()
    public int add(@RequestBody StaffInfo staffInfo){
        return staffInfoService.add(staffInfo);
    }

    @ApiOperation(value = "删除隧道人员信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return staffInfoService.delete(id);
    }

    @ApiOperation(value = "更新隧道人员信息表")
    @PutMapping()
    public int update(@RequestBody StaffInfo staffInfo){
        return staffInfoService.updateData(staffInfo);
    }

    @ApiOperation(value = "查询隧道人员信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<StaffInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return staffInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道人员信息表")
    @GetMapping("{id}")
    public StaffInfo findById(@PathVariable Long id){
        return staffInfoService.findById(id);
    }

}
