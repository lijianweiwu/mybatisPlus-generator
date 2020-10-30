package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Worksite;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.WorksiteMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 工作点（面）信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class WorksiteServiceImpl extends ServiceImpl<WorksiteMapper, Worksite> implements IWorksiteService {

    @Override
    public  IPage<Worksite> findListByPage(Integer page, Integer pageCount){
        IPage<Worksite> wherePage = new Page<>(page, pageCount);
        Worksite where = new Worksite();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Worksite worksite){
        return baseMapper.insert(worksite);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Worksite worksite){
        return baseMapper.updateById(worksite);
    }

    @Override
    public Worksite findById(Long id){
        return  baseMapper.selectById(id);
    }
}
