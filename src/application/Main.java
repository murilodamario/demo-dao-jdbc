package application;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        System.out.println(obj);
    }
}
