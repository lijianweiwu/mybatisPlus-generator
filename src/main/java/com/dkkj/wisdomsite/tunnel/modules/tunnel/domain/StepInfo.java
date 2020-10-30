package com.dkkj.wisdomsite.tunnel.modules.tunnel.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 安全步距信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_step_info")
@ApiModel(value="StepInfo对象", description="安全步距信息表")
public class StepInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    private Integer id;

    @ApiModelProperty(value = "工点id")
    private String worksiteCode;

    @ApiModelProperty(value = "实际围岩等级")
    private String actualDangerLevel;

    @ApiModelProperty(value = "允许步距")
    private String allowStep;

    @ApiModelProperty(value = "实际步距")
    private String actualStep;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志:1为删除")
    private Integer delFlag;


}
