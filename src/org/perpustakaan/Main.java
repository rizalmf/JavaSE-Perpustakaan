/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan;

import org.perpustakaan.model.Anggota;
import org.perpustakaan.model.Buku;
import org.perpustakaan.model.Peminjaman;
import org.perpustakaan.model.Pengembalian;
import org.perpustakaan.service.AnggotaService;
import org.perpustakaan.service.BukuService;
import org.perpustakaan.service.PeminjamanService;
import org.perpustakaan.service.PengembalianService;
import org.perpustakaan.service.ReportService;
import org.perpustakaan.ui.FormUtama;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ngarambes
 */
public class Main {
    private static AnggotaService anggotaService;
    private static BukuService bukuService;
    private static PeminjamanService peminjamanService;
    private static PengembalianService pengembalianService;
    private static ReportService reportService;
    public static Anggota anggota;
    public static Buku buku;
    public static Peminjaman peminjaman;
    public static Pengembalian pengembalian;
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        anggotaService = (AnggotaService) applicationContext.getBean("anggotaService");
        bukuService    = (BukuService) applicationContext.getBean("bukuService");
        peminjamanService = (PeminjamanService) applicationContext.getBean("peminjamanService");
        pengembalianService =(PengembalianService) applicationContext.getBean("pengembalianService");
        reportService = (ReportService) applicationContext.getBean("reportService");
        FormUtama fu = new FormUtama();
        fu.setVisible(true);
        
        
    }
    public static ReportService getReportService(){
        return reportService;
    }
    public static AnggotaService getAnggotaService(){
        return anggotaService;
    }
    public static BukuService getBukuService(){
        return bukuService;
    }
    public static PeminjamanService getpemiPeminjamanService(){
        return peminjamanService;
    }
    public static PengembalianService getPengembalianService(){
        return pengembalianService;
    }
}
