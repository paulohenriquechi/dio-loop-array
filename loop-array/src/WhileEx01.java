import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        while(true){
            System.out.println("Nome: ");
            nome = input.next();
            if(nome.equals("0")){
                break;
            }
            System.out.println("Idade: ");
            idade = input.nextInt();
        }
        input.close();
        System.out.println("Fim do programa");
    }
}
