/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service.Impl;

import java.util.List;
import org.perpustakaan.dao.BukuDao;
import org.perpustakaan.model.Buku;
import org.perpustakaan.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngarambes
 */
@Service("bukuService")
@Transactional
public class BukuServiceImpl implements BukuService{
    @Autowired private BukuDao bukuDao;
    
    public void save(Buku buku){
        bukuDao.save(buku);
    }
    public void delete(Buku buku){
        bukuDao.delete(buku);
    }
    @Transactional(readOnly = true)
    public Buku getBuku(Long id){
        return bukuDao.getById(id);
    }
    @Transactional(readOnly = true)
    public List<Buku> getBukus(){
        return bukuDao.getAll();
    }
    @Transactional(readOnly = true)
    public List<Buku> getByJudul(String judul){
        return bukuDao.getByJudul(judul);
    }
}
