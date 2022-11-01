import java.util.Scanner;

public class ArrayEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frase = new String [6];
        String[] consoante = new String [6];
        String[] vogais = {"a", "e", "i", "o", "u"};
        for(int i=0;i<=5;i++){
            System.out.println("Digite o caractere: ");
            frase[i] = input.nextLine();
            for(int j=0;j<=4;j++){
                if(frase[i].equalsIgnoreCase(vogais[j])){
                    consoante[j] = frase[i];
                }
            }
        }
        System.out.println("Consoantes: ");
        for(int i=0;i<consoante.length;i++){
            System.out.println(consoante[i]);
        }
        System.out.println("Quantidade de consoantes: "+consoante.length);
        input.close();
    }
}
