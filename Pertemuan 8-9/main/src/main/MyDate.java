/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
class MyDate {
    private int tahun, bulan, hari;
    
    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
    
    @Override
    public String toString(){
        return tahun + "-" + bulan + "-" + hari;
    }
}
