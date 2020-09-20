import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
class AddressBook{
    public static void main(String[] args) {
        AddressBook AddBookObj = new AddressBook();
        Map<String, List<Object>> addressBook = new HashMap();
        Map<Integer, List<Object>> addressBookZip = new HashMap();
        Map<String, List<Object>> addressBookState = new HashMap();
        Map<String, List<Object>> addressBookCity = new HashMap();
        System.out.println("Enter the number of contacts you want to add");
        Scanner sc= new Scanner(System.in);
        //Creating object for AddressBook Class
        int numberOFContacts= sc.nextInt();
        for(int i = 0; i < numberOFContacts; i++) {
            int contactNumber = i + 1;
            System.out.println("\n Enter details for Contact"+contactNumber);
            addPerson(addressBook,addressBookZip,addressBookState,addressBookCity);
        }
        System.out.println(addressBook);
        
        System.out.println("1-Sort entries by Name\n2-Sort entries by City\n3-Sort entries by State\n4-Sort entries by Zip\n");
        int checkOption=sc.nextInt();
        if(checkOption==1){
            AddBookObj.displayName(addressBook);
        }
        else if(checkOption==2){
            AddBookObj.displayCity(addressBookCity);
        }
        else if(checkOption==3){
            AddBookObj.displayState(addressBookState);
        }
        else if(checkOption==4){
            AddBookObj.displayZip(addressBookZip);
        }
        else{
            System.out.println("Invalid option");
        }
 

    }


    public void displayName(Map<String, List<Object>> addressBook){
        System.out.println(addressBook);
        //creating a new TreeMap for sorting HashMap
        TreeMap<String, List<Object>> sorted = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sorted.putAll(addressBook);
        System.out.println(sorted);

    }
    public void displayZip(Map<Integer, List<Object>> addressBookZip){
        System.out.println(addressBookZip);
        //creating a new TreeMap for sorting HashMap
        TreeMap<Integer, List<Object>> sortedZip = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sortedZip.putAll(addressBookZip);
        System.out.println(sortedZip);

    }
    public void displayState(Map<String, List<Object>> addressBookState){
        System.out.println(addressBookState);
        //creating a new TreeMap for sorting HashMap
        TreeMap<String, List<Object>> sortedState = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sortedState.putAll(addressBookState);
        System.out.println(sortedState);

    }
    public void displayCity(Map<String, List<Object>> addressBookCity){
        System.out.println(addressBookCity);
        //creating a new TreeMap for sorting HashMap
        TreeMap<String, List<Object>> sortedCity = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sortedCity.putAll(addressBookCity);
        System.out.println(sortedCity);

    }

    public static void addPerson(Map<String, List<Object>> addressBook, Map<Integer, List<Object>> addressBookZip, Map<String, List<Object>> addressBookState, Map<String, List<Object>> addressBookCity) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scan.next();
        System.out.println("Enter last name: ");
        String lastName = scan.next();
        String name = firstName + " " + lastName;
        if(addressBook.containsKey(name)) {
            System.out.println("Sorry, contact already exits\n Please, Enter details properly");
            addPerson(addressBook,addressBookZip,addressBookState,addressBookCity);
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
        
        List<Object> ContactPersonCity = new ArrayList<>();
        ContactPersonCity.add(firstName);
        ContactPersonCity.add(lastName);
        ContactPersonCity.add(address);
        ContactPersonCity.add(city);
        ContactPersonCity.add(state);
        ContactPersonCity.add(zip);
        ContactPersonCity.add(phone);
        addressBookCity.put(city, ContactPersonCity);
        
        
        List<Object> ContactPersonState = new ArrayList<>();
        ContactPersonState.add(firstName);
        ContactPersonState.add(lastName);
        ContactPersonState.add(address);
        ContactPersonState.add(city);
        ContactPersonState.add(state);
        ContactPersonState.add(zip);
        ContactPersonState.add(phone);
        addressBookState.put(state, ContactPersonState);

        
        List<Object> ContactPersonZip = new ArrayList<>();
        ContactPersonZip.add(firstName);
        ContactPersonZip.add(lastName);
        ContactPersonZip.add(address);
        ContactPersonZip.add(city);
        ContactPersonZip.add(state);
        ContactPersonZip.add(zip);
        ContactPersonZip.add(phone);
        addressBookZip.put(zip, ContactPersonZip);



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