package Cinema;

import Cinema.SeatDetails;

public class SeatingChart {

/*
    private int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 40, 40, 40, 40, 40, 40, 40, 30}};

    private final int noOfRows = seats.length;
    private final int noOfCols = seats[0].length;

    // Outputs the 2d array contents as a table. No heading given here.
    public void display() {
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                System.out.printf("%3d", seats[i][j]);
            }
            System.out.println();
        }
    }

    // Sell seat given its row and col
    // Set the price to 0 to indicate it has been sold
    public void sellSeat(int row, int col) {
        if (seats[row][col] != 0) {
            seats[row][col] = 0;
        }
    }


    // check if the seat specified by row and col is sold
    public boolean isSold(int row, int col) {
        if (seats[row][col] == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Count the total number of seats that have been sold
    public int countNumberSold() {
        int numberSold = 0;
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                if (seats[i][j] == 0) {
                    numberSold++;
                }
            }
        }
        return numberSold;
    }


    public int totalUnSold(){
        int total = 0;
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                total += seats[i][j];
            }
        }
        return total;
    }

    //Count the number of seats that have been sold in the row specified as argument
    public int countNumberSoldInRow(int row) {
        int numberSold = 0;
        for (int j = 0; j < noOfCols; j++) {
            if (seats[row][j] == 0) {
                numberSold++;
            }
        }
        return numberSold;
    }

    public int[] noName() {  //Suitable Name: countNumberSoldInRow() counts number of unsold tickets per row
        int [] numbers = new int[noOfRows];
        for (int i = 0; i < noOfRows; i++) {
            numbers[i] = 0;
            for (int j = 0; j < noOfCols; j++) {
                if (seats[i][j] != 0) {
                    numbers[i]++;
                }
            }
        }
        return numbers;
    }
*/


    private final int ROWS = 10;
    private final int COLS = 10;

    private String[] rows =
            {
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F",
                    "G",
                    "H",
                    "I",
                    "J"
            };

    private String[] cols =
            {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
            };

    private SeatDetails[][] grid;

    public SeatingChart() {
        grid = new SeatDetails[ROWS][COLS];
        // the grid will have null values
    }

    public void set(int rows, int cols, SeatDetails details){
        grid[rows][cols] = details; //Allows User to set Seat to SeatChart position
    }

    public void display() {
        // display the grid
        System.out.printf("%12s", "  "); //Spaces for header ROW
        for (int i = 0; i < rows.length; i++){ //FOR LOOP Prints A-J Headings
            System.out.printf("%15s", rows[i]);
        } //ends header row iteration
        System.out.println(); //newline for grid
        for (int i = 0; i < COLS; i++) {
            System.out.printf("%12s", cols[i]); //Prints 1st Col (1-10)
            for(int j = 0; j < ROWS; j++){ //Fills 2D array with null values
                System.out.printf("%15s", grid[i][j]);
            }
            System.out.println();
        }
    }



}
