package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteFill;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 工点填报记录表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IWorksiteFillService extends IService<WorksiteFill> {

    /**
     * 查询工点填报记录表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WorksiteFill>
     */
    IPage<WorksiteFill> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加工点填报记录表
     *
     * @param worksiteFill 工点填报记录表
     * @return int
     */
    int add(WorksiteFill worksiteFill);

    /**
     * 删除工点填报记录表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改工点填报记录表
     *
     * @param worksiteFill 工点填报记录表
     * @return int
     */
    int updateData(WorksiteFill worksiteFill);

    /**
     * id查询数据
     *
     * @param id id
     * @return WorksiteFill
     */
    WorksiteFill findById(Long id);
}
