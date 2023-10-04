import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PetManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetStore petStore = new PetStore();

        while (true) {
            System.out.println("Pet Management System");
            System.out.println("1. Add Pet");
            System.out.println("2. List All Pets");
            System.out.println("3. Find Pet by Name");
            System.out.println("4. Remove Pet");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter pet name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter pet age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter pet breed: ");
                    String breed = scanner.nextLine();
                    Pet pet = new Pet(name, age, breed);
                    petStore.addPet(pet);
                    System.out.println("Pet added successfully!");
                    break;
                case 2:
                    List<Pet> allPets = petStore.getAllPets();
                    System.out.println("All Pets:");
                    for (Pet p : allPets) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.print("Enter pet name to search: ");
                    String searchName = scanner.nextLine();
                    Pet foundPet = petStore.findPetByName(searchName);
                    if (foundPet != null) {
                        System.out.println("Found Pet: " + foundPet);
                    } else {
                        System.out.println("Pet not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter pet name to remove: ");
                    String removeName = scanner.nextLine();
                    petStore.removePet(removeName);
                    System.out.println("Pet removed successfully!");
                    break;
                case 5:
                    System.out.println("Exiting the Pet Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
