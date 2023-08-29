package com.java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicats {

	public static void main(String[] args) {
		
			Integer[] arr = { 123, 123, 123, 456, 456, 431};
			List<Integer> ll = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());

			System.out.println(ll);
		}

	}


