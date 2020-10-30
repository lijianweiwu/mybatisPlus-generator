package com.dkkj.wisdomsite.tunnel.modules.tunnel.service;

import com.dkkj.wisdomsite.tunnel.modules.tunnel.domain.Process;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 隧道施工工序 服务类
 *
 * @author lijian
 * @since 2020-10-30
 */
public interface IProcessService extends IService<Process> {

    /**
     * 查询隧道施工工序分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Process>
     */
    IPage<Process> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加隧道施工工序
     *
     * @param process 隧道施工工序
     * @return int
     */
    int add(Process process);

    /**
     * 删除隧道施工工序
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改隧道施工工序
     *
     * @param process 隧道施工工序
     * @return int
     */
    int updateData(Process process);

    /**
     * id查询数据
     *
     * @param id id
     * @return Process
     */
    Process findById(Long id);
}
