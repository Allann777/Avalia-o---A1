import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Nivel de acesso (1 a 10): ");
        int acesso = entrada.nextInt();

        System.out.print("Nivel de sigilo (1 a 10): ");
        int sigilo = entrada.nextInt();

        if (acesso < 1 || acesso > 10 || sigilo < 1 || sigilo > 10) {
            System.out.println("Valores invalidos");
        } else if (acesso >= sigilo) {
            System.out.println("ACESSO PERMITIDO para " + nome);
        } else {
            System.out.println("ACESSO NEGADO para " + nome);
        }
    }
    

    
