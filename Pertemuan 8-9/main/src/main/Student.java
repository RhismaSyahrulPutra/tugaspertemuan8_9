/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class Student extends Person {
    public static final String MAHASISWABARU = "Mahasiswa Baru";
    public static final String MAHASISWATAHUNKEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    private String status;

    public Student(String nama, String alamat, String nomorTelpon, String email, String status) {
        super(nama, alamat, nomorTelpon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + nama;
    }
}
