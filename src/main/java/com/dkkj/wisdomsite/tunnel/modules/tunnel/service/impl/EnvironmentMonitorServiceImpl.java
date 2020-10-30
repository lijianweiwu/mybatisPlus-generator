package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.EnvironmentMonitor;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.EnvironmentMonitorMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IEnvironmentMonitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道环境监测 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class EnvironmentMonitorServiceImpl extends ServiceImpl<EnvironmentMonitorMapper, EnvironmentMonitor> implements IEnvironmentMonitorService {

    @Override
    public  IPage<EnvironmentMonitor> findListByPage(Integer page, Integer pageCount){
        IPage<EnvironmentMonitor> wherePage = new Page<>(page, pageCount);
        EnvironmentMonitor where = new EnvironmentMonitor();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(EnvironmentMonitor environmentMonitor){
        return baseMapper.insert(environmentMonitor);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(EnvironmentMonitor environmentMonitor){
        return baseMapper.updateById(environmentMonitor);
    }

    @Override
    public EnvironmentMonitor findById(Long id){
        return  baseMapper.selectById(id);
    }
}
