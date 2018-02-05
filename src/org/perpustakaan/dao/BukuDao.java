/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.dao;

import java.util.List;
import org.perpustakaan.model.Buku;
import org.springframework.stereotype.Component;

/**
 *
 * @author ngarambes
 */
@Component
public class BukuDao extends BaseHibernateDao<Buku>{
    public List<Buku> getAll(){
        return super.sessionFactory.getCurrentSession().createQuery("from Buku b order by b.penerbit asc, b.judul asc")
                .list();
    }
    public List<Buku> getByJudul(String judul){
        return super.sessionFactory.getCurrentSession().createQuery("from Buku b where b.judul like '%"+judul+"%' order by b.penerbit asc, b.judul asc")
                .list();
    }
}
