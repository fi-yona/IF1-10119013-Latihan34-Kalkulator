/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan34.kalkulator;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;


public class Kalkulator {
    
    static Scanner scan = new Scanner(System.in);
    
    public double value1, value2;
    
    public double tambahBilangan(){
        return value1 + value2;
    }
    
    public double kurangBilangan(){
        return value1 - value2;
    }
    
    public double kaliBilangan(){
        return value1 * value2;
    }
    
    public double bagiBilangan(){
        return value1/value2;
    }
    
    public double sisaBilangan(){
        return value1 % value2;
    }
    
    public static void main(String[] args) {
        
        Kalkulator hitung = new Kalkulator();
        
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + hitung.kurangBilangan());
        System.out.println("Hasil Perkalian : " + hitung.kaliBilangan());
        double f = hitung.bagiBilangan();
        System.out.printf("Hasil Pembagian : " + "%.2f%n", f);
        System.out.println("Hasil Sisa : " + hitung.sisaBilangan());
    }
    
}
