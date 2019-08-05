package Timetable;

import Timetable.ClassDetails;
import Timetable.TimeTable;

public class TwoDArrayMain {
    public static void main(String[] args) {

        ClassDetails classDetails1 = new ClassDetails("Scrip", "S206");
        ClassDetails  classDetails2 = new ClassDetails("Algo", "S306");
        ClassDetails  classDetails3 = new ClassDetails("Web", "S106");
        ClassDetails  classDetails4 = new ClassDetails("Net", "R306");
        ClassDetails  classDetails5 = new ClassDetails("Data", "R302");
        ClassDetails  classDetails6 = new ClassDetails("Break", "");


        TimeTable tt = new TimeTable();
        tt.set(0,0, classDetails1);
        tt.set(0,1, classDetails1);
        tt.set(0,2, classDetails2);
        tt.set(0,3, classDetails6);
        tt.set(0,4, classDetails2);
        tt.set(0,5, classDetails3);
        tt.set(0,6, classDetails4);
        tt.set(0,7, classDetails5);
        tt.set(0,8, classDetails5);

        tt.set(1,0, classDetails1);
        tt.set(1,1, classDetails1);
        tt.set(1,2, classDetails2);
        tt.set(1,3, classDetails6);
        tt.set(1,4, classDetails2);
        tt.set(1,5, classDetails3);
        tt.set(1,6, classDetails4);
        tt.set(1,7, classDetails5);
        tt.set(1,8, classDetails5);

        tt.set(2,0, classDetails1);
        tt.set(2,1, classDetails1);
        tt.set(2,2, classDetails2);
        tt.set(2,3, classDetails6);
        tt.set(2,4, classDetails2);
        tt.set(2,5, classDetails3);
        tt.set(2,6, classDetails4);
        tt.set(2,7, classDetails5);
        tt.set(2,8, classDetails5);

        tt.set(3,0, classDetails1);
        tt.set(3,1, classDetails1);
        tt.set(3,2, classDetails2);
        tt.set(3,3, classDetails6);
        tt.set(3,4, classDetails2);
        tt.set(3,5, classDetails3);
        tt.set(3,6, classDetails4);
        tt.set(3,7, classDetails5);
        tt.set(3,8, classDetails5);

        tt.set(4,0, classDetails1);
        tt.set(4,1, classDetails1);
        tt.set(4,2, classDetails2);
        tt.set(4,3, classDetails6);
        tt.set(4,4, classDetails2);
        tt.set(4,5, classDetails3);
        tt.set(4,6, classDetails4);
        tt.set(4,7, classDetails5);
        tt.set(4,8, classDetails5);



        tt.display();

    }

}
