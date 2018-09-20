package entity;

import java.io.Serializable;

/**
* @author 作者 kn_frms:
* @version 创建时间：2018年9月12日 下午5:19:40
* 类说明 返回结果封装
*/

public class Result implements Serializable{
	
	private boolean success;//是否成功
	private String  message;//返回的信息
	/**
	 * @return the success
	 *
	 */
	
	
	
	public boolean isSuccess() {
		return success;
	}
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
