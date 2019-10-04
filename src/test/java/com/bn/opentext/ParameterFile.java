package com.bn.opentext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFile {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value from Parameters.xml : " + myName);
        System.out.println("Parameter from jenkins, param2: " + System.getProperty("param2"));
    }
}