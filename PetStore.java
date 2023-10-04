import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PetStore {
    private List<Pet> petList;

    public PetStore() {
        petList = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public List<Pet> getAllPets() {
        return petList;
    }

    public Pet findPetByName(String name) {
        for (Pet pet : petList) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void removePet(String name) {
        Pet petToRemove = findPetByName(name);
        if (petToRemove != null) {
            petList.remove(petToRemove);
        }
    }
}

 