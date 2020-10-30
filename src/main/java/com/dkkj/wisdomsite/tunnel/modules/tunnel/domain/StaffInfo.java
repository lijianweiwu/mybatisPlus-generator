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
 * 隧道人员信息表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_staff_info")
@ApiModel(value="StaffInfo对象", description="隧道人员信息表")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "人员编号")
    private String code;

    @ApiModelProperty(value = "人员姓名")
    private String staffName;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "部门/班组")
    private String department;

    @ApiModelProperty(value = "职务/工种")
    private String profession;

    @ApiModelProperty(value = "所属单位")
    private String affiliatedOrg;

    @ApiModelProperty(value = "进场时间")
    private String enterDate;

    @ApiModelProperty(value = "退场时间")
    private String exitDate;

    @ApiModelProperty(value = "绑定卡号")
    private String bindingCardNum;

    @ApiModelProperty(value = "人脸照片")
    private String facePic;

    @ApiModelProperty(value = "证件照片正面")
    private String certPicOne;

    @ApiModelProperty(value = "证件照片反面")
    private String certPicTwo;

    @ApiModelProperty(value = "二维码")
    private String qrCode;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志：1为删除")
    private Integer delFlag;


}
