/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca_v2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author vanes
 */
public class Biblioteca_v2 {

     public static void porcentaje(){
       Bienvenida bv=new Bienvenida();
       bv.setVisible(true); 
       Login lg=new Login();
       try{
         for(int i=0; i<=100; i++){
           Thread.sleep(40);
           bv.Porcentaje.setText(Integer.toString(i)+"%");
           bv.Barra.setValue(i);  
           
           if(i ==100){
               bv.setVisible(false);
               lg.setVisible(true);
           }
       }  
       }catch(Exception e){
           
       }
    }
     public void tiempo(){
          Timer timer = new Timer(1000, e -> {
            Date date = new Date();

            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormatter.format(date);
            //dateLabel.setText(formattedDate);

            SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");
            String formattedTime = timeFormatter.format(date);
            //timeLabel.setText(formattedTime);

            
        });
        timer.start();
     }
     
    public static void main(String[] args) {
        porcentaje();
    }
    
}
