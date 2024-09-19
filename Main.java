import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetCRUD petCRUD = new PetCRUD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Cadastrar Animal");
            System.out.println("2. Listar Animais");
            System.out.println("3. Atualizar Animal");
            System.out.println("4. Excluir Animal");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o tipo do animal: ");
                    String tipo = scanner.nextLine();
                    petCRUD.cadastrarPet(nome, tipo);
                    break;
                case 2:
                    petCRUD.listarPets();
                    break;
                case 3:
                    System.out.print("Digite o nome do animal a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo tipo do animal: ");
                    String novoTipo = scanner.nextLine();
                    petCRUD.atualizarPet(nomeAtualizar, novoTipo);
                    break;
                case 4:
                    System.out.print("Digite o nome do animal a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    petCRUD.excluirPet(nomeExcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente uma opção de 1 a 5.");
            }
        }
    }
}
