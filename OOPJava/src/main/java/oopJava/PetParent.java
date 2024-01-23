package oopJava;
public class PetParent implements PetActionsInterface {

    //instance variables - characteristics of any future object that will be created
    private Breed breed; //composition
    private String gender;
    private float weight;
    private String name;
    private byte age;
    private String colour;
    private Address address; // aggregation vrazka


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    //setters and getters, due to the obj instances being private and not public
    public Breed getBreed() {
        return breed;
    }

    //private setBreed due to the fact you cannot change a dog's breed thus no need to make public access to that data
    //limited the possibility to be changed only internally - in this case only using the constructor
    private void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        } else{
            System.out.println("Error: breed is mandatory");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.isEmpty()){
            this.gender = gender;
        } else{
            System.out.println("Error: gender is mandatory");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if ( weight > 0){
            this.weight = weight;
        } else{
            System.out.println("Error: weight is mandatory");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        } else{
            System.out.println("Error: name is mandatory");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if ( age >= 0){
            this.age = age;
        } else{
            System.out.println("Error: age is invalid");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.isEmpty()){
            this.colour = colour;
        } else{
            System.out.println("Error: colour is mandatory");
        }
    }

    //constructor - the method which creates the new object
    public PetParent(Breed breed, String gender, float weight, String name, byte age, String colour){

        setBreed(breed);
        setGender(gender);
        setWeight(weight);
        setName(name);
        setAge(age);
        setColour(colour);

    }

    //method = actions that any future objects which will be created can do
    public void eat(){
        System.out.println(this.name + " is eating!");
        // super.eat(); // - same as line above
    }

    @Override
    public void run() {
        System.out.printf(this.name + " is running...");
    }

    @Override
    public void speak() {
        System.out.printf(this.name + " is speaking...");
    }
}
