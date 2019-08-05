package Movies;

public class Ratings {
    private final int REVIEWERS = 10;
    private final int MOVIES = 5;

    private int[][] grid;

    public Ratings() {
        grid = new int[REVIEWERS][MOVIES];
    }

    public void set(int reviewer, int movie, int rating) {
        grid[reviewer][movie] = rating;
    }

    // return the value of the element in the specified position of the grid
    public int get(int reviewer, int movie) {
        return grid[reviewer][movie];
    }

    //Output the grid as a table. No headings are required.
    public void display() {
        for (int row = 0; row < REVIEWERS; row++) {
            for (int col = 0; col < MOVIES; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Count the number of ratings in the grid above the specified number
    public int countAbove(int value) {
        int total = 0;
        for (int row = 0; row < REVIEWERS; row++) {
            for (int col = 0; col < MOVIES; col++) {
                if (grid[row][col] > value)
                    total++;
            }
        }
        return total;
    }

}
