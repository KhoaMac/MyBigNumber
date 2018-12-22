/**
 *
 * @author leond
 */

/**
 * Sum two string class.
 */
public class MyBigNumber {
    
    private IReceiver IReceiver;
    
    public MyBigNumber() {}
    
    public MyBigNumber(final IReceiver IReceiver) {
        this.IReceiver = IReceiver;
    }
    
    /**
      *sum function.
      */
    
    public String sumNumber(final String str1, final String str2) {

        if (str1.contains("-")) {
            throw new NumberFormatException("So thu nhat phai la so nguyen duong");
        }

        if (str2.contains("-")) {
            throw new NumberFormatException("So thu nhi phai la so nguyen duong");
        }

        String finalResult = ""; // String contain the final result 
        String stepMsg = ""; // chuỗi chứa các bước trong quá trình cộng

        int getSum = 0; // variable get The Sum of two numbers
        int getUnit = 0;// variable get The number per unit
        int remember = 0; // variable remember The number when sumed greater than 9
        int i = 0;

        int stringContain1 = 0; // variable get the number in String 1
        int stringContain2 = 0; // variable get the number in String 2

        int lengthStr1 = str1.length(); // variable contain the length of String 1
        int lengthStr2 = str2.length(); // variable contain the length of String 2
        
        char checkS1;
        char checkS2;                          

        int lengthContain = lengthStr1 < lengthStr2 ? lengthStr2 : lengthStr1; 

        for (i = 0; i < lengthContain; i++) {
            
            checkS1 = i < lengthStr1 ? str1.charAt(i) : '0';
            checkS2 = i < lengthStr2 ? str2.charAt(i) : '0';

            if (!(checkS1 >= '0' && checkS1 <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (str1.indexOf(checkS1) + 1)
                        + " cua so thu 1 khong phai la so");
            }

            if (!(checkS2 >= '0' && checkS2 <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (str2.indexOf(checkS1) + 1)
                        + " cua so thu 2 khong phai la so");
            }
            
            stringContain1 = i < lengthStr1 ? (str1.charAt(lengthStr1 - i - 1) - '0') : 0;
            stringContain2 = i < lengthStr2 ? (str2.charAt(lengthStr2 - i - 1) - '0') : 0;

            getSum = stringContain2 + stringContain1 + remember;
            getUnit = getSum % 10;

            if (remember == 0) {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                        + "Lay " + stringContain1
                        + " cong " + stringContain2
                        + " bang " + getSum + ""
                        + " viet " + getUnit
                        + " nho " + getSum / 10 + "\n";
            } else {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                        + "lay " + stringContain1
                        + " cong " + stringContain2
                        + " nho " + remember
                        + " bang " + getSum
                        + " viet " + getUnit
                        + " nho " + remember + "\n";
            }

            remember = getSum / 10;
            finalResult = getUnit + finalResult;
            
        }
        
        if (remember > 0) {
            finalResult = remember + finalResult;
            stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                        + "lay " + 0
                        + " cong " + 0
                        + " nho " + 1
                        + " bang " + 1
                        + " viet " + 1
                        + "\n";
        } 
        
        IReceiver.sendMessage(stepMsg);
        
        return finalResult;
    }
}