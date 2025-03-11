/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class Car merepresentasikan mobil yang terdiri dari berbagai komponen seperti mesin, transmisi, roda, tangki bahan bakar, dan GPS
public class Car {
    private String model; // Model mobil , bersifat private agar tidak bisa diubah dari luar class tanpa setter
    private Transmission transmission; // Objek transmisi sebagai komponen mobil
    private Engine engine; // Objek mesin sebagai komponen mobil
    private Wheel[] wheels; // Array roda untuk menampung semua roda mobil
    private FuelTank fuelTank; // Objek tangki bahan bakar untuk menyimpan informasi bahan bakar
    private GPS gps; // Objek GPS untuk navigasi mobil

    // Konstruktor untuk menginisialisasi semua komponen mobil saat objek dibuat
    public Car(String model, Transmission transmission, Engine engine, Wheel[] wheels, FuelTank fuelTank, GPS gps) {
        this.model = model;
        this.transmission = transmission;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelTank = fuelTank;
        this.gps = gps;
    }

    // Method untuk menampilkan informasi lengkap mobil
    public void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Transmission: " + transmission.getType() + " - " + transmission.getGears() + " gears");
        System.out.println("Engine: " + engine.getHorsepower() + " HP, " + engine.getDisplacement() + "L");
        System.out.println("Wheel Size: " + wheels[0].getSize() + " inches");
        System.out.println("Fuel Tank Capacity: " + fuelTank.getCapacity() + "L");
        System.out.println("GPS Location: " + gps.getCurrentLocation() + " -> Destination: " + gps.getDestination());
    }
}
