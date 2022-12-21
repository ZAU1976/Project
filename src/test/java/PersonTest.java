import org.example.Person;

import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void test1() {
        boolean result = Person.isTeenager(19);
        assert(result);
    }

    @Test
    public void test2() {
        boolean result = Person.isTeenager(13);
        assert(result);
    }

    @Test
    public void test3() {
        boolean result = Person.isTeenager(15);
        assert(result);
    }

    @Test
    public void test4() {
        boolean result = Person.isTeenager(-13);
        assert(result);
    }

    @Test
    public void test5() {
        boolean result = Person.isTeenager(-19);
        assert(result);
    }

    @Test
    public void test6() {
        boolean result = Person.isTeenager(20);
        assert(result);
    }

    @Test
    public void test7() {
        boolean result = Person.isTeenager(12);
        assert(result);
    }
    @Test
    public void test8() {
        boolean result = Person.isTeenager(-500);
        assert(result);
    }
    @org.testng.annotations.AfterTest
    public void test9() {
        boolean result = Person.isTeenager(2000);
        assert(result);
    }
    @Test
    public void test10() {
        boolean result = Person.isTeenager(18);
        assert(result);
    }
}