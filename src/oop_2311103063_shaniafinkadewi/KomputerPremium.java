/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103063_shaniafinkadewi;

/**
 *
 * @author SHANIA FINKA DEWI 2311103063 SI-07-B
 */
public class KomputerPremium extends Komputer {

    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        System.out.println("=========================================");
        System.out.println("           INFORMASI KOMPUTER            ");
        System.out.println("Jumlah komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga per jam   : Rp. " + hargaPerJam);
        System.out.println("Status          : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
        System.out.println("=========================================\n");

        System.out.println("=========================================");
        System.out.println("         FASILITAS RUANG " + (ruangPrivat ? "PREMIUM" : "STANDAR"));
        if (ruangPrivat) {
            System.out.println("- Ruangan ber AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
        System.out.println("=========================================\n");
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan: " + makanan + " dan minuman: " + minuman);
    }
}
