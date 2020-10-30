package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Tunnel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface ITunnelService extends IService<Tunnel> {

    /**
     * 查询隧道信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Tunnel>
     */
    IPage<Tunnel> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道信息表
     *
     * @param tunnel 隧道信息表
     * @return int
     */
    int add(Tunnel tunnel);

    /**
     * 删除隧道信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道信息表
     *
     * @param tunnel 隧道信息表
     * @return int
     */
    int updateData(Tunnel tunnel);

    /**
     * id查询数据
     *
     * @param id id
     * @return Tunnel
     */
    Tunnel findById(Long id);
}
