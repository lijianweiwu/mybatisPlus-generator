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
 * 工点填报记录表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_worksite_fill")
@ApiModel(value="WorksiteFill对象", description="工点填报记录表")
public class WorksiteFill implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "工点编码")
    private String worksiteCode;

    @ApiModelProperty(value = "填报日期")
    private String fillDate;

    @ApiModelProperty(value = "填报人员（默认操作用户）")
    private String fillUser;

    @ApiModelProperty(value = "掌子面前端里程")
    private String tunnelFaceMileage;

    @ApiModelProperty(value = "实际危岩等级")
    private String realityDangerLevel;

    @ApiModelProperty(value = "开挖功法")
    private String excavateMedth;

    @ApiModelProperty(value = "上台阶左侧里程桩号")
    private String upLeftMileage;

    @ApiModelProperty(value = "上台阶右侧里程桩号")
    private String upRightMileage;

    @ApiModelProperty(value = "下台阶左侧里程桩号")
    private String downLeftMileage;

    @ApiModelProperty(value = "下台阶右侧里程桩号")
    private String downRightMileage;

    @ApiModelProperty(value = "仰拱前端里程")
    private String inflectedArchMileage;

    @ApiModelProperty(value = "二衬前端里程")
    private String secondLineMileage;

    @ApiModelProperty(value = "其他备注信息")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态：0正常，1删除")
    private Integer delFlag;

    @ApiModelProperty(value = "左线:1，右线:2，整体式隧道为NULL")
    private String worksiteTunnelType;


}
