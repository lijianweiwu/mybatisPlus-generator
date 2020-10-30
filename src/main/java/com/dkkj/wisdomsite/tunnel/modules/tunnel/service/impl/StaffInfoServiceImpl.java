package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.StaffInfo;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.StaffInfoMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IStaffInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道人员信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class StaffInfoServiceImpl extends ServiceImpl<StaffInfoMapper, StaffInfo> implements IStaffInfoService {

    @Override
    public  IPage<StaffInfo> findListByPage(Integer page, Integer pageCount){
        IPage<StaffInfo> wherePage = new Page<>(page, pageCount);
        StaffInfo where = new StaffInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(StaffInfo staffInfo){
        return baseMapper.insert(staffInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(StaffInfo staffInfo){
        return baseMapper.updateById(staffInfo);
    }

    @Override
    public StaffInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
