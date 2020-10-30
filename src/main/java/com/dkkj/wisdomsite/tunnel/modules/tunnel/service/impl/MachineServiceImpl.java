package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Machine;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.MachineMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IMachineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道作业设备 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class MachineServiceImpl extends ServiceImpl<MachineMapper, Machine> implements IMachineService {

    @Override
    public  IPage<Machine> findListByPage(Integer page, Integer pageCount){
        IPage<Machine> wherePage = new Page<>(page, pageCount);
        Machine where = new Machine();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Machine machine){
        return baseMapper.insert(machine);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Machine machine){
        return baseMapper.updateById(machine);
    }

    @Override
    public Machine findById(Long id){
        return  baseMapper.selectById(id);
    }
}
