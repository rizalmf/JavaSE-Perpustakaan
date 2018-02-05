/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service;

import java.util.List;
import org.perpustakaan.model.Peminjaman;

/**
 *
 * @author ngarambes
 */
public interface PeminjamanService {
    public void save(Peminjaman peminjaman);
    public void delete(Peminjaman peminjaman);
    public Peminjaman getPeminjaman(Long id);
    public List<Peminjaman> getPeminjamans();
}
