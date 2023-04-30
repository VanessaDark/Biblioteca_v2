/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca_v2;

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
     
    public static void main(String[] args) {
       porcentaje();
    }
    
}
