package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Project;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 项目信息表 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IProjectService extends IService<Project> {

    /**
     * 查询项目信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Project>
     */
    IPage<Project> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加项目信息表
     *
     * @param project 项目信息表
     * @return int
     */
    int add(Project project);

    /**
     * 删除项目信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改项目信息表
     *
     * @param project 项目信息表
     * @return int
     */
    int updateData(Project project);

    /**
     * id查询数据
     *
     * @param id id
     * @return Project
     */
    Project findById(Long id);
}
