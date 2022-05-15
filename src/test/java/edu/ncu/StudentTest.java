package edu.ncu;

import edu.ncu.student.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    void averageTest(){
        Student student = new Student("YL",60,80);
        Assert.assertEquals((60+80)/2, student.getAverage());

    }
}
