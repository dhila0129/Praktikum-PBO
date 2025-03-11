/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class Engine merepresentasikan mesin mobil dengan daya (horsepower) dan kapasitas mesin (displacement)
class Engine {
    private int horsepower; // Daya mesin dalam satuan H
    private double displacement; // Kapasitas mesin dalam liter

    // Konstruktor untuk menginisialisasi daya mesin dan kapasitas mesin saat objek dibuat
    public Engine(int horsepower, double displacement) {
        this.horsepower = horsepower;
        this.displacement = displacement;
    }

    // Mengembalikan daya mesin dalam HP
    public int getHorsepower() {
        return horsepower;
    }

    // Mengembalikan kapasitas mesin dalam liter
    public double getDisplacement() {
        return displacement;
    }
}
