package no.hvl.dat109.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDriverManagerGetConnection {

    public static void main(String args[]) throws ClassNotFoundException {
        String name, pass, url;
        Connection con = null;

        try {
            Class.forName("no.hvl.dat109");
            url = "jdbc:postgresql://localhost:5432/postgres";
            name = "postgres@localhost";
            pass = "";

            con = DriverManager.getConnection(url, name, pass);

            System.out.println("Connection created");
            con.close();
            System.out.println("Connection closed");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
