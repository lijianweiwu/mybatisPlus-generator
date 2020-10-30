package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.AccessRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道门禁访问记录 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IAccessRecordService extends IService<AccessRecord> {

    /**
     * 查询隧道门禁访问记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<AccessRecord>
     */
    IPage<AccessRecord> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道门禁访问记录
     *
     * @param accessRecord 隧道门禁访问记录
     * @return int
     */
    int add(AccessRecord accessRecord);

    /**
     * 删除隧道门禁访问记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道门禁访问记录
     *
     * @param accessRecord 隧道门禁访问记录
     * @return int
     */
    int updateData(AccessRecord accessRecord);

    /**
     * id查询数据
     *
     * @param id id
     * @return AccessRecord
     */
    AccessRecord findById(Long id);
}
