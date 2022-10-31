import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = input.nextInt();
        while(nota>10||nota<0){
            System.out.println("Valor inválido, tente novamente:");
            nota = input.nextInt();
        }
        System.out.println("A nota digitada foi: "+nota);
        System.out.println("Fim do programa.");
        input.close();
    }
}
