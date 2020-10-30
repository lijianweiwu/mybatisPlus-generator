package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Worksite;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 工作点（面）信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IWorksiteService extends IService<Worksite> {

    /**
     * 查询工作点（面）信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Worksite>
     */
    IPage<Worksite> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加工作点（面）信息表
     *
     * @param worksite 工作点（面）信息表
     * @return int
     */
    int add(Worksite worksite);

    /**
     * 删除工作点（面）信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改工作点（面）信息表
     *
     * @param worksite 工作点（面）信息表
     * @return int
     */
    int updateData(Worksite worksite);

    /**
     * id查询数据
     *
     * @param id id
     * @return Worksite
     */
    Worksite findById(Long id);
}
