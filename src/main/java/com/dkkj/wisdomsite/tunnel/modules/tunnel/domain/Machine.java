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
 * 隧道作业设备
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_machine")
@ApiModel(value="Machine对象", description="隧道作业设备")
public class Machine implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备编号")
    private String code;

    @ApiModelProperty(value = "设备名称")
    private String machineName;

    @ApiModelProperty(value = "设备类别")
    private String type;

    @ApiModelProperty(value = "设备型号")
    private String model;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "责任人")
    private String chargePerson;

    @ApiModelProperty(value = "所属单位")
    private String affiliatedOrg;

    @ApiModelProperty(value = "进场日期")
    private String enterDate;

    @ApiModelProperty(value = "退场日期")
    private String exitDate;

    @ApiModelProperty(value = "绑定卡号")
    private String bindingCardNum;

    @ApiModelProperty(value = "设备图片")
    private String machinePic;

    @ApiModelProperty(value = "操作证件")
    private String operationCert;

    @ApiModelProperty(value = "二维码")
    private String qrCode;

    @ApiModelProperty(value = "在场状态：0不在场，1为在场")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志：0正常，1为删除")
    private Integer delFlag;


}
