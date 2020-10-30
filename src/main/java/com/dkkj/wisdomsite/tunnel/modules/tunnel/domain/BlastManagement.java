package com.dkkj.wisdomsite.tunnel.modules.tunnel.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 隧道爆破管理
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_blast_management")
@ApiModel(value="BlastManagement对象", description="隧道爆破管理")
public class BlastManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "工点编码")
    private String worksiteCode;

    @ApiModelProperty(value = "填报人员(系统登录者、设备编码)")
    private String fillUserCode;

    @ApiModelProperty(value = "填表类型：0设备填报，1人工填报")
    private Integer fillType;

    @ApiModelProperty(value = "爆破状态：1：钻孔装药，2：爆破排危，3：安全出渣")
    private Integer blastStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志：1:为删除")
    private Integer delFlag;


}
