/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class Staff extends Employee{
    private String gelar;

    public Staff(String nama, String alamat, String nomorTelpon, String email, String kantor, double gaji, MyDate tanggalMasuk, String gelar) {
        super(nama, alamat, nomorTelpon, email, kantor, gaji, tanggalMasuk);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Staff: " + nama;
    }
}
