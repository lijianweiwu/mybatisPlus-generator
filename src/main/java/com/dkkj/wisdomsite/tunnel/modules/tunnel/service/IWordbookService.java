package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Wordbook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 字典表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IWordbookService extends IService<Wordbook> {

    /**
     * 查询字典表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Wordbook>
     */
    IPage<Wordbook> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加字典表
     *
     * @param wordbook 字典表
     * @return int
     */
    int add(Wordbook wordbook);

    /**
     * 删除字典表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改字典表
     *
     * @param wordbook 字典表
     * @return int
     */
    int updateData(Wordbook wordbook);

    /**
     * id查询数据
     *
     * @param id id
     * @return Wordbook
     */
    Wordbook findById(Long id);
}
