/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senjata_oop;

/**
 *
 * @author SMK TELKOM 023
 */
    class player {
    String nama;
    int jumlahPeluru;
    
    
    player (String nama, int jumlahpeluru){
        this.nama = nama;
        jumlahPeluru = jumlahpeluru;
        
    }
    void display (){
        System.out.println("NAMA SENJATA : " + nama);
        System.out.println("JUMLAH PELURU : " + (jumlahPeluru-1));
    }
    
    void tembak(){
        jumlahPeluru--;
        
        if (jumlahPeluru >= 0) {
            System.out.println("Menembak... Sisa peluru : " + jumlahPeluru);  
        }
        for (int i = 0; i < jumlahPeluru; i++) {
            tembak();
        
        } 
    }
    
    void reload (){
        
        if (jumlahPeluru <= 0) {
            System.out.println("Peluru habis, Reloading! ");
            
        }
    }
    
}

public class senjata {
    public static void main(String[] args) {
        player player1 = new player("Vindal", (20+1));
        
        player1.display();
        player1.tembak();
        player1.reload();
    }

}

