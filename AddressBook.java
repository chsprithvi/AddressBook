import java.util.*;
class AddressBook{
    public static void main(String[] args) {

        Map<String, List<Object>> addressBook = new HashMap();
        System.out.println("Enter the number of contacts you want to add");
        Scanner sc= new Scanner(System.in);
        //Creating object for AddressBook Class
        int numberOFContacts= sc.nextInt();
        for(int i = 0; i < numberOFContacts; i++) {
            int contactNumber = i + 1;
            System.out.println("\n Enter details for Contact"+contactNumber);
            addPerson(addressBook);
        }
        System.out.println(addressBook);
        //creating a new TreeMap for sorting HashMap
        TreeMap<String, List<Object>> sorted = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sorted.putAll(addressBook);
        System.out.println(sorted);

    }
    public static void addPerson(Map<String, List<Object>> addressBook) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scan.next();
        System.out.println("Enter last name: ");
        String lastName = scan.next();
        String name = firstName + " " + lastName;
        if(addressBook.containsKey(name)) {
            System.out.println("Sorry, contact already exits\n Please, Enter details properly");
            addPerson(addressBook);
            return;
        }
        System.out.println("Enter address: ");
        String address = scan.next();
        System.out.println("Enter city: ");
        String city = scan.next();
        System.out.println("Enter state: ");
        String state = scan.next();
        System.out.println("Enter zip: ");
        int zip = scan.nextInt();
        System.out.println("Enter phone number: ");
        int phone = scan.nextInt();

        List<Object> ContactPerson = new ArrayList<>();
        ContactPerson.add(firstName);
        ContactPerson.add(lastName);
        ContactPerson.add(address);
        ContactPerson.add(city);
        ContactPerson.add(state);
        ContactPerson.add(zip);
        ContactPerson.add(phone);

        addressBook.put(name, ContactPerson);


    }

    public static void editContactDetail(List<Object> contactPerson) {
        System.out.println("Now you can change the details of contact");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter field: \n 1=address \n 2=city \n 3=state \n 4=zip \n 5=phone number");
        int input = sc.nextInt();
        switch (input) {
            case 1 :
                System.out.println("New address: ");
                sc.nextLine();
                String newAddress = sc.nextLine();
                contactPerson.set(2, newAddress);
                break;
            case 2 :
                System.out.println("New city: ");
                String newCity = sc.next();
                contactPerson.set(3, newCity);
                break;
            case 3 :
                System.out.println("New state: ");
                String newState = sc.next();
                contactPerson.set(4, newState);
                break;
            case 4 :
                System.out.println("New zip: ");
                int newZip = sc.nextInt();
                contactPerson.set(5, newZip);
                break;
            case 5 :
                System.out.println("New phone number: ");
                int newPhoneNumber = sc.nextInt();
                contactPerson.set(6, newPhoneNumber);
                break;
            default:
                System.out.println("Invalid option");
        }
        //return contactPerson;
        System.out.println(contactPerson);
    }
    public static void deleteContact(Map<String, List<Object>> addressBookDel) {
        addressBookDel.clear();
        System.out.println(addressBookDel);
    }
}