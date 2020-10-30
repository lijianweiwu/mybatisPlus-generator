package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.SystemDevice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道系统设备 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface ISystemDeviceService extends IService<SystemDevice> {

    /**
     * 查询隧道系统设备分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SystemDevice>
     */
    IPage<SystemDevice> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道系统设备
     *
     * @param systemDevice 隧道系统设备
     * @return int
     */
    int add(SystemDevice systemDevice);

    /**
     * 删除隧道系统设备
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道系统设备
     *
     * @param systemDevice 隧道系统设备
     * @return int
     */
    int updateData(SystemDevice systemDevice);

    /**
     * id查询数据
     *
     * @param id id
     * @return SystemDevice
     */
    SystemDevice findById(Long id);
}
