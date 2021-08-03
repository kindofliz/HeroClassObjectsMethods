public class HeroApp {

    public static void main(String[] args) {
        //Getting info for hero A
        Hero a = new Hero("Liza", "Simanovica", "DogoMom", "Riga", "Our Universe", false, 3050.90d, 55);
        System.out.println(a);

        //Printing the level of hero A
        System.out.println(a.calculatedLevel());

        System.out.println();


        //Adding a new hero
        Hero b = new Hero("Laura", "Vadone", "SuperWoman", "Riga", "Our Universe", false, 5060.45d, 19);
        System.out.println(b);

        //Printing hero info using getter
        System.out.println("HeroName of hero B: " + b.getHeroName());

        //Printing the level of hero B
        System.out.println(b.calculatedLevel());


        //Adding a new hero
        Hero c = new Hero("Kupers", "Staffstep", "LandShark", "Riga", "Unknown Universe", true, 300.15, 23);
        System.out.println(c);


        //Create a new array Metropole with the type hero and put all created objects in it.
        Hero[] Metropole = {a, b, c};

//       //Find out how many heroes are with level 1 in the Metropole (without loop)
//        int counter = 0;
//        if ((a.calculatedLevel() == 1) || (b.calculatedLevel() == 1) || (c.calculatedLevel() == 1)) {
//            counter++;
//        }
//        System.out.println("Heroes with level one: " + counter);

        //Find out how many heroes are with level 1 in the Metropole with loop


    }


}
