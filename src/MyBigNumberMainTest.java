import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MyBigNumberMainTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();


    MyBigNumber myBigNumber =  new MyBigNumber();

    @org.junit.Test
    public void sum() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("123", "456");
        assertEquals("579", s);
    }

    @org.junit.Test
    public void sum2() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("1235", "856");
        assertEquals("2091", s);
    }

    @org.junit.Test
    public void sum3() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("100", "900");
        assertEquals("1000", s);
    }

    @org.junit.Test
    public void sum4() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("999", "111");
        assertEquals("1110", s);
    }

    @org.junit.Test
    public void sum5() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("999", "1111");
        assertEquals("2110", s);
    }

    @org.junit.Test
    public void sum6() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("1234567890", "4");
        assertEquals("1234567894", s);
    }

    @org.junit.Test
    public void sum8(){ //TH số âm
        expectedEx.expect(NumberFormatException.class);
        expectedEx.expectMessage("Chua ho tro so am: -3");
        String s = myBigNumber.sumNumber("-3", "4");
    }

    @org.junit.Test
    public void sum9(){ //TH Có kí tự có chữ cái
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sumNumber("3a", "4");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }

    @org.junit.Test
    public void sum10(){ //TH có số âm
        expectedEx.expect(NumberFormatException.class);
        expectedEx.expectMessage("Chua ho tro so am: -7");
        String s = myBigNumber.sumNumber("3", "-7");
    }

    @org.junit.Test
    public void sum13() { //TH Null
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum14() { //TH Null
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber(null, "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum15() { //TH
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber(" ", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum16() { //TH Null
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("4", " ");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum17() { //TH Null
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("4", "");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum18() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber("4", null);
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum19() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sumNumber(null, null);
        assertEquals("0", s);
    }

    @org.junit.Test
    public void sum20(){
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sumNumber("3", "4a");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }

    @org.junit.Test
    public void sum21(){ //TH Có kí tự đặc biệt
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sumNumber("1=", "4+");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }

    @org.junit.Test
    public void sum22(){ //TH Có kí tự đặc biệt & chữ cái
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sumNumber("1", "4+a");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }
}