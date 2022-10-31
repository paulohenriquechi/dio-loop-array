import java.util.Scanner;

public class DoWhileEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;
        double maior = 0;
        double soma = 0;
        int i = 0;
        do{
            System.out.println("Numero: ");
            numero = input.nextInt();
            i++;
            if(numero>maior) maior = numero;
            soma += numero;
        }while(i<5);
        double media = soma/5;
        System.out.println("Maior numero: "+maior);
        System.out.println("Media: "+media);
    }
}
