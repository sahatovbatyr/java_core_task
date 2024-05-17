package ObjectCopy_Shallow;

//Поверхностное копирование

//Поверхностное копирование создает новый объект, но копирует ссылки на объекты,
//содержащиеся в оригинале. Если ваш объект содержит примитивные типы или
//неизменяемые объекты (например, строки), это может быть подходящим вариантом.

public class Address implements Cloneable {

    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Addres{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
