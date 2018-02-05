/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.dao;

import java.util.List;
import org.perpustakaan.model.Pengembalian;
import org.springframework.stereotype.Component;

/**
 *
 * @author ngarambes
 */
@Component
public class PengembalianDao extends BaseHibernateDao<Pengembalian>{
    public List<Pengembalian> getAll(){
        return super.sessionFactory.getCurrentSession().createQuery("from Pengembalian p order by p.id desc")
                .list();
    }
}
