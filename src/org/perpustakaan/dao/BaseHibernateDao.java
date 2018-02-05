/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ngarambes
 */
public class BaseHibernateDao<T> {
    @SuppressWarnings("unchecked")
    protected Class domainClass;
    
    @Autowired
    protected SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    public BaseHibernateDao(){
        this.domainClass = (Class)((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }
    
    public T save(T domain){
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
        return domain;
    }
    public T delete(T domain){
        sessionFactory.getCurrentSession().delete(domain);
        return domain;
    }
    @SuppressWarnings("unchecked")
    public T getById(Long id){
        return (T) sessionFactory.getCurrentSession().get(domainClass, id);
    }
    @SuppressWarnings("unchecked")
    public List<T> getAll(){
        return sessionFactory.getCurrentSession().createQuery("from "+domainClass.getName())
                .list();
    }
}
