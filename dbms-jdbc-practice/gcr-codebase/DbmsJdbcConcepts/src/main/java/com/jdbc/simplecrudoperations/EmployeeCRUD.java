package com.jdbc.simplecrudoperations;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    static final String url = "jdbc:mysql://localhost:3306/sqlpractice";
    static final String username = "root";
    static final String password = "Aryan@120";   
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: updateSalary(); break;
                case 4: deleteEmployee(); break;
                case 5: searchEmployee(); break;
                case 6: System.exit(0);
            }
        }
    }

   
    // ADD EMPLOYEE
   
    static void addEmployee() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO employees VALUES (?, ?, ?)");

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, salary);

            ps.executeUpdate();

            System.out.println("Employee Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    // VIEW EMPLOYEES
    
    static void viewEmployees() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            String query = "SELECT * FROM employees";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("salary"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

 
    // UPDATE SALARY

    static void updateSalary() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps =
                    con.prepareStatement(
                            "UPDATE employees SET salary=? WHERE id=?");

            ps.setInt(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Salary Updated");
            else
                System.out.println("Employee Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // DELETE EMPLOYEE
 
    static void deleteEmployee() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.print("Enter Employee ID to Delete: ");
            int id = sc.nextInt();

            PreparedStatement ps =
                    con.prepareStatement(
                            "DELETE FROM employees WHERE id=?");

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted");
            else
                System.out.println("Employee Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    // SEARCH EMPLOYEE
  
    static void searchEmployee() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            sc.nextLine();

            System.out.print("Enter Name to Search: ");
            String name = sc.nextLine();

            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT * FROM employees WHERE name=?");

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("salary"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
