package ArrayListDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public String names;
    public String phoneNumbers;

    public PhoneBook(){

    }

//    public PhoneBook(String names, String phoneNumbers){
//        this.names = names;
//        this.phoneNumbers = phoneNumbers;
//    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "names='" + names + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }
    //==================================================================================================================

    HashMap<String, String> myPhoneBook = new HashMap<String, String>();


    //Add
    public String add(String name, String phoneNumber){
        myPhoneBook.put(name, phoneNumber);
        System.out.println(myPhoneBook);
        return name;
    }

//    public void addAll(String name, String... phoneNumbers){
//    }

    //Remove
    public String remove(String name){
        myPhoneBook.remove(name);
        System.out.println(myPhoneBook);
        return name;
    }

    //Has Entry
    public String hasEntry(String phoneNumbers){
        myPhoneBook.containsValue(phoneNumbers);
        System.out.println(myPhoneBook.containsValue(phoneNumbers));
        return phoneNumbers;
    }

    //All Contacts
    public String getAllContactNames() {
        myPhoneBook.size();
        System.out.println(myPhoneBook);
        return phoneNumbers;
    }

    //Reverse LookUp
    public Set<Map.Entry<String, String>> reverseLookUp(String phoneNumbers){
        if (myPhoneBook.containsValue(phoneNumbers)){
            for (Map.Entry<String, String> entry : myPhoneBook.entrySet())
                if (entry.getValue().equals(phoneNumbers)){
                    System.out.println(entry.getKey());
                }

        }
        return myPhoneBook.entrySet();
    }

    //LookUp
    public String lookUp(String name){
        myPhoneBook.get(name);
        System.out.println(myPhoneBook.get(name));
        return myPhoneBook.get(name);


    }


}


