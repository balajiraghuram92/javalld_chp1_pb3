package com.assignment;

/**
 * Hello world!
 */
public final class BookNameValidator {
    
    public static void validate(String name) throws InvalidBookNameException
    {
        if(!name.startsWith("Scaler Java"))
        {
            throw new  InvalidBookNameException("Book name doesn't start with Scaler Java");
        }
        System.out.println("Book created!: " + name);               
    }
}
