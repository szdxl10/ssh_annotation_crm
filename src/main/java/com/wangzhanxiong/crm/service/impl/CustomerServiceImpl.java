package com.wangzhanxiong.crm.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangzhanxiong.crm.dao.CustomerDao;
import com.wangzhanxiong.crm.domain.Customer;
import com.wangzhanxiong.crm.domain.PageBean;
import com.wangzhanxiong.crm.service.CustomerService;

import javax.annotation.Resource;

/**
 * 客户管理的Service的实现类
 * @author Wangzhanxiong
 *
 */
@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// 注入客户的DAO
	@Resource(name = "customerDao")
	private CustomerDao customerDao;

	@Override
	// 业务层保存客户的方法:
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	// 业务层分页查询客户的方法:
	public PageBean<Customer> findByPage(DetachedCriteria detachedCriteria, Integer currPage,Integer pageSize) {
		PageBean<Customer> pageBean = new PageBean<Customer>();
		// 封装当前页数:
		pageBean.setCurrPage(currPage);
		// 封装每页显示记录数:
		pageBean.setPageSize(pageSize);
		// 封装总记录数:
		// 调用DAO:
		Integer totalCount  = customerDao.findCount(detachedCriteria);
		pageBean.setTotalCount(totalCount);
		// 封装总页数:
		Double tc = totalCount.doubleValue();
		Double num = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示数据的集合
		Integer begin = (currPage - 1) * pageSize;
		List<Customer> list = customerDao.findByPage(detachedCriteria,begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	// 业务层根据ID查询客户的方法
	public Customer findById(Long cust_id) {
		return customerDao.findById(cust_id);
	}

	@Override
	// 业务层删除客户的方法
	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	// 业务层修改客户的方法:
	public void update(Customer customer) {
		customerDao.update(customer);
	}

	@Override
	// 业务层查询所有客户的方法:
	public List<Customer> findAll() {
		return customerDao.findAll();
	}
	
}
