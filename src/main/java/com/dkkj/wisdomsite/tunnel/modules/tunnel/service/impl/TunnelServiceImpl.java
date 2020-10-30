package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Tunnel;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.TunnelMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ITunnelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class TunnelServiceImpl extends ServiceImpl<TunnelMapper, Tunnel> implements ITunnelService {

    @Override
    public  IPage<Tunnel> findListByPage(Integer page, Integer pageCount){
        IPage<Tunnel> wherePage = new Page<>(page, pageCount);
        Tunnel where = new Tunnel();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Tunnel tunnel){
        return baseMapper.insert(tunnel);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Tunnel tunnel){
        return baseMapper.updateById(tunnel);
    }

    @Override
    public Tunnel findById(Long id){
        return  baseMapper.selectById(id);
    }
}
