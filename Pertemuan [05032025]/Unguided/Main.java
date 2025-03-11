/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class Main digunakan sebagai titik awal program untuk membuat objek mobil dan menampilkan informasi mobil
public class Main {
    public static void main(String[] args) {
        // Membuat objek Transmission dengan tipe Automatic dan 6 gigi
        Transmission transmission = new Transmission("Automatic", 6);
        
        // Membuat objek Engine dengan 250 HP dan kapasitas 2.5 liter
        Engine engine = new Engine(250, 2.5);
        
        // Membuat array Wheel dengan ukuran 18 inci untuk 4 roda
        Wheel[] wheels = {new Wheel(18), new Wheel(18), new Wheel(18), new Wheel(18)};
        
        // Membuat objek FuelTank dengan kapasitas 55 liter
        FuelTank fuelTank = new FuelTank(55);
        
        // Membuat objek GPS dengan lokasi saat ini di Purwokerto dan tujuan ke Jakarta
        GPS gps = new GPS("Purwokerto", "Jakarta");
        
        // Membuat objek Car dengan spesifikasi di atas
        Car myCar = new Car("Toyota Supra", transmission, engine, wheels, fuelTank, gps);
        
        // Menampilkan informasi mobil
        myCar.displayCarInfo();
    }
}
