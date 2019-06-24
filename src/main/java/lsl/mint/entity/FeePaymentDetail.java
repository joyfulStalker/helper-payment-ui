package lsl.mint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 付费详情
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_fee_payment_detail")
public class FeePaymentDetail implements Serializable {

private static final long serialVersionUID = 1L;

   /**
    * 主键
    */
      @TableId(type = IdType.UUID)
		private Long id;
       /**
    * 费用主键id
    */
    	  @TableField(value="tt_fee_id")
	private Long ttFeeId;
       /**
    * 费用金额
    */
    	  @TableField(value="fee_amount")
	private BigDecimal feeAmount;
       /**
    * 付款时间
    */
    	  @TableField(value="pay_time")
	private Date payTime;
       /**
    * 付款人（包含公司）id
    */
    	  @TableField(value="drawee_id")
	private Long draweeId;
       /**
    * 付款人姓名/公司名称
    */
    	private String drawee;
       /**
    * 收款人id/收款公司
    */
    	  @TableField(value="payee_id")
	private Long payeeId;
       /**
    * 收款人/收款公司
    */
    	private String payee;
       /**
    * 备注
    */
    	private String remark;
    }
