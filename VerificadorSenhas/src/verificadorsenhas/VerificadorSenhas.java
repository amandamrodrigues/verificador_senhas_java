package verificadorsenhas;

import java.util.Scanner;

public class VerificadorSenhas {

    public static void main(String[] args) {
        System.out.println("Digite sua senha:");
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();
        int contador = 1;
      
        while (!senha.equals("senha123") && contador <= 2) {
            System.out.println("Senha Incorreta, tente novamente:");
            System.out.println("Suas tentatias restantes " + (3 - contador));
            contador++;
            senha = sc.next();
        }
        System.out.println();
        if (senha.equals("senha123")) {
            System.out.println("ACESSO PERMITIDO");

        } else {
            System.out.println("ACESSO BLOQUEADO - Senha Incorreta");
        }
        sc.close();
    }
}
