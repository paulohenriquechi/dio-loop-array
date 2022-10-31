import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("Digite o número que deseja saber a tabuada: ");
        int n = input.nextInt();
        System.out.println("Tabuada do "+n+":");
        for(int i=1;i<11;i++){
            r = n*i;
            System.out.println(n+"x"+i+" = "+r);
        }
    }
}
