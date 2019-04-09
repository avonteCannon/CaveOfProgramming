package CaveOfProgramming;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

////for video 6
//class Person{
//    private int id;
//    private String name;
//
//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String toString(){
//        return id + ": " + name;
//    }
//}
public class Main {
    public static void main(String[] args) {

//        //Java Collections Framework: Array List: Video 1
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//        numbers.add(10);
//        numbers.add(90);
//        numbers.add(9);
//
//        //using number.get to get it's index postion
//        System.out.println(numbers.get(0));
//
//
//        System.out.println("Iteration #1: ");
//        //index for loop iteration
//        for (int i=0; i < numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//
//        System.out.println("\nIteration #2: ");
//        for (Integer value: numbers){
//            System.out.println(value);
//        }
//
//        // Removing Items (careful!)
//        numbers.remove(numbers.size() - 1);
//
//        //List interface
//        List<String> values = new ArrayList<String>();

        //Video 2: Linked List
        //In a Class
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//
//        doTimings("ArrayList" , arrayList);
//        doTimings("LinkedList", linkedList);
//
//    }
//
//    private static void doTimings(String type, LinkedList<Integer> linkedList1) {
//
//        for (int i=0; i<1E5; i++){
//            linkedList1.add(i);
//        }
//        long start = System.currentTimeMillis();
//
//        //Add items at end of list
//        for (int i=0; i<1E5; i++){
//            linkedList1.add(i);
//        }
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("Time taken: " + (end - start) + " ms for " + type);

//        //Video 3: Hash Maps
//        HashMap<Integer, String > mymap = new HashMap<Integer, String>();
//
//        mymap.put(7,"mySeven");
//        mymap.put(5,"myFive");
//        mymap.put(2,"myTwo");
//        mymap.put(1,"myOne");
//
//        String myText = mymap.get(5);
//        System.out.println(myText);
//
//        for (Map.Entry<Integer, String> entry: mymap.entrySet()){
//            int key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + ": " + value);
//        }

//        //Video 4: Sorted Maps
//        Map<Integer, String> myHashMap = new HashMap<Integer, String>();
//        Map<Integer, String> myLinkedHashMap = new LinkedHashMap<Integer, String>();
//        Map<Integer, String> myTreeMap = new TreeMap<Integer, String>();
//
//        myTestMap(myLinkedHashMap);
//    }
//
//    public static void myTestMap(Map<Integer, String> map) {
//
//        map.put(90, "panda");
//        map.put(90, "panda");
//        map.put(80, "dog");
//        map.put(70, "cat");
//        map.put(60, "human");
//        map.put(50, "dino");
//
//        for (Integer key : map.keySet()) {
//            String value = map.get(key);
//            System.out.println(key + ": " + value);
//        }
//
//    }

//        //Video 5: Sets
//        //Does not keep order
//        Set<String> setOne = new HashSet<String>();
//
//        //Linked Hash set remembers order
////        Set<String> setOne = new LinkedHashSet<String>();
//
//        //Tree Set keeps natural Order(Alphbetical)
////        Set<String> setOne = new TreeSet<String>();
//
//        if (setOne.isEmpty()){
//            System.out.println("Set is Empty at start");
//        }
//
//        setOne.add("dog");
//        setOne.add("cat");
//        setOne.add("mouse");
//        setOne.add("snake");
//        setOne.add("bear");
//
//        if (setOne.isEmpty()){
//            System.out.println("Set is Empty after adding (no!) ");
//        }
//
//        //Adding duplicate does nothing.
//        setOne.add("mouse");
//
//        System.out.println(setOne);
//
//        /////////////////////////////////////////// Iteration Line ////////////////////////////////////////////////////////
//
//        for (String element: setOne){
//            System.out.println(element);
//        }
//
//        ////////////////////////////////////// Does set contain a given item /////////////////////////////////////////
//
//        if (setOne.contains("human")){
//            System.out.println("Contains human");
//        }
//
//        if(setOne.contains("dog")){
//            System.out.println("Contains Dog");
//        }
//
////////////////////////////// Intersection /////////////////////////////////////////////////////////////////////////////////
//
//        Set<String> setTwo = new TreeSet<String>();
//
//        setTwo.add("dog");
//        setTwo.add("panda");
//        setTwo.add("mouse");
//        setTwo.add("human");
//        setTwo.add("bear");
//
//        Set<String> intersection = new HashSet<String>(setOne);
//
//        intersection.retainAll(setTwo);
//        System.out.println(intersection);
//        ////////////////////////////////// Diffrence ////////////////////////////////////////////////////////
//
//        Set<String> difference = new HashSet<String>(setOne);
//        difference.removeAll(setTwo);
//        System.out.println(difference);

        //Video 6: Using Your Objects in Maps and Sets (Come back to this video)
//
//        Person person1 = new Person(0, "Chay Chay");
//        Person person2 = new Person(2, "Chay Chay");
//        Person person3 = new Person(5, "Tshay");
//        Person person4 = new Person(8, "Zaina");
//
//
//        Map<Person, Integer> map = new HashMap<Person, Integer>();
//
//        map.put(person1, 1);
//        map.put(person2, 2);
//        map.put(person3, 3);
//        map.put(person4, 1);
//
//        for (Person key : map.keySet()){
//            System.out.println(key + ": " + map.get(key));
//        }
//
//        Set<Person> set = new LinkedHashSet<Person>();
//        set.add(person1);
//        set.add(person2);
//        set.add(person3);
//        set.add(person4);
//
//        System.out.println(set);

//        //Video 7: Sorting List (Come Back to video 7)
//        List<String> animals = new ArrayList<String>();
//
//        animals.add("tiger");
//        animals.add("bear");
//        animals.add("flamingo");
//        animals.add("snake");
//        animals.add("lion");
//        animals.add("bunny");
//        animals.add("whale");
//
//        Collections.sort(animals);
//
//        for (String animal: animals){
//            System.out.println(animal);
//        }
//
//        List<Integer> numbers = new ArrayList<Integer>();
//
//        numbers.add(4);
//        numbers.add(90);
//        numbers.add(100);
//        numbers.add(0);
//        numbers.add(67);
//        numbers.add(1);
//
//        //Same order as TreeSet (natural order)
//        Collections.sort(numbers);
//        for (Integer number: numbers){
//            System.out.println(number);
//        }

//        //Video 8: Natural Ordering(Looking up how to import Collection Interface)
//
//        List<String> list = new ArrayList<String>();
//        SortedSet<String> set = new TreeSet<String>();
//
//    }
//
//    private static void addElemental(Collections<String> collections){
//        collections.add ("bob");
//
//    }

//        //Video 9: Queues
//        // (head) <- ooooooooooooooooooooooooooooooooo <- (tall) FIFO (first in first out)
//
//        Queue<Integer> queueOne = new ArrayBlockingQueue<Integer>(3);
//
//        //Throws NoSuchElement exception --- no items in queue yet
//        //System.out.println("Head of queue is: " + queueOne.element());
//        queueOne.add(12);
//        queueOne.add(45);
//        queueOne.add(67);
//
//        System.out.println("Head of queue is: " + queueOne.element());
//
//        try{
//            queueOne.add(40);
//        }catch (IllegalStateException e){
//            System.out.println("Tried to add too many items to the queue");
//        }
//
//        for (Integer value: queueOne){
//            System.out.println("Queue value " + value);
//        }
//
//        System.out.println("Removed from queue " + queueOne.remove());
//        System.out.println("Removed from queue " + queueOne.remove());
//        System.out.println("Removed from queue " + queueOne.remove());
//
//        try{
//            System.out.println("Removed from queue: " + queueOne.remove());
//        }catch (NoSuchElementException e){
//            System.out.println("Tried to remove too many items from queue");
//        }

//        //Video 10: Using Iterators
//
//        LinkedList<String> animals = new LinkedList<String>();
//
//        animals.add("fox");
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("rabbit");
//
//        Iterator<String> it = animals.iterator();
//
//       while (it.hasNext()){
//           String value = it.next();
//           System.out.println(value);
//
//           if (value.equals("cat")){
//               it.remove();
//           }
//       }
//
//        //Modern iteration, JAVA 5 and Later
//        for (String aniaml: animals){
//            System.out.println(aniaml);
//        }

        //Video 11: Implementing Iterable
        //Video 12: Deciding which Collection to Use

        //Video 13: Complex Data Structures

        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        for (int x = 0; x < vehicles.length; x++) {
            String vehicle = vehicles[x];
            String[] driversList = drivers[x];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);

        }
        {   //Brackets to scope driversList variable (can use again later)
            //Example
            Set<String> driverList = personnel.get("lifeboat");
            for (String driver : driverList) {
                System.out.println(driver);
            }
        }

        //Iterate through whole thing
        for (String vehicle : personnel.keySet()) {
            System.out.println(vehicle);
            System.out.println(": ");
            Set<String> driverList = personnel.get(vehicle);

            for (String driver : driverList) {
                System.out.println(driver);
                System.out.println(" ");
            }

            System.out.println();


        }


    }
    public static String[] vehicles = {"ambulance", "helicopters", "lifeboat"};

    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"},
    };
}

