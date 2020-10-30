package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IAccessRecordService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.AccessRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 隧道门禁访问记录 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"隧道门禁访问记录"})
@RestController
@RequestMapping("/access-record")
public class AccessRecordController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IAccessRecordService accessRecordService;


    @ApiOperation(value = "新增隧道门禁访问记录")
    @PostMapping()
    public int add(@RequestBody AccessRecord accessRecord){
        return accessRecordService.add(accessRecord);
    }

    @ApiOperation(value = "删除隧道门禁访问记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return accessRecordService.delete(id);
    }

    @ApiOperation(value = "更新隧道门禁访问记录")
    @PutMapping()
    public int update(@RequestBody AccessRecord accessRecord){
        return accessRecordService.updateData(accessRecord);
    }

    @ApiOperation(value = "查询隧道门禁访问记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<AccessRecord> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return accessRecordService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询隧道门禁访问记录")
    @GetMapping("{id}")
    public AccessRecord findById(@PathVariable Long id){
        return accessRecordService.findById(id);
    }

}
