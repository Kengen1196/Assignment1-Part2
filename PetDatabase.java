import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PetDatabase {
    // ArrayList for simplifying arrays
    private ArrayList<Pet> petArray;

    // Default constructor
    public PetDatabase() {
        petArray = new ArrayList<Pet>();
    }

    // Show entire list of pets
    public void viewPets() {
        // Header
        System.out.println("+-------------------+");
        System.out.println("|ID |NAME      |AGE |");
        System.out.println("+-------------------+");
        // Loops through entire array formatting what was assigned
        for (int i = 0; i < petArray.size(); i++) {
            System.out.println("|" + String.format("%-3d", i) + "|" + String.format("%-10s", petArray.get(i).getName())
                    + "|" + String.format("%-4d", petArray.get(i).getAge()) + "|");
        }
        // Bottom of the table
        System.out.println("+-------------------+");
        System.out.println(petArray.size() + " rows in set.");
    }

    // Adds pet to array and prints the new table
    public void addPets(String name, int age) {
        // if the list is under 5 and the ages are between 1 and 20 it will proceed
        if (petArray.size() < 5 && age > 0 && age <= 20) {
            petArray.add(new Pet(name, age));
            // Prints messages otherwise indicating why it failed
        } else {
            if (petArray.size() >= 5) {
                System.out.println("Database is full!");
            }
            if (age < 0 || age > 20) {
                System.out.println("That is not a valid age!");
            }
        }
        viewPets();
    }
}