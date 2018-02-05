/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service.Impl;

import java.util.List;
import org.perpustakaan.dao.PengembalianDao;
import org.perpustakaan.model.Pengembalian;
import org.perpustakaan.service.PengembalianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngarambes
 */
@Service("pengembalianService")
@Transactional
public class PengembalianServiceImpl implements PengembalianService{
    @Autowired private PengembalianDao pengembalianDao;
    public void save(Pengembalian pengembalian){
        pengembalianDao.save(pengembalian);
    }
    public void delete(Pengembalian pengembalian){
        pengembalianDao.delete(pengembalian);
    }
    @Transactional(readOnly = true)
    public Pengembalian getPengembalian(Long id){
        return pengembalianDao.getById(id);
    }
    @Transactional(readOnly = true)
    public List<Pengembalian> getPengembalians(){
        return pengembalianDao.getAll();
    }
}
