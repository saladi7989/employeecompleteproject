package com.java8Example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingOrderByname {

	public static void main(String[] args) {
		List<Employee2> emps = new ArrayList();
		emps.add(new Employee2("brahma", "ulli", LocalDate.of(2018, 5, 15), 101, 65000));
		emps.add(new Employee2("srinu", "Saladi", LocalDate.of(2019, 10, 20), 102, 50000));
		emps.add(new Employee2("mahesh", "velturla", LocalDate.of(2021, 2, 28), 103, 50500));
		emps.add(new Employee2("srinu", "betha", LocalDate.of(2020, 4, 30), 104, 45000));
		emps.add(new Employee2("bhanu", "yenumula", LocalDate.of(2022, 9, 2), 105, 55000));
		emps.add(new Employee2("srinu", "mekala", LocalDate.of(2023, 12, 16), 106, 40500));

		emps.sort(Comparator.comparing(Employee2::getFirstName).thenComparing(Employee2::getLastName));

		// Printing sorted employees
		for (Employee2 employee2 : emps) {
			System.out.println(employee2);
		}

	}

	}


