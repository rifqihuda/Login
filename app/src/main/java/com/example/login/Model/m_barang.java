package com.example.login.Model;

public class m_barang {
    String id;
    String nama_barang;
    String harga;
    int img;

    public m_barang(String nama_barang, String harga, int img) {
        this.harga = harga;
        this.nama_barang = nama_barang;
        this.img = img;
    }

    public m_barang(String id, String nama_barang, String harga, int img) {
        this.id = id;
        this.harga = harga;
        this.nama_barang = nama_barang;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }
    public String getHarga() {
        return harga;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
