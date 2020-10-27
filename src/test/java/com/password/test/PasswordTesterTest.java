package com.password.test;

import org.junit.Test;

import static com.password.test.PasswordTester.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordTesterTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordTester.assesPassword("123asd!"));
    }
    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordTester.assesPassword("abcdefgh"));
    }
    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordTester.assesPassword("abcd1234"));
    }
    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(STRONG, PasswordTester.assesPassword("abcd123!"));
    }
}
