package oopJava;

public class Test {
    public static void main(String[] args) {

        //creating the first object from class Dog using constructor
        Dog morty = new Dog(
                "French Bulldog",
                "male",
                11.25f,
                "Morty",
                (byte)3,
                "brown",
                false);
// calling some actions that are available for the object
        morty.bark();
        morty.eat();

        //System.out.println(morty);
//creating a new object from class Dog
        Dog sharo = new Dog(
                "Husky",
                "female",
                8.8f,
                "Sharo",
                (byte) 5,
                "white and black",
                true);

        //Dog sharo = new Dog("Husky", "male", 8.8f, "Sharo", (byte) 5, "black and white");

        sharo.setWeight(12.0f);
        sharo.setAge((byte) 6);


        Parrot patchi = new Parrot(
                "Ara",
                "male",
                3.4f,
                "Patchi",
                (byte) 23,
                "Multicoloured",
                true);

        patchi.eat();
    }
}
