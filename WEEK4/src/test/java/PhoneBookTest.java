import ArrayListDemo.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class PhoneBookTest {

    @Test
    public void addTest(){

        //Given
        PhoneBook map = new PhoneBook();
        Set<Map.Entry<String, String>> expected = map.reverseLookUp("123");

        //When
        map.add("Lady Taylor", "123");
        Set<Map.Entry<String, String>> actual = map.reverseLookUp("123");

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeTest(){
        //Given
        PhoneBook map = new PhoneBook();
        map.add("Lady Taylor", "123");
        map.add("William", "999");
        String expected = null;
        map.remove("William");

        //When
        String actual = map.lookUp("William");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasEntryTest(){
        //Given
        PhoneBook map = new PhoneBook();
        map.add("Lady Taylor", "123");
        map.add("William", "999");
        map.add("Lyric", "000");
        String expected = map.hasEntry("000");
        map.remove("William");

        //When
        String actual = map.lookUp("Lyric");

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAllContactsTest(){
        //Given
        PhoneBook map = new PhoneBook();
        map.add("Lady Taylor", "123");
        map.add("William", "999");
        map.add("Lyric", "000");
        map.add("Avonte'", "456");
        map.add("Chay Chay" , "333");
        String expected = map.getAllContactNames();
        map.remove("William");

        //When
        String actual = map.getAllContactNames();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lookUpTest(){
        //Given
        PhoneBook map = new PhoneBook();
        map.add("Lady Taylor", "123");
        map.add("William", "999");
        map.add("Lyric", "000");
        map.add("Avonte'", "456");
        map.add("Chay Chay" , "333");
        String expected = map.lookUp("Avonte'");
        map.remove("William");

        //When
        String actual = map.lookUp("Avonte'");

        //Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void reverseLookUpTest(){
//        //Given
//        PhoneBook map = new PhoneBook();
//        map.add("Lady Taylor", "123");
//        map.add("William", "999");
//        map.add("Lyric", "000");
//        map.add("Avonte'", "456");
//        map.add("Chay Chay" , "333");
//
//        String expected = "Chay Chay";
//
//        //When
//        Set<Map.Entry<String, String>> actual = map.reverseLookUp("333");
//
//
//        //Then
//        Assert.assertEquals(expected, actual);
    }

