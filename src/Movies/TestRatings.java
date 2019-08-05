package Movies;

public class TestRatings {
    public static void main(String[] args) {
        Ratings ratings = new Ratings();
        ratings.set(0, 2, 5);
        ratings.set(1, 2, 7);
        ratings.set(3, 0, 7);
        ratings.set(3, 4, 9);
        ratings.set(5, 0, 3);
        ratings.set(9, 4, 10);

        ratings.display();

        int rating = ratings.get(9,4);
        System.out.println(rating); //expect 10

        rating = ratings.get(8,2);
        System.out.println(rating); //expect 0

        int number = ratings.countAbove(5);
        System.out.println(number);  // expect 4
    }

}
