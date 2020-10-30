package com.dkkj.wisdomsite.tunnel.modules.tunnel.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWordbookService;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Wordbook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 字典表 前端控制器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Api(tags = {"字典表"})
@RestController
@RequestMapping("/wordbook")
public class WordbookController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWordbookService wordbookService;


    @ApiOperation(value = "新增字典表")
    @PostMapping()
    public int add(@RequestBody Wordbook wordbook){
        return wordbookService.add(wordbook);
    }

    @ApiOperation(value = "删除字典表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return wordbookService.delete(id);
    }

    @ApiOperation(value = "更新字典表")
    @PutMapping()
    public int update(@RequestBody Wordbook wordbook){
        return wordbookService.updateData(wordbook);
    }

    @ApiOperation(value = "查询字典表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Wordbook> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return wordbookService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询字典表")
    @GetMapping("{id}")
    public Wordbook findById(@PathVariable Long id){
        return wordbookService.findById(id);
    }

}
