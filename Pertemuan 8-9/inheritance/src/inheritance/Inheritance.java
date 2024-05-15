/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

import java.util.Scanner;
/**
 *
 * @author Rhisma Syahrul Putra
 */

class Segitiga {
    private double side1, side2, side3;
    
    public Segitiga() {
        side1 = side2 = side3 = 1.0;
    }
    
    public Segitiga(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + ", sisi2 = " + side2 + ", sisi3 = " + side3;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi;
        
        do {
            System.out.println("Masukan Panjang Sisi dari Segitiga: ");
            double sisi1 = input.nextDouble();
            double sisi2 = input.nextDouble();
            double sisi3 = input.nextDouble();
        
            System.out.println("Masukkan warna segitiga:");
            String warnaSegitiga = input.next();
        
            System.out.println("Apakah segitiga terisi? (true/false):");
            boolean terisi = input.nextBoolean();
        
            Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        
            //OUTPUT
            System.out.println("Luas segitiga: " + segitiga.getArea());
            System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
            System.out.println("Warna segitiga: " + warnaSegitiga);
            System.out.println("Segitiga terisi: " + terisi);
            
            System.out.println("Apakah Progran ingin di ulangi? (true/false): ");
            ulangi = input.nextBoolean();
            
        } while (ulangi);
    }
    
}
