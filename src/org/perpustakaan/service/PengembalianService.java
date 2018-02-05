/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service;

import java.util.List;
import org.perpustakaan.model.Pengembalian;

/**
 *
 * @author ngarambes
 */
public interface PengembalianService {
    public void save(Pengembalian pengembalian);
    public void delete(Pengembalian pengembalian);
    public Pengembalian getPengembalian(Long id);
    public List<Pengembalian> getPengembalians();
}
