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
 * 动态菜单
 * </p>
 *
 * @author liuSongLin
 * @since 2019-06-09
 */
@Data
@TableName("tt_menu")
public class Menu implements Serializable {

private static final long serialVersionUID = 1L;

   /**
    * 节点id
    */
      @TableId(type = IdType.UUID)
		private Long id;
       /**
    * 父节点id
    */
    	private Long pid;
       /**
    * 路径
    */
    	private String path;
       /**
    * 组件路径(例: ./book/list.vue)
    */
    	private String component;
       /**
    * 菜单显示名称
    */
    	private String name;
       /**
    * 是否显示
    */
    	  @TableField(value="menu_show")
	private Integer menuShow;
       /**
    * 图标
    */
    	  @TableField(value="icon_cls")
	private String iconCls;
       /**
    * 删除标识 1 :可用 2:不可用
    */
    	  @TableField(value="delete_flag")
	private Integer deleteFlag;
       /**
    * 只有一个节点  (true)
    */
    	private Integer leaf;
       /**
    * 创建人
    */
    	  @TableField(value="created_by")
	private String createdBy;
       /**
    * 创建日期
    */
    	  @TableField(value="created_date")
	private Date createdDate;
       /**
    * 更新人
    */
    	  @TableField(value="updated_by")
	private String updatedBy;
       /**
    * 更新日期
    */
    	  @TableField(value="updated_date")
	private Date updatedDate;
    }
