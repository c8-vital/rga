package nus.rga.main.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author cai
 * @email 347212213@qq.com
 * @date 2021-12-03 18:06:12
 */
@Data
@TableName("ans")
public class AnsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 答案id
	 */
	@TableId
	private Integer ansId;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 问题id
	 */
	private Integer quesId;
	/**
	 * 
	 */
	private String answer;
	/**
	 * 
	 */
	private Date createTime;

}
