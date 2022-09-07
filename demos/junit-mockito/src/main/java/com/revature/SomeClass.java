package com.revature;

public class SomeClass {
    //What should this class do?
    //this class should invoke methods from SomeOtherClass, so we can demonstrate mocking

    private SomeOtherClass otherClass;

    public SomeClass(SomeOtherClass otherClass) {
        this.otherClass = otherClass;
    }

    public String getReversedSubString(String str, int begin, int end) {
        String reversedString = otherClass.reverseString(str);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < reversedString.length(); i++) {
            if(i >= begin && i <= end) {
                sb.append(reversedString.charAt(i));
            }
        }

        return sb.toString();
    }

    public void testMe() {
        System.out.println("Calling runMe()... ");
        otherClass.runMe();
    }

}
