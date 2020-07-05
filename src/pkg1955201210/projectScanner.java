/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201210;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class projectScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //type data yangakan digunakan
        String nama,alamat;
        int usia,tahunLulus;
        double beratBadan;
        
        //New Scanner
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("!!! data riwayat hidup !!!");
        System.out.println("nama");
        //apa yang disimpan di type data
        nama = keyboard.nextLine();
        //tampilkan output
        System.out.println("agama");
        String agama = keyboard.nextLine();
        
        System.out.println("kewarganegaraan");
        String kewarganegaraan = keyboard.nextLine();
        
        System.out.println("golongan darah");
        String golonganDarah = keyboard.nextLine();
         
        System.out.println("usia");
        int umur = keyboard.nextInt();
        
        System.out.println("tanggal lahir");
        int tanggalLahir = keyboard.nextInt();
        
        System.out.println("berat badan");
        double beratbadan = keyboard.nextDouble();
        
        
        
        //output dari input
        System.out.println("--------------");
        System.out.println("nama alamat;" + nama);
        System.out.println("agama;" + agama);
        System.out.println("kewarganegaraan;" + kewarganegaraan);
        System.out.println("golongan darah;" + golonganDarah);
        System.out.println("umur;" + umur);
        System.out.println("tanggal lahir;" + tanggalLahir);
        System.out.println("beratbadan;" + beratbadan);
        
        
        
        
        
    }
    
}
