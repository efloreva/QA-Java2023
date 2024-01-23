package oopJava;

public class Breed {
    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        this.possibleIllness = possibleIllness;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    private String breedName;
    private String possibleIllness;
    private String characteristics;

    public Breed(String breedName, String possibleIllness, String characteristics) {
        // this.breedName = breedName;
        // this.possibleIllness = possibleIllness;
        // this.characteristics = characteristics;

        setBreedName(breedName);
        setCharacteristics(characteristics);
        setPossibleIllness(possibleIllness);
    }
}
