package com.dkkj.wisdomsite.tunnel.modules.tunnel.service.impl;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Wordbook;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.mapper.WordbookMapper;
import com.dkkj.wisdomsite.tunnel.modules.tunnel.service.IWordbookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * 字典表 服务实现类
 *
 * @author lijian
 * @since 2020-10-30
 */
@Service
public class WordbookServiceImpl extends ServiceImpl<WordbookMapper, Wordbook> implements IWordbookService {

    @Override
    public  IPage<Wordbook> findListByPage(Integer page, Integer pageCount){
        IPage<Wordbook> wherePage = new Page<>(page, pageCount);
        Wordbook where = new Wordbook();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Wordbook wordbook){
        return baseMapper.insert(wordbook);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Wordbook wordbook){
        return baseMapper.updateById(wordbook);
    }

    @Override
    public Wordbook findById(Long id){
        return  baseMapper.selectById(id);
    }
}
