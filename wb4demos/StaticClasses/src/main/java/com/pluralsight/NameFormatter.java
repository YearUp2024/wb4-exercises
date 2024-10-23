package com.pluralsight;

import java.lang.management.ThreadInfo;

public class NameFormatter {
    /**
     * This is creating a person name with only first and last.
     * @param fullName
     * @return first and last name.
     */
    public static String format(String fullName){
        return fullName.replace(" ", ", ");
    }

    /**
     * This is creating a person name with prefix and suffix.
     * @param prefix
     * @param firstName
     * @param middleName
     * @param lastName
     * @param suffix
     * @return first, middle, last and suffix.
     */
    public static String format(String prefix, String firstName, String middleName, String  lastName, String  suffix){
        return prefix + ". " + firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    /**
     * This is creating a person name with suffix.
     * @param middleName
     * @param lastName
     * @param suffix
     * @return first, middle, last, suffix .
     */
    public static String format(String firstName, String middleName, String  lastName, String  suffix){
        return firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    /**
     * This is formatting first and last name
     * @param firstName
     * @param lastName
     * @return  first and last name.
     */
    public static String format(String firstName, String lastName){
        return new StringBuilder().append(firstName).append(", ").append(lastName).toString();
    }
}
