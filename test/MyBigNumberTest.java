import static org.junit.Assert.*;

public class MyBigNumberTest{

    MyBigNumber myBigNumber =  new MyBigNumber();

    @org.junit.Test
    public void sumNumber() {
        try {
            String s = myBigNumber.sumNumber("123", "456");
            assertEquals("579", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sumNumber2(){
        try {
            String s = myBigNumber.sumNumber("1235", "856");
            assertEquals("2091", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sumNumber3(){
        try {
            String s = myBigNumber.sumNumber("100", "900");
            assertEquals("1000", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sumNumber4(){
        try {
            String s = myBigNumber.sumNumber("999", "111");
            assertEquals("1110", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sumNumber5(){
        try {
            String s = myBigNumber.sumNumber("999", "1111");
            assertEquals("2110", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sumNumber6(){
        try {
            String s = myBigNumber.sumNumber("1234567890", "4");
            assertEquals("1234567894", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber7(){
        try {
            String s = myBigNumber.sumNumber("abs", "4");
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber8(){
        try {
            String s = myBigNumber.sumNumber("-3", "4");
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber9(){
        try {
            String s = myBigNumber.sumNumber("3", "4asd");
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber10(){
        try {
            String s = myBigNumber.sumNumber("3", "-7");
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber11(){
        try {
            String s = myBigNumber.sumNumber("3", "-7asdg");
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sumNumber12(){
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("3", "-7asdg");
    }

}