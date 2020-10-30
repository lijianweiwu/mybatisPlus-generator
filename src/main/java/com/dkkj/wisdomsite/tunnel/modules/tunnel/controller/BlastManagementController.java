package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IBlastManagementService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.BlastManagement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道爆破管理 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道爆破管理"})
@RestController
@RequestMapping("/blast-management")
public class BlastManagementController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IBlastManagementService blastManagementService;


    @ApiOperation(value = "新增隧道爆破管理")
    @PostMapping()
    public int add(@RequestBody BlastManagement blastManagement){
        return blastManagementService.add(blastManagement);
    }

    @ApiOperation(value = "删除隧道爆破管理")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return blastManagementService.delete(id);
    }

    @ApiOperation(value = "更新隧道爆破管理")
    @PutMapping()
    public int update(@RequestBody BlastManagement blastManagement){
        return blastManagementService.updateData(blastManagement);
    }

    @ApiOperation(value = "查询隧道爆破管理分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<BlastManagement> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return blastManagementService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道爆破管理")
    @GetMapping("{id}")
    public BlastManagement findById(@PathVariable Long id){
        return blastManagementService.findById(id);
    }

}
