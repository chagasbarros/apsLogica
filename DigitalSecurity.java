import java.util.Scanner;

public class DigitalSecurity {
    public static void main(String[] args) {
        System.out.println("\n******BEM VINDO, AO CURSO DE SEGURANÇA DIGITAL!******");
        System.out.println("***APRENDEREMOS AS MELHORES PRÁTICAS CONTRA OS HACKERS***");

        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != 0) {
            System.out.println("\n**TEMOS OS MELHORES INSTRUTORES PARA TE ENSINAR!**");
            System.out.println("\nDigite: 1 - Chagas Barros (Criação de Senhas Seguras)");
            System.out.println("Digite: 2 - João Pedro (vai escolher o tema)");
            System.out.println("Digite: 3 - Marcos Vinicios (vai escolher o tema)");
            System.out.println("Digite: 0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> createStrongPassword(sc);
                case 2 -> System.out.println("\nOLÁ EU SOU O JOÃO PEDRO, E VOU TE ENSINAR SEGURANÇA");
                case 3 -> System.out.println("\nOLÁ EU SOU O MARCOS VINICIOS, E VOU TE ENSINAR SEGURANÇA");
                case 0 -> System.out.println("\nSaindo do curso...");
                default -> System.out.println("Opção inválida, por favor escolha uma opção válida.");             
            }
        }
        sc.close();
    }
    public static void createStrongPassword(Scanner sc) {

        System.out.println("\nVAMOS CRIAR UMA SENHA SEGURA!");
        Boolean validPassword = false;
        String password;

        while (!validPassword) {
            System.out.print("\nPasso 1: Digite uma senha para testarmos: ");
            password = sc.next();

            if (password.length() < 8) {
                System.out.println("A senha deve conter pelo menos 8 caracteres.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra minúscula.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("A senha deve conter pelo menos um número.");
            } else if (!password.matches(".*[!@#$%^&*()].*")) {
                System.out.println("A senha deve conter pelo menos um caractere especial (!@#$%^&*()).");
            } else {
                validPassword = true;
                System.out.println("SENHA CRIADA COM SUCESSO!");
            }
        }
    }

    // Aqui vocês podem adicionar os métodos de vocês. 
}
