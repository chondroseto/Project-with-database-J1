/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;
/**
 *
 * @author chondroseto
 */
public class KSM {
    private String id_ksm,nim,kd_mtk;
    private Date tgl_buat;
    
    public KSM(){
        
    }

    public KSM(String id_ksm, String nim, String kd_mtk, Date tgl_buat) {
        this.id_ksm = id_ksm;
        this.nim = nim;
        this.kd_mtk = kd_mtk;
        this.tgl_buat = tgl_buat;
    }

    public String getId_ksm() {
        return id_ksm;
    }

    public String getNim() {
        return nim;
    }

    public String getKd_mtk() {
        return kd_mtk;
    }

    public Date getTgl_buat() {
        return tgl_buat;
    }

    public void setId_ksm(String id_ksm) {
        this.id_ksm = id_ksm;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKd_mtk(String kd_mtk) {
        this.kd_mtk = kd_mtk;
    }

    public void setTgl_buat(Date tgl_buat) {
        this.tgl_buat = tgl_buat;
    }
    
}
