/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201210;

import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author User
 */
public class perulanganFOR {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("mulai");
        System.out.println("letakkan wajan diatas kompor yang menyala");
        System.out.println("tuang sedikit minyak goreng");
        System.out.println("masukkan nasi secukupnya");
        System.out.println("tambahkan garam");
        
        String goreng;
        goreng = "garam";
        System.out.println("apakah nasi kurang garam");
        if ("garam".equals(goreng)){
    }
        else {
            System.out.println("kurang garam");
        }
        for (int i =1; i <n; i++){
            System.out.println("tambah garam lagi-" + I);
        }
                 
            System.out.println("selesai");
        
}
}