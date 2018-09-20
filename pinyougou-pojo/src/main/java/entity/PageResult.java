package entity;


import java.io.Serializable;
import java.util.List;

/**
* @author 作者 kn_frms:
* @version 创建时间：2018年9月12日 上午10:07:29
* 类说明 分页结果类
*/

public class PageResult implements Serializable{
	
	private long total;//总记录数
	private List rows;//当前的总数据
	
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	/**
	 * @return the rows
	 */
	public List getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(List rows) {
		this.rows = rows;
	}

	
}