package Timetable;

import Timetable.ClassDetails;

public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9;  // 9 hours per day

    private String[] hours =
            {
                    "9-10",
                    "10-11",
                    "11-12",
                    "12-1",
                    "1-2",
                    "2-3",
                    "3-4",
                    "4-5",
                    "5-6"
            };

    private String[] days =
            {
                    "Mon",
                    "Tue",
                    "Wed",
                    "Thr",
                    "Fri"
            };

    private ClassDetails[][] grid;

    public TimeTable() {
        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values
    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid
        grid[day][hour] = details;
    }

    public void display() {
        // display the grid

        System.out.printf("%12s", "  ");
        for (int i = 0; i < hours.length; i++){
            System.out.printf("%15s", hours[i]);
        }
        System.out.println();

        // Print
        for (int i = 0; i < DAYS; i++) {
            // Process the ith row

            System.out.printf("%12s", days[i]);

            for(int j = 0; j < HOURS; j++){
                    System.out.printf("%15s", grid[i][j]);
               }
               System.out.println();
            }

        }
        


    }
