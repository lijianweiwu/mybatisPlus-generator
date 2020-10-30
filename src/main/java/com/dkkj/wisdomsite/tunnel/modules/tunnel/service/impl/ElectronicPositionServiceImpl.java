package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.ElectronicPosition;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.ElectronicPositionMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IElectronicPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道电子定位器 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class ElectronicPositionServiceImpl extends ServiceImpl<ElectronicPositionMapper, ElectronicPosition> implements IElectronicPositionService {

    @Override
    public  IPage<ElectronicPosition> findListByPage(Integer page, Integer pageCount){
        IPage<ElectronicPosition> wherePage = new Page<>(page, pageCount);
        ElectronicPosition where = new ElectronicPosition();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(ElectronicPosition electronicPosition){
        return baseMapper.insert(electronicPosition);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(ElectronicPosition electronicPosition){
        return baseMapper.updateById(electronicPosition);
    }

    @Override
    public ElectronicPosition findById(Long id){
        return  baseMapper.selectById(id);
    }
}
