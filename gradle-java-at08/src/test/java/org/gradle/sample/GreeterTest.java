package org.gradle.sample;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

public class GreeterTest {

    private Greeter greet;

     @Before
    public void setUp() throws Exception {
        greet = new Greeter();
    }

    @Test
    public void helloGreaterTest() throws Exception {
        assertEquals("hello Gradle", greet.getGreeting());
    }

    @Test
    public void helloGreaterNotNullTest() throws Exception {
        assertNotNull(greet.getGreeting());
    }

    @Test
    public void helloGreaterNotEqualsTest() throws Exception {
        assertNotEquals("bye Gradle", greet.getGreeting());
    }

    @Test
    public void helloGreaterNotEqualsTest2() throws Exception {
        assertNotEquals("another Gradle", greet.getGreeting());
    }

    @Test
    public void helloGreaterNotEqualsTest3() throws Exception {
        assertNotEquals("", greet.getGreeting());
    }

    @Test
    public void helloGreaterNotEqualsTest4() throws Exception {
        assertNotEquals(666, greet.getGreeting());
    }

    @Test
    public void helloGreaterNotSameTest() throws Exception {
        final Greeter greet2 = new Greeter();
        assertNotSame(greet2.getGreeting(), greet.getGreeting());
    }

    @Test
    public void helloGreaterNotSameTest2() throws Exception {
        assertNotSame("hello Gradle", greet.getGreeting());
    }

    @Test
    public void helloGreaterNotSameTest3() throws Exception {
        assertNotSame("", greet.getGreeting());
    }

    @Test
    public void helloGreaterSameTest() throws Exception {
        assertNotSame(greet.getGreeting(), greet.getGreeting());
    }
}