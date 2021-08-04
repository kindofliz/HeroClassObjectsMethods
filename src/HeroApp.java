import java.util.Scanner;

public class HeroApp {

    public static void main(String[] args) {

        System.out.println();
        //Adding info for hero A
        Hero a = new Hero(101, "Liza", "Simanoviča", "DogoMom", "Riga", "Our Universe", false, 3050.90d, 55);
        System.out.println("HERO A: " + a);

        //Printing the level of hero A
        System.out.println("HERO A IS LEVEL " + a.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero b = new Hero(202, "Laura", "Vadone", "SuperWoman", "Riga", "Our Universe", false, 5060.45d, 19);
        System.out.println("HERO B: " + b);

        //Printing hero info using getter
        System.out.println("HERONAME OF HERO B: " + b.getHeroName());

        //Printing the level of hero B
        System.out.println("HERO B IS LEVEL " + b.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero c = new Hero(303, "Kūpers", "Staffstep", "LandShark", "Riga", "Unknown Universe", true, 300.15, 15);
        System.out.println("HERO C: " + c);
        System.out.println();






        //3. TASK. Create a new array Metropole with the type hero and put all created objects in it.
        Hero[] Metropole = {a, b, c};

        //Find out how many heroes are with level 1 in the Metropole with loop
        int counter = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("Number of LEVEL 1 heroes in Metropole is: " + counter);


        //Find out how many heroes are with the level which is larger than 1 in the Metropole
        int counter2 = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].calculatedLevel() > 1) {
                counter2++;
            }
        }
        System.out.println("Number of heroes in Metropole with level LARGER than 1 is:  " + counter2);


        //Find out if there is any hero with the name “John”
        int countJohn = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].getName().equalsIgnoreCase("John")) {
                countJohn++;
            }
        }
        System.out.println("Number of Metropole HEROES named John is: " + countJohn);
        System.out.println();





        //DISTRICT SAMPLE
        District district1 = new District();
        district1.addNewHero(a);
        System.out.println(district1.toString());










        //4. BONUS TASK
        //Using Scanner class, ask for input of all heroes values in the console and create the new hero in the system.
        //Add it in the Metropole array.
        System.out.println("----------------------------USER INPUT HERO-------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the heroID: ");
        int userInputHeroID = scanner.nextInt();

        System.out.println("Please input the Name: ");
        String userInputName = scanner.next();

        System.out.println("Please input the Surname: ");
        String userInputSurname = scanner.next();

        System.out.println("Please input the Hero Name: ");
        String userInputHeroName = scanner.next();

        System.out.println("Please input the Hero City: ");
        String userInputHeroCity = scanner.next();

        System.out.println("Please input the Hero Universe: ");
        String userInputUniverse = scanner.next();

        System.out.println("Is this hero a villain? (true or false): ");
        boolean userInputIsEvil = scanner.nextBoolean();

        System.out.println("Please input the Hero Salary: ");
        double userInputHeroSalary = scanner.nextDouble();

        System.out.println("Please input the Deed Time: ");
        int userInputDeedTime = scanner.nextInt();

        Hero d = new Hero (userInputHeroID, userInputName, userInputSurname, userInputHeroName, userInputHeroCity, userInputUniverse + " Universe", userInputIsEvil, userInputHeroSalary, userInputDeedTime);
        System.out.println("HERO D: " + d);
        System.out.println();

        //NOT COMPLETED - ADD THE NEW HERO (d) TO METROPOLE ARRAY







        //5. BONUS TASK
        //Output hero card by heroID









    }

}
