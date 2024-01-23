package oopJava;

public class Parrot extends PetParent {

    private boolean hasLongBeak;

    //setters and getters, due to the obj instances being private and not public
    public boolean isHasLongBeak() {
        return hasLongBeak;
    }

    public void setHasLongBeak(boolean hasLongBeak) {
        this.hasLongBeak = hasLongBeak;
    }

    public Parrot(Breed breed, String gender, float weight, String name, byte age, String colour, boolean hasLongBeak) {
        super(breed, gender, weight, name, age, colour); //call the parent constructor first always
        setHasLongBeak(hasLongBeak);
    }

    public void speak() {
        System.out.println(super.getName() + " is speaking human language!");
    }
    public void fly(){
        System.out.println(super.getName() + " is flying...");
    }
}
