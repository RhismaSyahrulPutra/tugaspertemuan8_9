/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalMasuk;

    public Employee(String nama, String alamat, String nomorTelpon, String email, String kantor, double gaji, MyDate tanggalMasuk) {
        super(nama, alamat, nomorTelpon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalMasuk = tanggalMasuk;
    }

    @Override
    public String toString() {
        return "Employee: " + nama;
    }
}
