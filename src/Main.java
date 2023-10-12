import zad2.FoodDelivery;
import zad32.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Student student = new Student();
        Teacher teacher = new Teacher();
        PeopleInfo peopleInfo = new PeopleInfo();
        peopleInfo.humanId(student);
        peopleInfo.humanId(teacher);

        TurnRight right = new TurnRight();
        TurnLeft left = new TurnLeft();
        Plane plane = new Plane();


        plane.fly(right);
        plane.fly(left);


    }


}