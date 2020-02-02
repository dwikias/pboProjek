/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author dwiki
 */
public class Player {

// ini atribut
    String nama;
    int healtpoint;
    int jarak ;
    boolean lelah = false; 
    
    public void run(){
        System.out.println(this.nama +" mulai berlari...");
    }
    
    public void isDead(){
        if (this.healtpoint <= 1){
            System.out.println(this.nama+" mulai kelelahan, kemudian istirahat...");
            lelah = true;
        }else {
            System.out.println(this.nama+" terus berlari...");
        }
    }
    
    public void stamina(){
        if (this.jarak > 50 ){
            System.out.println(this.nama+" kecepatannya mulai berkurang");
            if (this.healtpoint > 1){
                System.out.println("mereka terus berlari..");
            }
        }else {
            System.out.println("kecepatan "+this.nama+" masih stabil, namun stamina mulai berkurang");
        }
    }
    
     // method tanpa return dan tanpa parameter
    void minum (){
        if (lelah){
            System.out.println(this.nama+ "pun minum sebotol air meneral");
        }else {
            System.out.println(this.nama+ "pun melanjutkan larinya");
        }
    }

    public void finish(){
        if (this.jarak >= 100){
            System.out.println(this.nama+" mancapai finish");      
        }else {
            System.out.println(this.nama+" gagal menjadi juara");
        }
    }
    
    //method dengan return dan parameter
    String sayTks(String message){
        return message + " sudah memainkan game lari ini ";
    }
        
       
    public static void main(String[] args) {
        
        Player budi = new Player();
        budi.nama = "Budi";
        budi.healtpoint=5;
        
        Player bagus = new Player();
        bagus.nama = "Bagus";
        bagus.healtpoint= 5;
        
        Player terimakasih = new Player();
        
        start mulai = new start();
        budi.run();
        bagus.run();
        budi.jarak=30;
        bagus.jarak=40;
        budi.healtpoint=2;
        bagus.healtpoint=4;        
        budi.isDead();
        bagus.isDead();
        budi.stamina();
        bagus.stamina();    
        
     
        budi.jarak=70;
        bagus.jarak=100;
        budi.healtpoint=1;
        bagus.healtpoint=3;        
        budi.isDead();
        budi.minum();
        bagus.isDead();
        bagus.minum();
        budi.stamina();
        bagus.stamina();    
        
        if (budi.jarak >=100){
            budi.finish();
        }else {
            bagus.finish();
        }
        
        System.out.println("GAME OVER!!!");
        String data = terimakasih.sayTks("Terimakasih");
        System.out.println(data);
    }
    
}
