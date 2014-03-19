/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadsitos;

/**
 *
 * @author Universidad
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T107
 */
public class PrimerThread implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Creado
        
        Runnable r=new PrimerThread();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.setName("Primero");
        t2.setName("Segundo");
        
       // 2. Inicializado
        t1.start();
        t2.start();
    }

      // 3. En ejecución
    public void run() {
        try {
           
     if (Thread.currentThread().getName().   //SIEMPRE IMPLEMENTAR ESO
             equals("Primero")) Thread.sleep(4000);
             
         System.out.println("Soy el Thread" +
                 Thread.currentThread().getName());
           
            System.out.println("Soy un Thread en ejecución");
        } catch (InterruptedException ex) {
           
        }
        
        
    }
      // 5. Termina su ejecución
}

    
