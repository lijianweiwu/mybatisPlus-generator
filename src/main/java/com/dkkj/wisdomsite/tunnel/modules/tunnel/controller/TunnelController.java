package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ITunnelService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Tunnel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道信息表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道信息表"})
@RestController
@RequestMapping("/tunnel")
public class TunnelController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ITunnelService tunnelService;


    @ApiOperation(value = "新增隧道信息表")
    @PostMapping()
    public int add(@RequestBody Tunnel tunnel){
        return tunnelService.add(tunnel);
    }

    @ApiOperation(value = "删除隧道信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return tunnelService.delete(id);
    }

    @ApiOperation(value = "更新隧道信息表")
    @PutMapping()
    public int update(@RequestBody Tunnel tunnel){
        return tunnelService.updateData(tunnel);
    }

    @ApiOperation(value = "查询隧道信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Tunnel> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return tunnelService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道信息表")
    @GetMapping("{id}")
    public Tunnel findById(@PathVariable Long id){
        return tunnelService.findById(id);
    }

}
