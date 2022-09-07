package com.revature;

public class SomeOtherClass {
    //This class should have several methods that can be mocked
    public String reverseString(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public void runMe() {
        System.out.println("Try running this on a mocked object and see what happens...");
    }


}
