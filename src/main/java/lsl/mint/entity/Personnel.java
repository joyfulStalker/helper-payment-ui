package lsl.mint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 人员信息/公司信息
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_personnel")
public class Personnel implements Serializable {

private static final long serialVersionUID = 1L;

   /**
    * 主键id
    */
      @TableId(type = IdType.UUID)
		private Long id;
       /**
    * 姓名/公司名称
    */
    	private String name;
       /**
    * 手机号
    */
    	private String phone;
       /**
    * 地址
    */
    	private String address;
       /**
    * 车牌号
    */
    	private String license;
       /**
    * 密码
    */
    	private String password;
    }
