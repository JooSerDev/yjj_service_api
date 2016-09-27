package com.joosure.service.api;

import com.joosure.entity.domain.Result;

/**
 * 管理端api
 * 
 * @author shawn
 *
 */
public interface ManagementService {
	
	

	/**
	 * 设置总额
	 * 
	 * @param isUsingSetting
	 *            是否启用管理员设置的总额，0-否，1-是；
	 * @param amount
	 *            管理员设置的总额；
	 * @return 返回默认结果
	 */
	Result setAmountTotal(Integer isUsingSetting, String amount);

}
