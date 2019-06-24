package lsl.mint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 费用项
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_fee")
public class Fee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId(type = IdType.UUID)
    private Long id;
    /**
     * 费用类型(字典1003)
     */
    @TableField(value = "fee_type")
    private Integer feeType;
    /**
     * 从tt_fee_cause表中选择
     */
    @TableField(value = "tt_fee_cause")
    private String ttFeeCause;
    /**
     * 总费用
     */
    @TableField(value = "total_cost")
    private BigDecimal totalCost;
    /**
     * 是否结清
     */
    @TableField(value = "is_settled")
    private Integer isSettled;
    /**
     * 实付金额
     */
    @TableField(value = "actual_paid")
    private BigDecimal actualPaid;
    /**
     * 费用产生日期
     */
    @TableField(value = "fee_time")
    private Date feeTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人id
     */
    @TableField(value = "created_by")
    private Long createdBy;
    /**
     * 创建时间
     */
    @TableField(value = "created_date")
    private Date createdDate;
    /**
     * 创建人id
     */
    @TableField(value = "updated_by")
    private Long updatedBy;
    /**
     * 更新时间
     */
    @TableField(value = "updated_date")
    private Date updatedDate;
}
