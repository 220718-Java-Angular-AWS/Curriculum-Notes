package com.revature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeOtherClassTest {
    //How to test? The Three As
    //arrange
    //act
    //assert

    //Useful Annotations:
    //@BeforeEach
    //@BeforeAll
    //@AfterEach
    //@AfterAll
    //@Test
    //@Mock

    //We want the sut to be legit. We never want an actual legitimate object of any other type in this test class
    public SomeOtherClass sut;

    @BeforeEach
    public void setupBeforeEach() {
        sut = new SomeOtherClass();
    }

    @AfterEach
    public void teardownAfterEach() {
        sut = null;
    }


    @Test
    public void test_reverseStringSuccess() {
        //arrange - set up our string, and our known reversed version of that string to compare
        String str = "Hello";
        String rts = "olleH";


        //act - we call the method we are testing.
        String test = sut.reverseString(str);


        //assert - check to make sure our test string is equal to our known reversed string
        Assertions.assertEquals(rts, test);
    }
}
