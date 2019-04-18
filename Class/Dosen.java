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
public class Dosen {
    private String nip,nama,jurusan;
    
    public Dosen(){
        
    }

    public Dosen(String nip, String nama, String jurusan) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}
