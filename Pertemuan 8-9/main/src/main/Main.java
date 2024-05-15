/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Rhisma Syahrul Putra
 */
public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 5, 13);
        Person person = new Person("Rhisma Syahrul Putra", "JL. Gegerkalong, Bandung", "123-456-7890", "nononame@gmail.com");
        Student student = new Student("Budi Santoso", "Jl. Dago No. 123, Bandung", "987-654-3210", "budi@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Ani Wijaya", "Jl. Gatot Subroto no.666, Bandung", "456-789-0123", "wijaya@gmail.com", "Ruang 101", 50000, date);
        Faculty faculty = new Faculty("Cici", "JL. Setiabudi no.666 ", "789-012-3456", "Cici@gmail.com", "Ruang 202", 75000, date, 40, "Profesor");
        Staff staff = new Staff("Euis Susan", "JL. Asia Afrika No. 666, Bandung", "012-345-6789", "susan@example.com", "Ruang 303", 40000, date, "Asisten");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
