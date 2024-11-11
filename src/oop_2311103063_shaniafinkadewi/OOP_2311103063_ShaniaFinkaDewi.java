/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103063_shaniafinkadewi;

/**
 *
 * @author SHANIA FINKA DEWI 2311103063 SI-07-B
 */
public class OOP_2311103063_ShaniaFinkaDewi {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("            SELAMAT DATANG DI            ");
        System.out.println("         WARNET SHANIA PURWOKERTO        ");
        System.out.println("=========================================\n");

        KomputerVIP komputerGameVip = new KomputerVIP(30, "Warnet Shania Purwokerto", 9000.0f, true);
        komputerGameVip.informasi();
        komputerGameVip.login("Finka Dewi");
        komputerGameVip.bermain(2);
        komputerGameVip.bermain(2, 5);

        KomputerPremium komputerPremiumPrivat = new KomputerPremium(5, "Warnet Shania Purwokerto", 10000.0f, true);
        komputerPremiumPrivat.informasi();
        komputerPremiumPrivat.pesan(5);
        komputerPremiumPrivat.tambahLayanan("Nasi Goreng");
        komputerPremiumPrivat.tambahLayanan("Mie Goreng", "Es Degan");
    }
}
