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
 * 隧道系统设备
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_system_device")
@ApiModel(value="SystemDevice对象", description="隧道系统设备")
public class SystemDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "工点编码")
    private String worksiteCode;

    @ApiModelProperty(value = "设备编号")
    private String code;

    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "设备类别")
    private String type;

    @ApiModelProperty(value = "接入方式")
    private String accessMode;

    @ApiModelProperty(value = "通讯地址")
    private String ipAddr;

    @ApiModelProperty(value = "端口号")
    private String port;

    @ApiModelProperty(value = "状态：0停用，1使用")
    private Integer status;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志：1为删除")
    private Integer delFlag;


}
