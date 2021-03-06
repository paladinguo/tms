package com.chinaway.tms.basic.service;

import java.util.List;
import java.util.Map;

import com.chinaway.tms.basic.model.Cpmd;
import com.chinaway.tms.core.BaseService;

public interface CpmdService extends BaseService<Cpmd, Integer> {

	/**
	 * 查询所有商品根据条件
	 * @param argsMap
	 * @return
	 */
	List<Cpmd> selectAllCpmdByCtn(Map<String, Object> argsMap);

	/**
	 * 连表查询商品根据订单id
	 * @param orderId
	 * @return
	 */
	List<Cpmd> selectCpmdByOrdersId(Integer orderId);
	
	/**
	 * 查询最新的更新时间
	 * @return
	 */
	String selectMaxUpdateTime();
	
}
