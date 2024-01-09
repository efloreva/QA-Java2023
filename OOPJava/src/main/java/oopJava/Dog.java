package oopJava;

public class Dog extends PetParent {
    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    //instance variables - characteristics of any future object that will be created
    private boolean hasTail;

    //setters and getters, due to the obj instances being private and not public


    //calls the PetParent constructor + we add the unique hasTail
    public Dog(String breed, String gender, float weight, String name, byte age, String colour, boolean hasTail) {
        super(breed, gender, weight, name, age, colour);
        setHasTail(hasTail);
    }

    //method = actions that any future objects which will be created can do
    public void bark() {
        System.out.println(super.getName() + " is barking - Bau, Bau!"); // super is accessing stuff from the parent class
    }

}
