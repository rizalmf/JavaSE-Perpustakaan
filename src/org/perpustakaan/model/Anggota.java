/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "anggota", uniqueConstraints = {@UniqueConstraint(columnNames = "nim")})
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "seq_anggota")
    @SequenceGenerator(name = "seq_anggota", sequenceName = "anggota_id_seq", allocationSize = 1)
    private Long id;
    
    @Column(name = "nama", length = 100, nullable = false)
    private String nama;
    
    @Column(name = "nim", length = 20, nullable = false)
    private String nim;
    
    //@OneToOne(mappedBy = "anggota")
    //private Peminjaman peminjaman;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

   
}
