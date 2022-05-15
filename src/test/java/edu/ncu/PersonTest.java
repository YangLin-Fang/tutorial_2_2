package edu.ncu;

import edu.ncu.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void bmiTest(){
        Person person = new Person(66.5f,1.7f);
        Assert.assertEquals(66.5f/(1.7f*1.7f), person.bmi());
    }
}
