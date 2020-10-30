package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteInit;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.WorksiteInitMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteInitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 工点初始化信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class WorksiteInitServiceImpl extends ServiceImpl<WorksiteInitMapper, WorksiteInit> implements IWorksiteInitService {

    @Override
    public  IPage<WorksiteInit> findListByPage(Integer page, Integer pageCount){
        IPage<WorksiteInit> wherePage = new Page<>(page, pageCount);
        WorksiteInit where = new WorksiteInit();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WorksiteInit worksiteInit){
        return baseMapper.insert(worksiteInit);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WorksiteInit worksiteInit){
        return baseMapper.updateById(worksiteInit);
    }

    @Override
    public WorksiteInit findById(Long id){
        return  baseMapper.selectById(id);
    }
}
