package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.WorksiteFill;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.WorksiteFillMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWorksiteFillService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 工点填报记录表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class WorksiteFillServiceImpl extends ServiceImpl<WorksiteFillMapper, WorksiteFill> implements IWorksiteFillService {

    @Override
    public  IPage<WorksiteFill> findListByPage(Integer page, Integer pageCount){
        IPage<WorksiteFill> wherePage = new Page<>(page, pageCount);
        WorksiteFill where = new WorksiteFill();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WorksiteFill worksiteFill){
        return baseMapper.insert(worksiteFill);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WorksiteFill worksiteFill){
        return baseMapper.updateById(worksiteFill);
    }

    @Override
    public WorksiteFill findById(Long id){
        return  baseMapper.selectById(id);
    }
}
