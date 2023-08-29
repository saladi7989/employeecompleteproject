package com.singleton.example;

public class SingletonExam {

	
	    private static SingletonExam instance;

	    private SingletonExam() {

	    }

	    public static SingletonExam getInstance() {
	        if (instance == null) {
	            instance = new SingletonExam();
	        }
	        return instance;
	    }
	}


