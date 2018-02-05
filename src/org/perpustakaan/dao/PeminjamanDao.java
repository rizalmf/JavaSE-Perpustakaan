/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.dao;

import java.util.List;
import org.perpustakaan.model.Peminjaman;
import org.springframework.stereotype.Component;

/**
 *
 * @author ngarambes
 */
@Component  
public class PeminjamanDao extends BaseHibernateDao<Peminjaman>{
    public List<Peminjaman> getAll(){
        return super.sessionFactory.getCurrentSession().createQuery("from Peminjaman p order by p.id desc")
                .list();
    }
}
