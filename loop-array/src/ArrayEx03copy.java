import java.util.Random;

public class ArrayEx03copy {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nRandom = new int[20];
        for(int i=0;i<nRandom.length;i++){
            int numero = random.nextInt(100);
            nRandom[i] = numero;
        }
        System.out.println("\nPrevious Random Numbers: ");
        for(int numero : nRandom){
            System.out.print((numero-1)+" ");    
        }
        System.out.println("\nRandom Numbers: ");
        for(int numero : nRandom){
            System.out.print(numero+" ");
        }
        System.out.println("\nRandom Numbers: ");
        for(int numero : nRandom){
            System.out.print((numero+1)+" ");
        }
    }
}