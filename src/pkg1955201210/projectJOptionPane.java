/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201210;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class projectJOptionPane {
    public static void main(String[] args) {
        
        
        String tanya = JOptionPane.showInputDialog("siapa nama anda");
        String alamat = JOptionPane.showInputDialog("dimana alamat anda");
        String agama = JOptionPane.showInputDialog("apa agama anda");
        String umur = JOptionPane.showInputDialog("berapa umur anda");
        String kewarganegaraan = JOptionPane.showInputDialog("apa kewarganegaraan anda");
        String golongandarah = JOptionPane.showInputDialog("apa golongan darah");
        String tanggalLahir = JOptionPane.showInputDialog("berapa tanggal lahir anda");
        String beratBadan = JOptionPane.showInputDialog("berapa berat badan anda");
        
        int jumlah = Integer.parseInt(umur);
        int banyaknyaPekerja = 500;
        double total = jumlah*banyaknyaPekerja;
        
        
        System.out.println("siapa nama anda;" + tanya);
        System.out.println("dimana alamat anda;" + alamat);
        System.out.println("apa agama anda;" + agama);
        System.out.println("berapa umur anda;" + umur);
        System.out.println("apa kewarganegaraan anda;" + kewarganegaraan);
        System.out.println("apa golongan darah anda;" + golongandarah);
        System.out.println("berapa tanggal lahir anda;" + tanggalLahir);
        System.out.println("berapa berat badan anda;" + beratBadan);
        
        
        
        
    }
}
