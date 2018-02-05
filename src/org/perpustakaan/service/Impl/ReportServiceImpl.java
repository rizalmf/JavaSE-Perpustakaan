/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.service.Impl;


import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.perpustakaan.report.LaporanPeminjamanHarian;
import org.perpustakaan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngarambes
 */
@Service("reportService")
@Transactional(readOnly =  true)
public class ReportServiceImpl implements ReportService{
    private static final Logger log = Logger.getLogger(ReportServiceImpl.class.getName());
    @Autowired private SessionFactory sessionFactory;
    
    public JasperPrint getLaporanPeminjamanHarian(Date date){
        try {
            List<LaporanPeminjamanHarian> laporanPeminjamanHarians = sessionFactory.getCurrentSession()
                    .createQuery("select pd.peminjaman.anggota.nama as peminjam, "
                + "pd.buku.judul as judul from PeminjamanDetail pd "
                + "where pd.peminjaman.tanggal = :date order by pd.peminjaman.anggota.nama asc, pd.buku.judul asc")
                .setParameter("date", date)
                .setResultTransformer(Transformers.aliasToBean(LaporanPeminjamanHarian.class))
                .list();
        
            InputStream is = ReportServiceImpl.class.getResourceAsStream("/report/LaporanPeminjamanHarian.jasper");
           
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("date", date);
            
        return JasperFillManager.fillReport(is, parameters, new JRBeanCollectionDataSource(laporanPeminjamanHarians));
        
        } catch (JRException e) {
            System.out.println(e);
        }
        return null;
        
    }
    
    
}
