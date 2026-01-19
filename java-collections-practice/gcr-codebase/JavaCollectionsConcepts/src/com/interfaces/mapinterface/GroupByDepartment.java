package com.interfaces.mapinterface;

import java.util.*;

// Group Employees by Department using Map
public class GroupByDepartment {
	static class Employee {
		String name;
		String department;

		// constructor
		public Employee(String name, String department) {
			this.name = name;
			this.department = department;
		}

		// good string representation
		@Override
		public String toString() {
			return name;
		}

		public String getDepartment() {
			return department;
		}
	}

	// Group employees by department using loop
	public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
		Map<String, List<Employee>> result = new HashMap<>();

		for (Employee emp : employees) {
			String dept = emp.getDepartment();

			// Get existing list or create new one
			List<Employee> list = result.get(dept);
			if (list == null) {
				list = new ArrayList<>();
				result.put(dept, list);
			}

			list.add(emp);
		}

		return result;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ram", "HR"));
		employees.add(new Employee("Ramesh", "IT"));
		employees.add(new Employee("Ramya", "HR"));
		employees.add(new Employee("Rameshwarr", "Finance"));
		employees.add(new Employee("Rudra", "IT"));

		System.out.println("All employees:");
		System.out.println(employees);

		Map<String, List<Employee>> grouped = groupByDepartment(employees);

		System.out.println("\nGrouped by department:");
		for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}