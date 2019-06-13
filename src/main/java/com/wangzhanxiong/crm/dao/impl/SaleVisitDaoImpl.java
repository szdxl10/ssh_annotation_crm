package com.wangzhanxiong.crm.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.wangzhanxiong.crm.dao.SaleVisitDao;
import com.wangzhanxiong.crm.domain.SaleVisit;
import org.springframework.stereotype.Repository;

/**
 * 客户拜访记录的DAO的实现类
 * @author Wangzhanxiong
 *
 */
@Repository("saleVisitDao")
public class SaleVisitDaoImpl extends BaseDaoImpl<SaleVisit> implements SaleVisitDao {
	
}
