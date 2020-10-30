package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IElectronicPositionService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.ElectronicPosition;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道电子定位器 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道电子定位器"})
@RestController
@RequestMapping("/electronic-position")
public class ElectronicPositionController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IElectronicPositionService electronicPositionService;


    @ApiOperation(value = "新增隧道电子定位器")
    @PostMapping()
    public int add(@RequestBody ElectronicPosition electronicPosition){
        return electronicPositionService.add(electronicPosition);
    }

    @ApiOperation(value = "删除隧道电子定位器")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return electronicPositionService.delete(id);
    }

    @ApiOperation(value = "更新隧道电子定位器")
    @PutMapping()
    public int update(@RequestBody ElectronicPosition electronicPosition){
        return electronicPositionService.updateData(electronicPosition);
    }

    @ApiOperation(value = "查询隧道电子定位器分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<ElectronicPosition> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return electronicPositionService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道电子定位器")
    @GetMapping("{id}")
    public ElectronicPosition findById(@PathVariable Long id){
        return electronicPositionService.findById(id);
    }

}
