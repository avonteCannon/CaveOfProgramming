package ArrayListDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> animals = new ArrayList<String>();
//
//
//        //Adding new elements to the ArrayList
//        animals.add("Lion");
//        animals.add("Dog");
//        animals.add("Cat");
//        animals.add("Panda");
//        System.out.println(animals.remove(2));
//        System.out.println(animals);
//
//        animals.add("Fish");
//
//        System.out.println(animals);
//        System.out.println("Total number of animals in our array list is " + animals.size());
//        System.out.println("Is our list empty?: " + animals.isEmpty());
//
//        ArrayList<Character> letters = new ArrayList<Character>();
//
//        letters.add('d');
//        letters.add('f');
//        letters.add('u');
//        letters.add('i');
//        letters.add('p');
//        System.out.println(letters);

        ArrayList<Float> longNumbers = new ArrayList<Float>();
        longNumbers.add(56f);
        longNumbers.add(68f);
        longNumbers.add(908f);
        longNumbers.add(528f);
        longNumbers.add(3f);
        longNumbers.add(78f);

//        System.out.println(longNumbers.subList(0,5));
//        System.out.println(longNumbers.clone());

        //for Loop for Array List
        for(int x=0; x < longNumbers.size(); x++){
            System.out.println(longNumbers.get(x));
        }

        System.out.println("============================================================================");

        //Iterator
        Iterator<Float> longIterator = longNumbers.iterator();
        while (longIterator.hasNext()){
            Float result = longIterator.next();
            System.out.println(result);
        }

        System.out.println("==============================================================");

        //List Iterator
        ListIterator<Float> longListIterator = longNumbers.listIterator(longNumbers.size());
        while (longListIterator.hasPrevious()){
            Float result = longListIterator.previous();
            System.out.println(result);
        }

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(1);
        numbersList.add(10);
        numbersList.add(111);
        numbersList.add(1101);
        numbersList.add(12);

        System.out.println("==================================================================================");

        Iterator<Integer> numberIterator = numbersList.iterator();

        while (numberIterator.hasNext()){
            Integer result = numberIterator.next();
            if (result % 2 == 0)
                System.out.println(result);
        }

        while (numberIterator.hasNext()){
            Integer outcome = numberIterator.next();
            if(numberIterator.next() % 2 != 0){
                numberIterator.remove();
                System.out.println(outcome);
            }
        }

        //HashMap
        HashMap<Integer, String> gradBook = new HashMap<Integer, String>();
        gradBook.put(100, "Betty Shabbaz");
        gradBook.put(78, "Avonte' Cannon");
        gradBook.put(79, "Lady Taylor");

        System.out.println(gradBook.get(78));
        System.out.println("==============================================");

        for (Integer key : gradBook.keySet()){
            System.out.println(gradBook.get(key));
        }

        System.out.println("================================================");

        //MADE A Student CLASS
                //<KEY=Interger    VALUE=Student>
        HashMap<Integer, Student> myStudents = new HashMap<Integer, Student>();
        myStudents.put(1, new Student("Avonte'", 23));
        myStudents.put(2, new Student("William", 22));
        myStudents.put(3, new Student("Chay Chay", 20));

        for (HashMap.Entry x: myStudents.entrySet()){
            System.out.println("{\n" + " " + x.getKey() + " : " + x.getValue() + "\n}");
        }


        System.out.println("==============================================================");

        System.out.println(myStudents.clone());
        System.out.println(myStudents.containsKey("Hello"));
        System.out.println(myStudents.containsKey(2));
        System.out.println(myStudents.remove(3));
        System.out.println(myStudents); //THIS REMOVED KEY 3 WHICH WAS CHAY CHAY

        //Iterator



//===================================================================================================================

        PhoneBook map = new PhoneBook();

        map.add("William","999");
        map.add("Avonte'", "456");
        map.add("Chay Chay" , "333");
        map.add("Lady Taylor", "123");
        map.add("Lil John", "248");
        map.add("Lyric", "999");

        map.remove("William");

        map.hasEntry("123");
        map.hasEntry("000");

        map.getAllContactNames();

        map.reverseLookUp("333");


        map.lookUp("Lyric");











    }

}
