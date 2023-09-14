package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C22throws {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("","",""); //SqlException
        var input = new FileInputStream(""); //FileNotFountException
        Class.forName(""); //ClassNotFoundException
    }
}
