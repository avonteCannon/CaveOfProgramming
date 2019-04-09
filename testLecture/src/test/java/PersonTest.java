import org.junit.Assert;
import org.junit.Test;
import people.Person;

public class PersonTest {

    @Test
    public void getNameTest(){
        //Given
        Person person = new Person("GQ", 24);
        String expected = "GQ";

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person("Lady Taylor", 22);
        String expected = "Chris";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
