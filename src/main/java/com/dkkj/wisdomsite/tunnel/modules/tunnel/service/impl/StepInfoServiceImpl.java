package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StepInfo;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.StepInfoMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IStepInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 安全步距信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class StepInfoServiceImpl extends ServiceImpl<StepInfoMapper, StepInfo> implements IStepInfoService {

    @Override
    public  IPage<StepInfo> findListByPage(Integer page, Integer pageCount){
        IPage<StepInfo> wherePage = new Page<>(page, pageCount);
        StepInfo where = new StepInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(StepInfo stepInfo){
        return baseMapper.insert(stepInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(StepInfo stepInfo){
        return baseMapper.updateById(stepInfo);
    }

    @Override
    public StepInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
