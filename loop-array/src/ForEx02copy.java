import java.util.Scanner;

public class ForEx02copy{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que deseja fatorar: ");
        int n = input.nextInt();
        for(int i=n;i!=1;i--){
            n = n*(n-1);
            System.out.println(n);
            n--;
        }
        input.close();
        System.out.println();
    }
}
