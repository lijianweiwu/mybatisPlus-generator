package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.EnvironmentMonitor;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道环境监测 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IEnvironmentMonitorService extends IService<EnvironmentMonitor> {

    /**
     * 查询隧道环境监测分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<EnvironmentMonitor>
     */
    IPage<EnvironmentMonitor> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道环境监测
     *
     * @param environmentMonitor 隧道环境监测
     * @return int
     */
    int add(EnvironmentMonitor environmentMonitor);

    /**
     * 删除隧道环境监测
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道环境监测
     *
     * @param environmentMonitor 隧道环境监测
     * @return int
     */
    int updateData(EnvironmentMonitor environmentMonitor);

    /**
     * id查询数据
     *
     * @param id id
     * @return EnvironmentMonitor
     */
    EnvironmentMonitor findById(Long id);
}
