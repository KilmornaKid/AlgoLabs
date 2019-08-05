package Cinema;

import Cinema.SeatDetails;
import Cinema.SeatingChart;

public class SeatingChartTest {
    public static void main(String[] args) {

        /*
        //Declaring a seatingChart object
        Cinema.SeatingChart ch = new Cinema.SeatingChart();
        System.out.println("\nSeating Chart\n");
        System.out.println("Total Unsold price: Euros "+ch.totalUnSold());
        ch.display();
        System.out.println("\nTotal for 1st row: "+ch.countNumberSoldInRow(0)); //Expected Value: 0

        ch.sellSeat(0,0);   //Expected Value: Seat at 0,0 set to 0
        ch.sellSeat(3,2);   //Expected Value: Seat at 3,2 set to 0
        ch.sellSeat(1,4);   //Expected Value: Seat at 1,4 set to 0
        ch.sellSeat(5,7);   //Expected Value: Seat at 5,7 set to 0
        System.out.println("\nSeating Chart Updated\n");
        ch.display();
        System.out.println("\nTotal for 1st row: "+ch.countNumberSoldInRow(0));                  //Expected Value: 1
        System.out.println("\nIs the seat at the row 0, col 0 sold: "+ch.isSold(0,0)); //Expected Value: true
        System.out.println("Is the seat at the row 1, col 0 sold: "+ch.isSold(1,0));   //Expected Value: false
        System.out.println("Is the seat at the row 3, col 2 sold: "+ch.isSold(3,2));   //Expected Value: true

        System.out.println("Number of seats sold: "+ch.countNumberSold());                       //Expected Value: 4
        //Prints int Array
        System.out.println("Number of unsold seats per row: "+Arrays.toString(ch.noName()));     //Expected Value: 9, 9, 10, 9, 10, 9, 10, 10 ,10
        System.out.println("Total cost unsold overall: Euro "+ch.totalUnSold());                 //Expected Value: 1720
        */






        SeatingChart ch = new SeatingChart();
        SeatDetails se10A = new SeatDetails(true,  10);
        SeatDetails se10B = new SeatDetails(false, 10);
        SeatDetails se20A = new SeatDetails(true,  20);
        SeatDetails se20B = new SeatDetails(false,  20);
        SeatDetails se30A = new SeatDetails(true,  30);
        SeatDetails se30B = new SeatDetails(false,  30);
        SeatDetails se40A = new SeatDetails(true,  40);
        SeatDetails se40B = new SeatDetails(false,  40);
        SeatDetails se50A = new SeatDetails(true,  50);
        SeatDetails se50B = new SeatDetails(false,  50);



        ch.set(0,0, se10A);
        ch.set(0,1, se10A);
        ch.set(0,2, se10B);
        ch.set(0,3, se10B);
        ch.set(0,4, se10B);
        ch.set(0,5, se10B);
        ch.set(0,6, se10B);
        ch.set(0,7, se10B);
        ch.set(0,8, se10B);
        ch.set(0,9, se10B);

        ch.set(1,0, se10B);
        ch.set(1,1, se10B);
        ch.set(1,2, se10B);
        ch.set(1,3, se10B);
        ch.set(1,4, se10B);
        ch.set(1,5, se10B);
        ch.set(1,6, se10B);
        ch.set(1,7, se10B);
        ch.set(1,8, se10B);
        ch.set(1,9, se10B);

        ch.set(2,0, se10B);
        ch.set(2,1, se10B);
        ch.set(2,2, se10B);
        ch.set(2,3, se10B);
        ch.set(2,4, se10B);
        ch.set(2,5, se10B);
        ch.set(2,6, se10B);
        ch.set(2,7, se10B);
        ch.set(2,8, se10B);
        ch.set(2,9, se10B);

        ch.set(3,0, se10B);
        ch.set(3,1, se10B);
        ch.set(3,2, se20A);
        ch.set(3,3, se20A);
        ch.set(3,4, se20A);
        ch.set(3,5, se20A);
        ch.set(3,6, se20A);
        ch.set(3,7, se20A);
        ch.set(3,8, se10A);
        ch.set(3,9, se10A);

        ch.set(4,0, se10A);
        ch.set(4,1, se10A);
        ch.set(4,2, se20A);
        ch.set(4,3, se20A);
        ch.set(4,4, se20A);
        ch.set(4,5, se20A);
        ch.set(4,6, se20A);
        ch.set(4,7, se20A);
        ch.set(4,8, se10A);
        ch.set(4,9, se10A);

        ch.set(5,0, se10A);
        ch.set(5,1, se10A);
        ch.set(5,2, se20B);
        ch.set(5,3, se20B);
        ch.set(5,4, se20B);
        ch.set(5,5, se20B);
        ch.set(5,6, se20A);
        ch.set(5,7, se20A);
        ch.set(5,8, se10A);
        ch.set(5,9, se10A);

        ch.set(6,0, se20A);
        ch.set(6,1, se20A);
        ch.set(6,2, se30A);
        ch.set(6,3, se30A);
        ch.set(6,4, se30B);
        ch.set(6,5, se40A);
        ch.set(6,6, se30A);
        ch.set(6,7, se30A);
        ch.set(6,8, se20B);
        ch.set(6,9, se20B);

        ch.set(7,0, se20B);
        ch.set(7,1, se30B);
        ch.set(7,2, se30B);
        ch.set(7,3, se40B);
        ch.set(7,4, se50A);
        ch.set(7,5, se50B);
        ch.set(7,6, se40B);
        ch.set(7,7, se30B);
        ch.set(7,8, se30B);
        ch.set(7,9, se20A);

        ch.set(8,0, se30A);
        ch.set(8,1, se40B);
        ch.set(8,2, se40B);
        ch.set(8,3, se40B);
        ch.set(8,4, se40B);
        ch.set(8,5, se40B);
        ch.set(8,6, se40B);
        ch.set(8,7, se40B);
        ch.set(8,8, se40B);
        ch.set(8,9, se30A);

        ch.set(9,0, se30A);
        ch.set(9,1, se40B);
        ch.set(9,2, se40B);
        ch.set(9,3, se40B);
        ch.set(9,4, se40B);
        ch.set(9,5, se40B);
        ch.set(9,6, se40B);
        ch.set(9,7, se40B);
        ch.set(9,8, se40B);
        ch.set(9,9, se30A);

        ch.display();



    }
}
