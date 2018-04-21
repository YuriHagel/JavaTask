package Task001;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex(1111);
        address.setCountry("Russia");
        address.setCity("Moscow");
        address.setStreet("st.Lenin");
        address.setHouse("22");
        address.setApartment("4");
        System.out.println("Apartment " + address.getApartment() +"\nCountry " + address.getCountry() + "\nCity " + address.getCity() +
                "\nStreet " + address.getStreet() +"\nHouse " + address.getHouse() + "\nApartment " + address.getApartment());


    }

}
