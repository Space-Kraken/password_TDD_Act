package com.password.test;

import org.junit.Test;

import static com.password.test.PasswordTester.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordTesterTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordTester.assesPassword("p0ll1to"));
    }
    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordTester.assesPassword("Lavacamu"));
    }
    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordTester.assesPassword("shrek12345"));
    }
    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(STRONG, PasswordTester.assesPassword("conejomalo+"));
    }
}
