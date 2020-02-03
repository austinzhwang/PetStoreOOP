import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String name = "", type = "", desc = "", again = "";

        ArrayList<Animal> animalList = new ArrayList<>();

        Animal a = new Animal(name, type, desc);
        System.out.print("What is the animal's name? ");
        name = in.nextLine();
        a.setName(name);
        System.out.print("What is the animal's type? ");
        type = in.nextLine();
        a.setType(type);
        System.out.print("Enter a description for the animal: ");
        desc = in.nextLine();
        a.setDescription(desc);
        animalList.add(a);

        System.out.println();
        for (Animal key : animalList) {
            System.out.println(key.getPet() + "\n");
        }
    }

}
