package com.revature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeClassTest {
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

    //we will need to mock the SomeOtherClass object so that we can silo our system under test

    public SomeClass sut;

    @BeforeEach
    public void setupBeforeEach(@Mock SomeOtherClass mockSomeOtherClass) {
        sut = new SomeClass(mockSomeOtherClass);
        String testString = "Hello, World!";
        String reversedString = "!dlroW ,olleH";
        //Here is our intercept - whenever we would call the method, we actually circumvent it and return  pre-defined value
        Mockito.when(mockSomeOtherClass.reverseString(testString)).thenReturn(reversedString);
    }

    @AfterEach
    public void teardownAfterEach() {
        sut = null;
    }

    @Test
    public void test_getReversedSubstringSuccess() {
        //arrange
        int begin = 3;
        int end = 6;
        String testString = "Hello, World!";
        String reversedSubString = "roW ";

        //act
        String result = sut.getReversedSubString(testString, begin, end);
        //sut.testMe(); //turns out this does work, mocked objects are legit objects.

        //assert
        Assertions.assertEquals(reversedSubString, result);
    }


}
