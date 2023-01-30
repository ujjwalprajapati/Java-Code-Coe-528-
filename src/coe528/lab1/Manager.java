
package coe528.lab1;

import java.util.ArrayList;


public class Manager {
    
    private Flight flights[] = new Flight[8];
   private Ticket tickets[] = new Ticket[100];
    //ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    //public Manager(Flight[] flights, Ticket[] tickets){ 
    //}
    public void createFlights(){
        flights[0]=new Flight(181,"Toronto","New York","22:30",200,1200);
        flights[1]=new Flight(300,"Moscow","Copenhagen","11:00",342,500);
        flights[2]=new Flight(901,"New Delhi","Kolkata","21:09",200,40);
        flights[3]=new Flight(833,"Calgary","Edmonton","1:09",100,150);
        flights[4]= new Flight(600,"Toronto","New York","10:00",2,200);
        flights[5]=new Flight(312,"London","Montreal","13:15",212,3000);
        flights[6]= new Flight(001,"Sydney","Melbourne","12:00",299,100);
        flights[7]= new Flight(655,"Jamaica","Chicago","17:05",150,600);
        //System.out.println(flights[1]);
        //System.out.println(flights[2]);
    }
    public void displayAvailableFlights(String origin, String destination){
        int i;
        for(i=0;i<flights.length;i++){
        if(origin==flights[i].getOrigin() && destination == flights[i].getDestination()&& flights[i].getnumberOfSeatsLeft()!=0){
            System.out.println(flights[i]);
        }
        
    }
       
    }
    public Flight getFlight(int flightNumber){
      int j;
      Flight rii=null;
       for(j=0;j<flights.length;j++){
           if(flightNumber==flights[j].getflightNumber())
              rii = flights[j];
          
       }
       return rii;
    }
    public void bookSeat(int flightNumber, Passenger p){
        int count = 0;
        int ij=1;
        int k;
        for(k=0;k<flights.length;k++){
      if(flightNumber==flights[k].getflightNumber()){
          ij =1;
          System.out.println("Flight Exists");
          if(flights[k].getnumberOfSeatsLeft()>0){
              System.out.println(flights[k].bookAseat());
             double r = p.applyDiscount(flights[k].getoriginalPrice());
            
               //tickets.add(new Ticket(p,flights[k],r));
               // This is the problematic ting
               tickets[count] = new Ticket(p,flights[k],r);
               System.out.println(tickets[count]);
          }
          else{
              System.out.println("There's no seats left in this flight");
                      }
          
      }
          
    }
        if(ij!=1){
            System.out.println("The flight number doesn't exist");
        }
        count++;
    }
   public static void main(String[] args){
     Manager a = new Manager();
     a.createFlights();
     a.displayAvailableFlights("Toronto", "New York");
     a.displayAvailableFlights("New Delhi","Kolkata");
     System.out.println();
     
     System.out.println(a.getFlight(655));
     System.out.println(a.getFlight(001));
     System.out.println();
     
     Passenger Ujjwal = new Member("Ujjwal",19,9);
     Passenger Uzi = new NonMember("Lil Uzi Vert",75);
     Passenger JuiceWrld = new Member("Juice Wrld",26,2);
     Passenger Grace = new NonMember("Grace",20);
     
     a.bookSeat(181,Uzi);
     a.bookSeat(600,Ujjwal);
     a.bookSeat(600,JuiceWrld);
     a.bookSeat(300,Grace);
     a.bookSeat(600,Uzi);
     a.bookSeat(78,JuiceWrld);
     
     a.displayAvailableFlights("Toronto","New York");
     
   } 
}
