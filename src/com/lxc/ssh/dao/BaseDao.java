package com.lxc.ssh.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class BaseDao<T> extends HibernateDaoSupport{
	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){  
	    super.setSessionFactory(sessionFactory);  
	}
	
	public List<T> getAll(Class<T> entiyClass) {
		return getHibernateTemplate().loadAll(entiyClass);
	}
	
	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	public void delete(Class<T> entiyClass, Serializable id) {
		T t = get(entiyClass, id);
		if (t != null) {
			getHibernateTemplate().delete(t);
		}
	}

	public T get(Class<T> entiyClass, Serializable id) {
		return (T) getHibernateTemplate().get(entiyClass, id);
	}
	
}