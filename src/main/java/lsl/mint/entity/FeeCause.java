package lsl.mint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 费用产生原因
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_fee_cause")
public class FeeCause implements Serializable {

private static final long serialVersionUID = 1L;

   /**
    * 主键id
    */
      @TableId(type = IdType.UUID)
		private Long id;
       /**
    * 10011001:成本费用项  10011002:盈利费用项
    */
    	  @TableField(value="business_type")
	private Integer businessType;
       /**
    * 描述
    */
    	private String describe;
       /**
    * 创建人id
    */
    	  @TableField(value="created_by")
	private Long createdBy;
       /**
    * 
    */
    	  @TableField(value="created_date")
	private Date createdDate;
       /**
    * 更新人
    */
    	  @TableField(value="updated_by")
	private Long updatedBy;
       /**
    * 更新时间
    */
    	  @TableField(value="updated_date")
	private Date updatedDate;
    }
