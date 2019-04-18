/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author chondroseto
 */
public class MataKuliah {
    private String kd_mtk,nm_mtk,nip;
    private int sks;
    
    public MataKuliah(){
        
    }

    public MataKuliah(String kd_mtk, String nm_mtk, String nim, int sks) {
        this.kd_mtk = kd_mtk;
        this.nm_mtk = nm_mtk;
        this.nip = nim;
        this.sks = sks;
    }
    
    public MataKuliah(String kd_mtk, String nm_mtk, int sks) {
        this.kd_mtk = kd_mtk;
        this.nm_mtk = nm_mtk;
        this.sks = sks;
    }

    public String getKd_mtk() {
        return kd_mtk;
    }

    public String getNm_mtk() {
        return nm_mtk;
    }

    public String getNip() {
        return nip;
    }

    public int getSks() {
        return sks;
    }

    public void setKd_mtk(String kd_mtk) {
        this.kd_mtk = kd_mtk;
    }

    public void setNm_mtk(String nm_mtk) {
        this.nm_mtk = nm_mtk;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    
}
