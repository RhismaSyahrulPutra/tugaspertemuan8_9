/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class Person {
    protected String nama;
    protected String alamat;
    protected String nomorTelpon;
    protected String email;
    
    public Person(String nama, String alamat, String nomorTelpon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelpon = nomorTelpon;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Person: " + nama;
    }
}
