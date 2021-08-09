import java.util.ArrayList;
import java.util.Scanner;

public class HeroApp {

    public static void main(String[] args) {

        System.out.println();
        //Adding info for hero A
        Hero a = new Hero(101, "Liza", "Simanoviča", "DogoMom", "Riga", "Our Universe", HeroType.Hero, 3050.90d, 55);
        System.out.println("HERO A: " + a);

        //Printing the level of hero A
        System.out.println("HERO A IS LEVEL " + a.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero b = new Hero(202, "Laura", "Vadone", "SuperWoman", "Riga", "Our Universe", HeroType.Hero, 5060.45d, 19);
        System.out.println("HERO B: " + b);

        //Printing hero info using getter
        System.out.println("HERONAME OF HERO B: " + b.getHeroName());

        //Printing the level of hero B
        System.out.println("HERO B IS LEVEL " + b.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero c = new Hero(303, "Kūpers", "Staffstep", "LandShark", "Riga", "Unknown Universe", HeroType.Villain, 300.15, 15);
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


//        //4. BONUS TASK
//        //Using Scanner class, ask for input of all heroes values in the console and create the new hero in the system.
//        //Add it in the Metropole array.
//        System.out.println("----------------------------USER INPUT HERO-------------------------------");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please input the heroID: ");
//        int userInputHeroID = scanner.nextInt();
//
//        System.out.println("Please input the Name: ");
//        String userInputName = scanner.next();
//
//        System.out.println("Please input the Surname: ");
//        String userInputSurname = scanner.next();
//
//        System.out.println("Please input the Hero Name: ");
//        String userInputHeroName = scanner.next();
//
//        System.out.println("Please input the Hero City: ");
//        String userInputHeroCity = scanner.next();
//
//        System.out.println("Please input the Hero Universe: ");
//        String userInputUniverse = scanner.next();
//
//        System.out.println("Is this hero a Villain or a Hero?: ");
//        HeroType userInputHeroType = HeroType.valueOf(scanner.next());
//
//        System.out.println("Please input the Hero Salary: ");
//        double userInputHeroSalary = scanner.nextDouble();
//
//        System.out.println("Please input the Deed Time: ");
//        int userInputDeedTime = scanner.nextInt();
//
//        Hero d = new Hero (userInputHeroID, userInputName, userInputSurname, userInputHeroName, userInputHeroCity, userInputUniverse + " Universe", userInputHeroType, userInputHeroSalary, userInputDeedTime);
//        System.out.println("HERO D: " + d);
//        System.out.println();
//
//        //NOT COMPLETED - ADD THE NEW HERO (d) TO METROPOLE ARRAY


        //DISTRICT SAMPLE HOMEWORK: TASK 1

        //create seven heroes
        Hero hero1 = new Hero(404, "An", "Simpson", "Sugar", "LightCity", "This Universe", HeroType.Hero, 956.55, 103);
        Hero hero2 = new Hero(505, "Dan", "Simpson", "DanMan", "LightCity", "This Universe", HeroType.Hero, 303, 3);
        Hero hero3 = new Hero(606, "Hahn", "Lawrence", "BeesKnee", "LightCity", "This Universe", HeroType.Hero, 999.3, 45);

        Hero hero4 = new Hero(707, "Jane", "Doom", "DrDoom", "DarkCity", "This Universe", HeroType.Villain, 2633, 35);
        Hero hero5 = new Hero(808, "Deen", "Gloomer", "Gloom", "DarkCity", "This Universe", HeroType.Villain, 155, 18);
        Hero hero6 = new Hero(909, "John", "Baloon", "Boom", "DarkCity", "This Universe", HeroType.Villain, 672.61, 3);
        Hero hero7 = new Hero(919, "Ronnie", "Knifes", "SharpHands", "DarkCity", "This Universe", HeroType.Villain, 1003.5, 9);

        //Create two districts
        //Add three heroes in the first District and others in the second District.
        District district1 = new District();
        district1.setTitle("District99");
        district1.setCity("LightCity");
        district1.setDistrictID(99);
        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);

        District district2 = new District();
        district2.setTitle("District33");
        district2.setCity("DarkCity");
        district2.setDistrictID(33);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);


        //Print out all information about each District.
        System.out.println("Information on DISTRICT 1: " + district1);
        System.out.println("Information on DISTRICT 2: " + district2);
        System.out.println();

        //Remove one hero from the second District.
        district2.removeHero(3);


        //e. Calculate (and print) average level of each District.
        System.out.println("Average District Level in DISTRICT 1: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average District Level in DISTRICT 2: " + district2.calculateAvgLevelInDistrict());
        System.out.println();

        //g. Create an arraylist of the Districts and put both District objects in the arraylist.
        ArrayList<District> districts = new ArrayList<>();
        districts.add(district1);
        districts.add(district2);
        System.out.println("Information on the DISTRICT array: " + districts);



        //h. Calculate how many heroes are in both Districts.
        System.out.println("Number of heroes in DISTRICT 1: " + district1.heroesInTheDistrict.size());
        System.out.println("Number of heroes in DISTRICT 2: " + district2.heroesInTheDistrict.size());
        System.out.println();


        //j. Find out which District is the best based on the average level of heroes.
        if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("DISTRICT 1 is better than District 2!");
        } else if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("DISTRICT 2 is better than District 1!");
        } else if (district1.calculateAvgLevelInDistrict() == district2.calculateAvgLevelInDistrict()) {
            System.out.println("BOTH districts are equally good!");
        } else {
            System.out.println("There seems to be an error..");
        }
        System.out.println();


        //k. Delete the first District. What’s happening with heroes in there?
        //








        }
    }

























