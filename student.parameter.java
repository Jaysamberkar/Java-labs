import java.util.*;

public class student {
    int id;
    String name ;
    student(int i,String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        student s1 = new student(111,"kedar");
        s1.display();
    }
}
