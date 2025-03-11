/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class FuelTank merepresentasikan kapasitas tangki bahan bakar mobil
class FuelTank {
    private double capacity; // Kapasitas tangki bahan bakar dalam liter

    // Konstruktor untuk menginisialisasi kapasitas tangki bahan bakar saat ibjek dibuat
    public FuelTank(double capacity) {
        this.capacity = capacity;
    }

    // Mengembalikan kapasitas tangki bahan bakar dalam liter
    public double getCapacity() {
        return capacity;
    }
}
