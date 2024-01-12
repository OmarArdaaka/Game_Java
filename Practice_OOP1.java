package com.mycompany.practice_oop1;

class player{
    String nama;
    double hp;
    
    
    player(String nama, double hp){
        this.nama = nama;
        this.hp = hp;
    }
  
    void display (){
        System.out.println("Nama Hero : " + nama);
        System.out.println("Health : " + hp );
    }
    
    void attack(player musuh){
        System.out.println(this.nama + " Is attacking " + musuh.nama );
       
    }
    
    void defence (player musuh){
        System.out.println(musuh.nama + " Is defending attack from " + this.nama);
    
    }
    
}


class senjata{
    double damage;
    String nama;
    
    senjata(String inputnama, double inputdamage){
        this.damage = inputdamage;
        this.nama = inputnama;
    }
    
    void display(){
        System.out.println("Senjata : " + this.nama );
        System.out.println("Damage : " + this.damage);
        
    }
    
}

class armor{
    double defend;
    String nama;
    
    armor( String inputnama, double inputdefend){  
        this.defend = inputdefend;
        this.nama= inputnama;
    }
    
    void display(){
        System.out.println("Armor : " + this.nama);
        System.out.println("Defend : " + this.defend + "\n");
    }

}


public class Practice_OOP1 {

    public static void main(String[] args) {
        
        player player1 = new player("Batman",50);
        player player2 = new player("Spidey", 30);
        
        senjata senjata = new senjata("Pedang",80);
        senjata senjata2 = new senjata("Panci",20);
        
        armor armor = new armor ("Tameng",30);
        armor armor2 = new armor ("Kaos",5);
        
        player1.display();
        senjata.display();
        armor.display();
        
        player2.display();
        senjata2.display();
        armor2.display();
        
        System.out.println("PERTEMPURAN");
        player1.attack(player2);
        player1.defence(player2);
       
      
    }
}
