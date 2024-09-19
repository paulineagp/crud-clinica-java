import java.util.ArrayList;
import java.util.List;

public class PetCRUD {
    private List<Pet> pets;

    public PetCRUD() {
        this.pets = new ArrayList<>();
    }

    public void cadastrarPet(String nome, String tipo) {
        Pet pet = new Pet(nome, tipo);
        pets.add(pet);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public void listarPets() {
        System.out.println("Lista de Animais:");
        if (pets.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Pet pet : pets) {
                System.out.println(pet);
            }
        }
    }

    public void atualizarPet(String nome, String novoTipo) {
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.getNome().equals(nome)) {
                pet = new Pet(nome, novoTipo);
                pets.set(i, pet);  // Substitui o objeto antigo na lista pelo novo
                System.out.println("Animal atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public void excluirPet(String nome) {
        boolean removido = pets.removeIf(pet -> pet.getNome().equals(nome));
        if (removido) {
            System.out.println("Animal excluído com sucesso!");
        } else {
            System.out.println("Animal não encontrado.");
        }
    }
}
