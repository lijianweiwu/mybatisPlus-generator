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
 * 项目信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_project")
@ApiModel(value="Project对象", description="项目信息表")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "项目编码")
    private String projectCode;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目简称")
    private String projectShortName;

    @ApiModelProperty(value = "项目类别")
    private String projectType;

    @ApiModelProperty(value = "线路长度")
    private BigDecimal projectLength;

    @ApiModelProperty(value = "项目工期")
    private BigDecimal projectDate;

    @ApiModelProperty(value = "管理机构")
    private String managerOrg;

    @ApiModelProperty(value = "项目状态")
    private Integer projectStatus;

    @ApiModelProperty(value = "责任人")
    private String manager;

    @ApiModelProperty(value = "责任人联系电话")
    private String managerPerson;

    @ApiModelProperty(value = "项目图片")
    private String projectImgs;

    @ApiModelProperty(value = "项目概况")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态：0正常，1删除")
    private Integer delFlag;


}
