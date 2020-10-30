package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Section;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 标段信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface ISectionService extends IService<Section> {

    /**
     * 查询标段信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Section>
     */
    IPage<Section> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加标段信息表
     *
     * @param section 标段信息表
     * @return int
     */
    int add(Section section);

    /**
     * 删除标段信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改标段信息表
     *
     * @param section 标段信息表
     * @return int
     */
    int updateData(Section section);

    /**
     * id查询数据
     *
     * @param id id
     * @return Section
     */
    Section findById(Long id);
}
