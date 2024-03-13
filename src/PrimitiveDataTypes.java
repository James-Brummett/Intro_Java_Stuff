public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // whole numbers
        // -128 to 127
        byte myByte = 12;

        // -32,768 to 32,767
        short myShort = 1234;

        // -2,147,483,648 to 2,147,483,647
        int myInt = 23;

        // -9,223,372,036,854,775,808 to -9,223,372,036,854,775,807
        long myLong = 12323;

        // decimals
        // about 6 decimal places
        float myFloat = 6.3f;

        // about 15 decimal places
        double myDouble = 45.213434;

        // true of false
        boolean myBoolean = false;

        // one character
        char myChar = 'W';


        // examples of use of primitive data types
        System.out.println(myByte + myLong);
        System.out.println(myInt - myFloat);
        System.out.println(myShort + myDouble);

        for(int i = 10; i <= myInt; ++i) {
            if(i == myInt) {
                myBoolean = true;
            } //end if
            System.out.println(myBoolean);
        }// end for loop

        System.out.println(myChar);

    }// end main

}// end class
