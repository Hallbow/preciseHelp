package cn.wellstudio.precisehelp.dao;

import cn.wellstudio.precisehelp.entity.Express;

/**
 * 物流DAO接口设计
 * @author huhong
 *
 */
public interface IExpressDAO {
	
	/**
	 * 根据订单信息查询物流信息
	 * @param expressNum
	 * @return
	 */
	public Express findExpressByOrder(String expressNum);
	
	/**
	 * 添加物流信息
	 * @param express
	 * @return
	 */
	public boolean addExpress(Express express);
	
	/**
	 * 更新物流信息
	 * @param express
	 * @return
	 */
	public boolean updateExpress(Express express);
	
}
