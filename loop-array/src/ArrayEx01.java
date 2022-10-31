import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Digite o número: ");
            n[i] = input.nextInt();
        }
        System.out.println("Números informados na ordem inversa: ");
        for(int i=4;i>=0;i--){
            System.out.println(n[i]);
        }
        input.close();
    }
}
