/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service;

import java.util.List;
import org.perpustakaan.model.Buku;

/**
 *
 * @author ngarambes
 */
public interface BukuService {
    public void save(Buku buku);
    public void delete(Buku buku);
    public Buku getBuku(Long id);
    public List<Buku> getBukus();
    public List<Buku> getByJudul(String judul);
}
