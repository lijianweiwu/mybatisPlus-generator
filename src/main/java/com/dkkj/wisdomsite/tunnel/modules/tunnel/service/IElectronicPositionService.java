package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.ElectronicPosition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道电子定位器 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IElectronicPositionService extends IService<ElectronicPosition> {

    /**
     * 查询隧道电子定位器分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<ElectronicPosition>
     */
    IPage<ElectronicPosition> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道电子定位器
     *
     * @param electronicPosition 隧道电子定位器
     * @return int
     */
    int add(ElectronicPosition electronicPosition);

    /**
     * 删除隧道电子定位器
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道电子定位器
     *
     * @param electronicPosition 隧道电子定位器
     * @return int
     */
    int updateData(ElectronicPosition electronicPosition);

    /**
     * id查询数据
     *
     * @param id id
     * @return ElectronicPosition
     */
    ElectronicPosition findById(Long id);
}
