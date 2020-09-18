import java.util.*;
class AddressBook{
    public static void main(String[] args) {
        Map<String, List<Object>> addressBook = new TreeMap<>();
        addPerson(addressBook);
    }
    public static void addPerson(Map<String, List<Object>> addressBook) {
        String firstName="John";
        String lastName="Wick";
        String address="Universal Studios";
        String city="New York";
        String state="Philadelphia";
        Integer zip=12345;
        Integer phone=987654321;

        List<Object> ContactPerson = new ArrayList<>();
        ContactPerson.add(firstName);
        ContactPerson.add(lastName);
        ContactPerson.add(address);
        ContactPerson.add(city);
        ContactPerson.add(state);
        ContactPerson.add(zip);
        ContactPerson.add(phone);

        String name = firstName + " " + lastName;
        addressBook.put(name, ContactPerson);
        System.out.println(addressBook);
    }
}