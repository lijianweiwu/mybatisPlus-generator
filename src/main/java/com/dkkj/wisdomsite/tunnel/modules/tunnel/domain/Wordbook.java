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
 * 字典表
 *
 * @author lijian
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sd_wordbook")
@ApiModel(value="Wordbook对象", description="字典表")
public class Wordbook implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    private Integer id;

    @ApiModelProperty(value = "字典类型")
    private Integer type;

    @ApiModelProperty(value = "类型名称描述")
    private String typeName;

    @ApiModelProperty(value = "值")
    private String value;

    @ApiModelProperty(value = "状态：0未使用，1使用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除状态: 0正常，1删除")
    private Integer delFlag;


}
