/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class Transmission merepresentasikan sistem transmisi mobil yang menentukan jenis dan jumlah gigi transmisi
class Transmission {
    private String type; // Jenis transmisi (manual/automatic)
    private int gears; // Jumlah gigi transmisi

    // Konstruktor untuk menginisialisasi jenis dan jumlah gigi transmisi saat objek dibuat
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    // Mengembalikan jenis transmis
    public String getType() {
        return type;
    }

    // Mengembalikan jumlah gigi transmisi
    public int getGears() {
        return gears;
    }
}
