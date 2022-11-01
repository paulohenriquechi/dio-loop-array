import java.util.Scanner;

public class ArrayEx02copy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] consoantes = new String[6];
        int count = 0;
        int quantidade = 0;
        do{
            System.out.println("Letra: ");
            String letra = input.nextLine();
            if(!(letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidade++;
            }
            count++;
        }while(count<consoantes.length);
        System.out.println("Consoantes: ");
        for(int i=0;i<consoantes.length;i++){
            if(consoantes[i]!=null){
                System.out.println(consoantes[i]);
            }
        }
        System.out.println("Número de consoantes: "+quantidade);
        input.close();
    }
}


