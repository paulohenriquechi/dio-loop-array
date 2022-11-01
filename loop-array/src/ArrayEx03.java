import java.util.Scanner;

public class ArrayEx03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[20];
        for(int i=0;i<20;i++){
            System.out.println("Número: ");
            int nOk = input.nextInt();
            if(nOk>100||nOk<0){
                System.out.println("Número inválido, tente novamente");
                i--;
            }else{
                n[i] = nOk;
            }
        }
        for(int i=19;i>=0;i--){
            System.out.println("A ordem reversa dos números é: "+n[i]);
        }
        input.close();
    }
}
