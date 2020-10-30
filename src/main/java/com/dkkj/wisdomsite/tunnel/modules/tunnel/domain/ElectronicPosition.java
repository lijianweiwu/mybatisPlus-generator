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
 * 隧道电子定位器
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_electronic_position")
@ApiModel(value="ElectronicPosition对象", description="隧道电子定位器")
public class ElectronicPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "人员/车辆编码")
    private String dataCode;

    @ApiModelProperty(value = "数据类型：0人员，1车辆")
    private Integer dataType;

    @ApiModelProperty(value = "当前位置")
    private Integer currentPosition;

    @ApiModelProperty(value = "报警状态：0正常，1报警")
    private Integer status;

    @ApiModelProperty(value = "滞留时间")
    private BigDecimal residenceTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志:0正常，1为删除")
    private Integer delFlag;


}
