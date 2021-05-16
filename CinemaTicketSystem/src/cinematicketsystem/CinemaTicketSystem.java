/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketsystem;


/**
 *
 * @author hurua
 */
public class CinemaTicketSystem {

    public CinemaTicketSystem(int place) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0,place=0;
       
        CinemaBook Films = new CinemaBook(choice);
        Films.ChooseFilm();
       Ticket Order=new Ticket();
      Order.OrderTicket(place);
      
       
        
   
}}
  
