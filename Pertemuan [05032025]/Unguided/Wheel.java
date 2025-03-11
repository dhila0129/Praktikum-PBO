/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class Wheel merepresentasikan roda mobil dengan ukuran tertentu
class Wheel {
    private int size; // Ukuran roda dalam inci

    // Konstruktor untuk menginisialisasi ukuran roda saat objek dibuat
    public Wheel(int size) {
        this.size = size;
    }

    // Mengembalikan ukuran roda dalam inci
    public int getSize() {
        return size;
    }
}
