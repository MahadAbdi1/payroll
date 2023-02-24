package payroll.za.ac.cput.utill;

import java.util.UUID;

public class Helper {

    public static  boolean isNullOrEmpty(String str) {

        return (str== null || str.equals("") || str.isEmpty() || str.equalsIgnoreCase("null"));

    } // is null


    public static String  generatedId(){
        return UUID.randomUUID().toString();

    }
//    public static String  generatedId( String employeeNumber){
//
//        return UUID.randomUUID().toString();
//    }
}
