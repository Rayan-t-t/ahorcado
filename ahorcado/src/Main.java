import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String palabra(String palabra, String user) {
        ArrayList<char[]> palabras = new ArrayList();
        palabras.add(palabra.toCharArray());
    for ( char c : palabra.toCharArray()) {
        System.out.print("_");
    }
    String Result =palabra;
    return Result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        palabra.toLowerCase();
      for(int i = 0; i < 50; i++) {
          System.out.println(" ");
      }
       String result = palabra(palabra," ");
      System.out.println(" ");
     int intento=1;
     String letra;
     ArrayList<char[]> Userletters = new ArrayList();
     while (intento <=6) {
         letra =sc.nextLine();
         letra.toLowerCase();
         Userletters.add(letra.toCharArray());
         if (result.contains(letra)) {
            System.out.println(result);
         }

     }
    }
}