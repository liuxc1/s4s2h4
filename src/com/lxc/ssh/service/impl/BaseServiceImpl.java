package com.lxc.ssh.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lxc.ssh.dao.BaseDao;
import com.lxc.ssh.service.IBaseService;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
	// 依赖注入BaseDao,定义成受保护的是为了下面的子类也可以使用dao
	private Class<T> clz;
	@Autowired
	protected BaseDao<T> baseDao;

	/**
	 * 使用反射取得泛型里面参数类型
	 */
	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		Type type = this.getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) type;
			// 拿到泛型参数的数组
			Type[] types = parameterizedType.getActualTypeArguments();
			this.clz = (Class<T>) types[0];
		}
	}

	@Override
	public void save(T t) {
		baseDao.save(t);

	}

	@Override
	public void update(T t) {
		baseDao.update(t);

	}

	@Override
	public void delete(Serializable id) {
		baseDao.delete(clz, id);

	}

	@Override
	public T get(Serializable id) {
		return baseDao.get(clz, id);

	}

	@Override
	public List<T> getAll() {
		return baseDao.getAll(clz);

	}

}
