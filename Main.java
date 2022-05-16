import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables used throughout the program
        Scanner input = new Scanner(System.in);
        PetDatabase database = new PetDatabase();
        int choice;
        boolean loop = true;
        String[] line;
        String name;
        int age;
        // Opening message
        System.out.println("Pet Database Program");
        // Loops until it is changed
        while (loop) {
            // Menu options
            System.out.println(
                    "What would you like to do?\n1) View all pets\n2) Add more pets\n7) Exit program");
            // Allows user to easily see their input
            System.out.print("Your Choice: ");
            // Used in the switch
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                // Views entire array
                case 1:
                    database.viewPets();
                    break;
                // Adds pet to array
                case 2:
                    System.out.print("Add pet ie. name age: ");
                    // split input line by space as it is assumed both are given
                    line = input.nextLine().split(" ");
                    // checks if there are 2 inputs
                    if (line.length == 2) {
                        name = line[0];
                        age = Integer.valueOf(line[1]);
                        database.addPets(name, age);
                    } else {
                        System.out.println("That is not a valid input!");
                        database.viewPets();
                    }
                    break;
                // Exits program
                case 7:
                    loop = false;
                    break;
            }
        }
        input.close();
    }
}