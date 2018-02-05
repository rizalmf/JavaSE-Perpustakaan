/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.dao;

import java.util.List;
import org.perpustakaan.model.Anggota;
import org.springframework.stereotype.Component;

/**
 *
 * @author ngarambes
 */
@Component
public class AnggotaDao extends BaseHibernateDao<Anggota>{
    public List<Anggota> getAll(){
        return super.sessionFactory.getCurrentSession().createQuery("from Anggota a order by a.nim asc, a.nama asc")
                .list();
    }
    public List<Anggota> getByNama(String nama){
        return super.sessionFactory.getCurrentSession()
                .createQuery("from Anggota a where a.nama like '%"+nama+"%' order by a.nim asc, a.nama asc").list();
    }
}
