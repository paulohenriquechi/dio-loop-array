import java.util.Scanner;

public class ForEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que deseja fatorar: ");
        int n = input.nextInt();
        int fat = n;
        for(int i=n;i!=1;i--){
            n--;
            fat = fat*n;
        }
        input.close();
        System.out.println(fat);
    }
}
