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
 * 标段信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_section")
@ApiModel(value="Section对象", description="标段信息表")
public class Section implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "项目编码")
    private String projectCode;

    @ApiModelProperty(value = "标段名称")
    private String sectionName;

    @ApiModelProperty(value = "标段简称")
    private String sectionShortName;

    @ApiModelProperty(value = "标段类型")
    private String sectionType;

    @ApiModelProperty(value = "标段编码")
    private String sectionCode;

    @ApiModelProperty(value = "起点里程")
    private String startMileage;

    @ApiModelProperty(value = "终点里程")
    private String endMileage;

    @ApiModelProperty(value = "标段长度")
    private BigDecimal sectionLength;

    @ApiModelProperty(value = "计划开工日期")
    private String startDate;

    @ApiModelProperty(value = "计划竣工日期")
    private String endDate;

    @ApiModelProperty(value = "施工单位名称")
    private String buildOrg;

    @ApiModelProperty(value = "负责人")
    private String manager;

    @ApiModelProperty(value = "联系电话")
    private String managerPhone;

    @ApiModelProperty(value = "标段位置")
    private String sectionAddr;

    @ApiModelProperty(value = "标段概况")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态：0正常，1删除")
    private Integer delFlag;


}
