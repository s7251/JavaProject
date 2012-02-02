
package pl.com.mycompany.javaproject.exception;


public class PersistedObjectIsNullException extends Exception {

    public PersistedObjectIsNullException() {
        super("Persisted object is null, this maybe a big problem.");
    }
}
