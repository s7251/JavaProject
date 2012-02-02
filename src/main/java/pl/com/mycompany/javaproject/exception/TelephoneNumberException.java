
package pl.com.mycompany.javaproject.exception;


public class TelephoneNumberException extends Exception {

    public TelephoneNumberException() {
        super("Telephone number is to long!");
    }
}
