package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.BlastManagement;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道爆破管理 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IBlastManagementService extends IService<BlastManagement> {

    /**
     * 查询隧道爆破管理分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<BlastManagement>
     */
    IPage<BlastManagement> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道爆破管理
     *
     * @param blastManagement 隧道爆破管理
     * @return int
     */
    int add(BlastManagement blastManagement);

    /**
     * 删除隧道爆破管理
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道爆破管理
     *
     * @param blastManagement 隧道爆破管理
     * @return int
     */
    int updateData(BlastManagement blastManagement);

    /**
     * id查询数据
     *
     * @param id id
     * @return BlastManagement
     */
    BlastManagement findById(Long id);
}
