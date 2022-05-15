package edu.ncu;

import edu.ncu.student.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void averageTest(){
        Student student = new Student("YL",60,80);
        Assertions.assertEquals(((60+80)/2), student.getAverage());

    }
}
