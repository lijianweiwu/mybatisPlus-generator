package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ISystemDeviceService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.SystemDevice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道系统设备 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道系统设备"})
@RestController
@RequestMapping("/system-device")
public class SystemDeviceController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISystemDeviceService systemDeviceService;


    @ApiOperation(value = "新增隧道系统设备")
    @PostMapping()
    public int add(@RequestBody SystemDevice systemDevice){
        return systemDeviceService.add(systemDevice);
    }

    @ApiOperation(value = "删除隧道系统设备")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return systemDeviceService.delete(id);
    }

    @ApiOperation(value = "更新隧道系统设备")
    @PutMapping()
    public int update(@RequestBody SystemDevice systemDevice){
        return systemDeviceService.updateData(systemDevice);
    }

    @ApiOperation(value = "查询隧道系统设备分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SystemDevice> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return systemDeviceService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道系统设备")
    @GetMapping("{id}")
    public SystemDevice findById(@PathVariable Long id){
        return systemDeviceService.findById(id);
    }

}
