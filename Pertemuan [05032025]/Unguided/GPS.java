/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

/**
 *
 * @author ACER
 */
// Class GPS digunakan untuk menentukan lokasi saat ini dan tujuan perjalanan mobil
class GPS {
        private String currentLocation; // Lokasi saat ini
    private String destination; // Tujuan perjalanan

    // Konstruktor untuk menginisialisasi lokasi awal dan tujuan
    public GPS(String currentLocation, String destination) {
        this.currentLocation = currentLocation;
        this.destination = destination;
    }

     // Mengembalikan lokasi saat in
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Mengembalikan lokasi tujuan
    public String getDestination() {
        return destination;
    }
}
