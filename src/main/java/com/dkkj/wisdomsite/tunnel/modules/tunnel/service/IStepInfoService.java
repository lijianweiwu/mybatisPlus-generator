package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StepInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 安全步距信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IStepInfoService extends IService<StepInfo> {

    /**
     * 查询安全步距信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<StepInfo>
     */
    IPage<StepInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加安全步距信息表
     *
     * @param stepInfo 安全步距信息表
     * @return int
     */
    int add(StepInfo stepInfo);

    /**
     * 删除安全步距信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改安全步距信息表
     *
     * @param stepInfo 安全步距信息表
     * @return int
     */
    int updateData(StepInfo stepInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return StepInfo
     */
    StepInfo findById(Long id);
}
