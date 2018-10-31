package info.first;

import info.first.zadania.User;

import java.awt.*;
import java.util.Scanner;

public  class App
{
    public static void main( String[] args )
    {
//
//    Cat cat = new Cat();
//
//        System.out.println(cat.color);
//        System.out.println(cat.legs);
//        cat.cook(Color.blue);
//        System.out.println(cat.color);
//
        System.out.print("podaj username: ");
      // Ipnut();
     String username = Ipnut();
        System.out.print("podaj upassword: ");
     String password = Ipnut();
        System.out.println("Twoj user to : " +username);
        System.out.println("Twoj password to : " +password);
// z innej klasy
        User user = new User(username,password);
        System.out.println("Stworzono: " + user.getUsername() +" \n" +"haslo: " + user.getPassword());



}

private static String Ipnut()
{
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();

}
}
