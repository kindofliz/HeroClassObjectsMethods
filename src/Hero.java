public class Hero {
    //Attributes/Properties
    private int heroID;
    private String name;
    private String surname;
    private String heroName;
    private String heroCity;
    private String universe;
    private HeroType heroType;
    private double heroSalary;
    private int deedTime;

    //non-argument constructor (+ this one is hardcoded with values)
    public Hero() {
        this.heroID = 101;
        this.name = "Liza";
        this.surname = "Simanovica";
        this.heroName = "DogoMom";
        this.heroCity = "Riga";
        this.universe = "Our";
        this.heroType = HeroType.Hero;
        this.heroSalary = 3050.99d;
        this.deedTime = 36;
    }

    //argument constructor
    public Hero(int inputHeroId, String inputName, String inputSurname, String inputHeroName, String inputHeroCity, String inputUniverse, HeroType heroType, double inputHeroSalary, int inputDeedTime) {
        this.heroID = inputHeroId;
        this.name = inputName;
        this.surname = inputSurname;
        this.heroName = inputHeroName;
        this.heroCity = inputHeroCity;
        this.universe = inputUniverse;
        this.heroType = heroType;
        this.heroSalary = inputHeroSalary;
        this.deedTime = inputDeedTime;

    }


    //toString() is the method where information about the object values are returned as String value.
    public String toString() {
        return heroID + " " + name + " " + surname + " " + heroName + " " + heroCity + " " + universe + " " + heroType + " " + heroSalary + " " + deedTime;
    }


    //calculatedLevel() is the method where hero level is calculated:
    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if ((deedTime >= 20) && (deedTime < 40)) {
            return 2;
        } else if (deedTime >= 40){
            return 3;
        } else {
            return 0;
        }
    }





    //add get and set methods to the class
    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroCity() {
        return heroCity;
    }

    public void setHeroCity(String heroCity) {
        this.heroCity = heroCity;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public double getHeroSalary() {
        return heroSalary;
    }

    public void setHeroSalary(double heroSalary) {
        this.heroSalary = heroSalary;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

}

enum HeroType {
    Hero,
    Villain
}