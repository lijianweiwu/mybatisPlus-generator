package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Machine;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道作业设备 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IMachineService extends IService<Machine> {

    /**
     * 查询隧道作业设备分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Machine>
     */
    IPage<Machine> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道作业设备
     *
     * @param machine 隧道作业设备
     * @return int
     */
    int add(Machine machine);

    /**
     * 删除隧道作业设备
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道作业设备
     *
     * @param machine 隧道作业设备
     * @return int
     */
    int updateData(Machine machine);

    /**
     * id查询数据
     *
     * @param id id
     * @return Machine
     */
    Machine findById(Long id);
}
