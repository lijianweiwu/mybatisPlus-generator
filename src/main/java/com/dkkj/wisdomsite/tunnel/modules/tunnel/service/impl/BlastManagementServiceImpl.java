package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.BlastManagement;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.BlastManagementMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IBlastManagementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道爆破管理 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class BlastManagementServiceImpl extends ServiceImpl<BlastManagementMapper, BlastManagement> implements IBlastManagementService {

    @Override
    public  IPage<BlastManagement> findListByPage(Integer page, Integer pageCount){
        IPage<BlastManagement> wherePage = new Page<>(page, pageCount);
        BlastManagement where = new BlastManagement();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(BlastManagement blastManagement){
        return baseMapper.insert(blastManagement);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(BlastManagement blastManagement){
        return baseMapper.updateById(blastManagement);
    }

    @Override
    public BlastManagement findById(Long id){
        return  baseMapper.selectById(id);
    }
}
