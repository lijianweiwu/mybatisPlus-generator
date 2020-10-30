package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.AccessRecord;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.AccessRecordMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IAccessRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 隧道门禁访问记录 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class AccessRecordServiceImpl extends ServiceImpl<AccessRecordMapper, AccessRecord> implements IAccessRecordService {

    @Override
    public  IPage<AccessRecord> findListByPage(Integer page, Integer pageCount){
        IPage<AccessRecord> wherePage = new Page<>(page, pageCount);
        AccessRecord where = new AccessRecord();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(AccessRecord accessRecord){
        return baseMapper.insert(accessRecord);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(AccessRecord accessRecord){
        return baseMapper.updateById(accessRecord);
    }

    @Override
    public AccessRecord findById(Long id){
        return  baseMapper.selectById(id);
    }
}
