package com.example.fragment;

public class Contact {

    public String nama;
    public String tanggal;
    public String durasi;
    public int foto;

    public Contact () {
    }

    public Contact(String nama, String tanggal, String durasi, int foto) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.foto = foto;
    }

    //Getter

    public String getNama() {
        return nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getDurasi() {
        return durasi;
    }

    public int getFoto() {
        return foto;
    }

    //setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
