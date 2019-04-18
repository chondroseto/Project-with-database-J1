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
public class Mahasiswa {
    private String nim,nama,jurusan,alamat;
    private Date tgl_lahir;
    
    public Mahasiswa(){
        
    }

    public Mahasiswa(String nim, String nama, String jurusan, String alamat, Date tgl_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
    
}
