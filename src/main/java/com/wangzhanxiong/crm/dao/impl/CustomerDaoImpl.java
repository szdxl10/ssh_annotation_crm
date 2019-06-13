package com.wangzhanxiong.crm.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

import com.wangzhanxiong.crm.dao.CustomerDao;
import com.wangzhanxiong.crm.domain.Customer;
import org.springframework.stereotype.Repository;

/**
 * 客户管理的DAO的实现类
 * @author Wangzhanxiong
 *
 */
@Repository("customerDao")
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {
	
}
