package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Process;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.ProcessMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IProcessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道施工工序 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class ProcessServiceImpl extends ServiceImpl<ProcessMapper, Process> implements IProcessService {

    @Override
    public  IPage<Process> findListByPage(Integer page, Integer pageCount){
        IPage<Process> wherePage = new Page<>(page, pageCount);
        Process where = new Process();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Process process){
        return baseMapper.insert(process);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Process process){
        return baseMapper.updateById(process);
    }

    @Override
    public Process findById(Long id){
        return  baseMapper.selectById(id);
    }
}
