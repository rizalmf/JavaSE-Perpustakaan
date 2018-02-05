/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service.Impl;

import java.util.List;
import org.perpustakaan.dao.AnggotaDao;
import org.perpustakaan.model.Anggota;
import org.perpustakaan.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngarambes
 */
@Service("anggotaService")
@Transactional
public class AnggotaServiceImpl implements AnggotaService {
    @Autowired private AnggotaDao anggotaDao;
    
    public void save(Anggota anggota){
        anggotaDao.save(anggota);
    }
    public void delete(Anggota anggota){
        anggotaDao.delete(anggota);
    }
    @Transactional(readOnly = true)
    public Anggota getAnggota(Long id){
        return anggotaDao.getById(id);
    }
    @Transactional(readOnly = true)
    public List<Anggota> getAnggotas(){
        return anggotaDao.getAll();
    }
    @Transactional(readOnly = true)
    public List<Anggota> getByNama(String nama){
        return anggotaDao.getByNama(nama);
    }
}
