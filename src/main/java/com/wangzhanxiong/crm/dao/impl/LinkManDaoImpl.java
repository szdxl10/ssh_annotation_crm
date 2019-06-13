package com.wangzhanxiong.crm.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.wangzhanxiong.crm.dao.LinkManDao;
import com.wangzhanxiong.crm.domain.LinkMan;
import org.springframework.stereotype.Repository;

/**
 * 联系人的DAO的实现类
 * @author Wangzhanxiong
 *
 */
@Repository("linkManDao")
public class LinkManDaoImpl extends BaseDaoImpl<LinkMan> implements LinkManDao {
	
}
