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
 * 工点初始化信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_worksite_init")
@ApiModel(value="WorksiteInit对象", description="工点初始化信息表")
public class WorksiteInit implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "工作面编码")
    private String worksiteCode;

    @ApiModelProperty(value = "开始里程")
    private String startMileage;

    @ApiModelProperty(value = "结束里程")
    private String endMileage;

    @ApiModelProperty(value = "衬砌类型")
    private String liningType;

    @ApiModelProperty(value = "危岩等级")
    private String dangerLevel;

    @ApiModelProperty(value = "危岩长度")
    private BigDecimal dangerLength;

    @ApiModelProperty(value = "工程地质")
    private String projectGeology;

    @ApiModelProperty(value = "水文地质")
    private String hydroGeology;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态：0正常，1删除")
    private Integer delFlag;


}
