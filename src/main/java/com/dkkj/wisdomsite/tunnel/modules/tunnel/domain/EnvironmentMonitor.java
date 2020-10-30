package com.dkkj.wisdomsite.tunnel.modules.tunnel.domain;

import java.math.BigDecimal;
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
 * 隧道环境监测
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_environment_monitor")
@ApiModel(value="EnvironmentMonitor对象", description="隧道环境监测")
public class EnvironmentMonitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "工点编码")
    private String worksiteCode;

    @ApiModelProperty(value = "一氧化碳浓度")
    private BigDecimal gasCo;

    @ApiModelProperty(value = "二氧化碳浓度")
    private BigDecimal gasCo2;

    @ApiModelProperty(value = "硫化氢浓度")
    private BigDecimal gasH2s;

    @ApiModelProperty(value = "甲烷浓度")
    private BigDecimal gasCh4;

    @ApiModelProperty(value = "报警级别")
    private Integer alarmLevel;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志：1为删除")
    private Integer delFlag;


}
