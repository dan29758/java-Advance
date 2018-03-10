/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaclase1;

/**
 *
 * @author EducaciónIT
 */
public class MetodoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de aplicacion");
       
        MiHilo hilo = new MiHilo();
        hilo.start();
        
        MiRunnable runnable1 = new MiRunnable();
        Thread hilo2 = new Thread(runnable1);
        hilo2.start();
        System.out.println("Fin Aplicacion");
        
        
    }
    
}
