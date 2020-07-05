/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class classBUFFEREDREADER {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader (System.in);
        
        BufferedReader br = new BufferedReader (isr);
        
        String nama ;
        String alamat ;
        String agama ;
        String kewarganegaraan ;
        String golonganDarah ;
        int usia ;
        int tanggalLahir ;
        double beratBadan ;
        double IPK ;
        
        System.out.println("===============");
        
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("dimana alamat anda?");
        alamat = br.readLine();
        
        System.out.println("apa agama anda?");
        agama = br.readLine();
        
        System.out.println("apa kewarganegaraan anda?");
        kewarganegaraan = br.readLine();
        
        System.out.println("apa golongan darah anda?");
        golonganDarah = br.readLine();
        
        System.out.println("berapa usia anda?");
        usia = Integer.parseInt(br.readLine());
        
        System.out.println("berapa tanggal lahir anda?");
        tanggalLahir = Integer.parseInt(br.readLine());
        
        System.out.println("berapa berat badan anda?");
        beratBadan = Double.parseDouble(br.readLine());
        
        System.out.println("berapa IPK anda?");
        IPK = Double.parseDouble(br.readLine());
        
        
        System.out.println("===================");
        System.out.println("siapa nama anda ;" + nama);
        System.out.println("dimana alamat anda ;" + alamat);
        System.out.println("apa agama anda ;" + agama);
        System.out.println("apa kewarganegaraan anda ;" + kewarganegaraan);
        System.out.println("apa golongan darah ;" + golonganDarah );
        System.out.println("berapa usia anda ;" + usia);
        System.out.println("berapa tanggal lahir anda ;" + tanggalLahir);
        System.out.println("berapa berat badan anda ;" + beratBadan);
        System.out.println("berapa IPK anda ;" + IPK);
        
        
                
                
        
        
        
        
    }
}
