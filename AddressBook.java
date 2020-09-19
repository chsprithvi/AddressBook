import java.util.*;
class AddressBook{
    public static void main(String[] args) {
        Map<String, List<Object>> addressBook = new HashMap();
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
        System.out.println("----------\n Enter option\n1 - EDIT CONTACT\n2 - DELETE CONTACT");
        Scanner sc= new Scanner(System.in);
        int check=sc.nextInt();
        if(check==1){
            editContactDetail(ContactPerson);
        }
        else if(check==2){
            deleteContact(addressBook);
        }
        else{
            System.out.println("invalid option");
        }
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