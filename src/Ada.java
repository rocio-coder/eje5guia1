import java.util.Scanner;

public class Ada {
    public static void main(String[] args) {
        int base ;
                int altura;
        Scanner scanner = new Scanner (System.in);
                System.out.println("ingrese base de un triangulo: ");

                altura= scanner.nextInt();
        int area = ( base * altura) / 2;

                System.out.print("el area de un triangulo es "+""+area);
    }
}