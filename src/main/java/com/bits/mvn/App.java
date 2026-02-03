package com.bits.mvn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        System.out.println("Roll Number: 2023vz70024");
        int a = 10, b = 0;
        // Intentional Bug for Task 3 SonarQube analysis
        int result = a / b; 
        System.out.println("Result: " + result);
    }
}
