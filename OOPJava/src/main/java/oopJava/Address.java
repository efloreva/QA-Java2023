package oopJava;

public class Address {
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    private String City;
    private String Country;
    private String Street;


    public Address(String city, String country, String street) {

        setCity(city);
        setCountry(country);
        setStreet(street);
    }
}
