/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.lang.Math;
public class Void {
    double jarijari;
    double luaspermukaan;
    double volume;
    
    void Void(double jarijari){
        this.jarijari = jarijari;
    }
    void Tampil(){
        luaspermukaan = 4*Math.PI*Math.pow(jarijari,2);
        System.out.println("Luas Permukaan Bola : "+luaspermukaan);
        volume = 4/3*Math.PI*Math.pow(jarijari,3);
        System.out.println("Volume Bola : "+volume);
    }

}
