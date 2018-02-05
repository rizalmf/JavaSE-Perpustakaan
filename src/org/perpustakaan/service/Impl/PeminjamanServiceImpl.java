/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service.Impl;

import java.util.List;
import org.perpustakaan.dao.PeminjamanDao;
import org.perpustakaan.model.Peminjaman;
import org.perpustakaan.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngarambes
 */
@Service("peminjamanService")
@Transactional
public class PeminjamanServiceImpl implements PeminjamanService{
    @Autowired private PeminjamanDao peminjamanDao;
    
    public void save(Peminjaman peminjaman){
        peminjamanDao.save(peminjaman);
    }
    public void delete(Peminjaman peminjaman){
        peminjamanDao.delete(peminjaman);
    }
    @Transactional(readOnly = true)
    public Peminjaman getPeminjaman(Long id){
        return peminjamanDao.getById(id);
    }
    @Transactional(readOnly = true)
    public List<Peminjaman> getPeminjamans(){
        return peminjamanDao.getAll();
    }
}
