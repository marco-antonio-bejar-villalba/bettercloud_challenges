package org.example.week2;

import java.io.IOException;
import java.sql.SQLException;

public class FinallyBehavior {

    private final static int THROW_IOEXCEPTION = 1;
    private final static int THROW_SQLEXCEPTION = 2;

    public static void main(String[] args) throws Exception {
        m1();
    }

    private static void m1() throws Exception {

        try {
            m2(THROW_SQLEXCEPTION);
        } catch (IOException e) {
            throw new SQLException();
        } catch (SQLException e) {
            throw new InstantiationException();
        } finally {
            throw new CloneNotSupportedException();
        }
    }

    private static void m2(int throwIoexception) throws Exception {
        if (throwIoexception == THROW_SQLEXCEPTION)
            throw new IOException();
        else
            throw new SQLException();
    }
}
