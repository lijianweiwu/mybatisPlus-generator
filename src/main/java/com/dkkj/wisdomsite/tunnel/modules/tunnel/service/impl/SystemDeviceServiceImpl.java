package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.SystemDevice;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.SystemDeviceMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ISystemDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道系统设备 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class SystemDeviceServiceImpl extends ServiceImpl<SystemDeviceMapper, SystemDevice> implements ISystemDeviceService {

    @Override
    public  IPage<SystemDevice> findListByPage(Integer page, Integer pageCount){
        IPage<SystemDevice> wherePage = new Page<>(page, pageCount);
        SystemDevice where = new SystemDevice();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SystemDevice systemDevice){
        return baseMapper.insert(systemDevice);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SystemDevice systemDevice){
        return baseMapper.updateById(systemDevice);
    }

    @Override
    public SystemDevice findById(Long id){
        return  baseMapper.selectById(id);
    }
}
