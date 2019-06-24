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
 * 数据字典表
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_dictionary")
public class Dictionary implements Serializable {

private static final long serialVersionUID = 1L;

   /**
    * 主键
    */
      @TableId(type = IdType.UUID)
		private Long id;
       /**
    * 数据类型
    */
    	  @TableField(value="data_type")
	private Integer dataType;
       /**
    * 业务数据类型
    */
    	  @TableField(value="business_data_type")
	private Integer businessDataType;
       /**
    * 业务数据描述
    */
    	  @TableField(value="business_data_descr")
	private String businessDataDescr;
       /**
    * 是否被删除
    */
    	  @TableField(value="is_deleted")
	private Integer isDeleted;
       /**
    * 创建人id
    */
    	  @TableField(value="created_by")
	private Long createdBy;
       /**
    * 创建时间
    */
    	  @TableField(value="created_date")
	private Date createdDate;
       /**
    * 
    */
    	  @TableField(value="updated_by")
	private Long updatedBy;
       /**
    * 更新时间
    */
    	  @TableField(value="updated_date")
	private Date updatedDate;
    }
