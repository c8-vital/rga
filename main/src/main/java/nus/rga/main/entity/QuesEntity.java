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
@TableName("ques")
public class QuesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer quesId;
	/**
	 * 
	 */
	private String quesDesc;
	/**
	 * 
	 */
	private Integer parId;

}
