/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103063_shaniafinkadewi;

/**
 *
 * @author endorphinars
 */
public class KomputerVIP extends Komputer {

    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        System.out.println("=========================================");
        System.out.println("       INFORMASI KOMPUTER        ");
        System.out.println("Jumlah komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet   : " + namaWarnet);
        System.out.println("Harga per jam : Rp. " + hargaPerJam);
        System.out.println("Status        : " + (vipCard ? "Member VIP" : "Non VIP"));
        System.out.println("=========================================\n");

        if (vipCard) {
            System.out.println("=========================================");
            System.out.println("           BENEFIT MEMBER VIP            ");
            System.out.println("- Diskon 15% untuk bermain diatas 3 jam");
            System.out.println("- Gratis minuman setiap 5 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
            System.out.println("=========================================\n");
        } else {
            System.out.println("Tidak ada benefit khusus.");
        }
    }

    public void login(String username) {
        System.out.println("Login dengan Username : " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Menambah billing selama " + jam + " jam " + menitTambahan + " menit");
        System.out.println("=========================================\n");
    }
}
