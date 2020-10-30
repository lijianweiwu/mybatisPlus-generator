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
 * 工作点（面）信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_worksite")
@ApiModel(value="Worksite对象", description="工作点（面）信息表")
public class Worksite implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "隧道编码")
    private String tunnelCode;

    @ApiModelProperty(value = "工作面编码")
    private String worksiteCode;

    @ApiModelProperty(value = "工作面名称(隧道+左右线+施工入口+工作面类型）")
    private String worksiteName;

    @ApiModelProperty(value = "工点类别")
    private String worksiteType;

    @ApiModelProperty(value = "0：整体式，1左隧，2右隧")
    private Integer worksiteTunnelType;

    @ApiModelProperty(value = "施工入口/坑道类别")
    private String workEntrance;

    @ApiModelProperty(value = "工作面起始里程(单位：米)")
    private Integer startMileage;

    @ApiModelProperty(value = "工作面结束里程")
    private Integer endMileage;

    @ApiModelProperty(value = "工作面长度")
    private Integer worksiteLength;

    @ApiModelProperty(value = "负责人")
    private String manager;

    @ApiModelProperty(value = "负责人电话")
    private String managerPhone;

    @ApiModelProperty(value = "工点概况")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态：0正常，1删除")
    private Integer delFlag;


}
