/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelpon, String email, String kantor, double gaji, MyDate tanggalMasuk, int jamKerja, String pangkat) {
        super(nama, alamat, nomorTelpon, email, kantor, gaji, tanggalMasuk);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + nama;
    }
}
