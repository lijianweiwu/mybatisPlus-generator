package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Section;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.SectionMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.ISectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 标段信息表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class SectionServiceImpl extends ServiceImpl<SectionMapper, Section> implements ISectionService {

    @Override
    public  IPage<Section> findListByPage(Integer page, Integer pageCount){
        IPage<Section> wherePage = new Page<>(page, pageCount);
        Section where = new Section();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Section section){
        return baseMapper.insert(section);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Section section){
        return baseMapper.updateById(section);
    }

    @Override
    public Section findById(Long id){
        return  baseMapper.selectById(id);
    }
}
