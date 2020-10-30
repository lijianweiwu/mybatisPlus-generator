package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Project;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.ProjectMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 项目信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements IProjectService {

    @Override
    public  IPage<Project> findListByPage(Integer page, Integer pageCount){
        IPage<Project> wherePage = new Page<>(page, pageCount);
        Project where = new Project();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Project project){
        return baseMapper.insert(project);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Project project){
        return baseMapper.updateById(project);
    }

    @Override
    public Project findById(Long id){
        return  baseMapper.selectById(id);
    }
}
