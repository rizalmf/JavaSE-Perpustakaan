/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service;

import java.util.List;
import org.perpustakaan.model.Anggota;

/**
 *
 * @author ngarambes
 */
public interface AnggotaService {
    public void save(Anggota anggota);
    public void delete(Anggota anggota);
    public Anggota getAnggota(Long id);
    public List<Anggota> getAnggotas();
    public List<Anggota> getByNama(String nama);
}
