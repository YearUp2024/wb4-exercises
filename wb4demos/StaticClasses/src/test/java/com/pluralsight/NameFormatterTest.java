package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Formattable;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    String prefix;
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    @BeforeEach
    void setUp() {
        prefix = "Mr";
        firstName = "Iftekar";
        middleName = "M";
        lastName = "Hossain";
        suffix = "PhD";
    }

    @Test
    void formatFullName() {
        String fullName = firstName + " " + lastName;

        String actual = NameFormatter.format(fullName);
        String except = firstName + ", " + lastName;
        assertEquals(actual, except);
    }

    @Test
    void testFormatPrefixFirstMiddleLastSuffix() {
        String actual = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);
        String expect = prefix + ". " + firstName + " " + middleName + " " + lastName + ", "+ suffix;
        assertEquals(actual, expect);
    }

    @Test
    void testFormatFirstMiddleLastSuffix() {
        String actual = NameFormatter.format(firstName, middleName, lastName, suffix);
        String expect = firstName + " " + middleName + " " + lastName + ", "+ suffix;
        assertEquals(actual, expect);
    }

    @Test
    void testFormatFirstLeLast() {
        NameFormatter.format(firstName, lastName);
    }
}