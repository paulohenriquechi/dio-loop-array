import java.util.Scanner;

public class DoWhileEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int par = 0;
        int impar = 0;
        int soma = 0;
        int i = 0;
        System.out.println("Quantos números você irá digitar?: ");
        int nMax = input.nextInt();
        do{
            System.out.println("Número: ");
            n = input.nextInt();
            if(n%2==0){
                par++;
            }else{
                impar++;
            }
            soma += n;
            i++;
        }while(i<nMax);
        input.close();
        System.out.println("A soma de todos os números é: "+soma);
        System.out.println("Números pares: "+par);
        System.out.println("Números impares: "+impar);
    }
}
