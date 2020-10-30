package com.dkkj.wisdomsite.tunnel.modules.tunnel.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 隧道信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_tunnel")
@ApiModel(value="Tunnel对象", description="隧道信息表")
public class Tunnel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "标段编码")
    private String sectionCode;

    @ApiModelProperty(value = "隧道名称")
    private String tunnelName;

    @ApiModelProperty(value = "隧道编码")
    private String tunnelCode;

    @ApiModelProperty(value = "风险评估等级（字典ID）")
    private Integer riskGrade;

    @ApiModelProperty(value = "隧道类型（字典ID）")
    private Integer tunnelType;

    @ApiModelProperty(value = "左起始里程(整体隧道默认用左隧道)")
    private Integer leftStartMileage;

    @ApiModelProperty(value = "左结束里程(单位：米)")
    private Integer leftEntMileage;

    @ApiModelProperty(value = "右起始里程")
    private Integer rightStartMileage;

    @ApiModelProperty(value = "右结束里程")
    private Integer rightEndMileage;

    @ApiModelProperty(value = "掘进方式")
    private String excavateType;

    @ApiModelProperty(value = "计划工期")
    private BigDecimal planDate;

    @ApiModelProperty(value = "负责人")
    private String manager;

    @ApiModelProperty(value = "负责人电话")
    private String managerPhone;

    @ApiModelProperty(value = "隧道图片")
    private String tunnelPic;

    @ApiModelProperty(value = "隧道概况")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "数据状态：0正常，1删除")
    private Integer delFlag;


}
