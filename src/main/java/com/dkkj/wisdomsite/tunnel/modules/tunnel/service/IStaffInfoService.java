package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StaffInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道人员信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IStaffInfoService extends IService<StaffInfo> {

    /**
     * 查询隧道人员信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<StaffInfo>
     */
    IPage<StaffInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道人员信息表
     *
     * @param staffInfo 隧道人员信息表
     * @return int
     */
    int add(StaffInfo staffInfo);

    /**
     * 删除隧道人员信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道人员信息表
     *
     * @param staffInfo 隧道人员信息表
     * @return int
     */
    int updateData(StaffInfo staffInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return StaffInfo
     */
    StaffInfo findById(Long id);
}
