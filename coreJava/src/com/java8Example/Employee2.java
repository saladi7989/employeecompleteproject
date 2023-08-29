package com.java8Example;

import java.time.LocalDate;

public class Employee2 {

	 private String firstName;
	    private String lastName;
	    private LocalDate dateOfJoin;
	    private int id;
	    private double salary;
	    
		public Employee2(String firstName, String lastName, LocalDate dateOfJoin, int id, double salary) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfJoin = dateOfJoin;
			this.id = id;
			this.salary = salary;
		}

		public String getFirstName() {
			return firstName;
		}


		public String getLastName() {
			return lastName;
		}

		@Override
		public String toString() {
			return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoin=" + dateOfJoin
					+ ", id=" + id + ", salary=" + salary + "]";
		}

}
