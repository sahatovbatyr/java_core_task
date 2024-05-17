package ObjectCopy_Deep;

public class Address implements Cloneable {

    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(city,street);
    }

    @Override
    public String toString() {
        return "Addres{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}