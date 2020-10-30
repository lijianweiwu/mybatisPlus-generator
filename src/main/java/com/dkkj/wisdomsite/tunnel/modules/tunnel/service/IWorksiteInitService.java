package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteInit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 工点初始化信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IWorksiteInitService extends IService<WorksiteInit> {

    /**
     * 查询工点初始化信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WorksiteInit>
     */
    IPage<WorksiteInit> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加工点初始化信息表
     *
     * @param worksiteInit 工点初始化信息表
     * @return int
     */
    int add(WorksiteInit worksiteInit);

    /**
     * 删除工点初始化信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改工点初始化信息表
     *
     * @param worksiteInit 工点初始化信息表
     * @return int
     */
    int updateData(WorksiteInit worksiteInit);

    /**
     * id查询数据
     *
     * @param id id
     * @return WorksiteInit
     */
    WorksiteInit findById(Long id);
}
