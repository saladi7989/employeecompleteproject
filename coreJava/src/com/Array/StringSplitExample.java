package com.Array;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StringSplitExample {

	public static void main(String[] args) {
		
		String str= "brahma,srinu_x4,mahesh,srinum_x4,bhanu,ravindra";
		
		String array[]=str.split(",");
		Function<String, String> sf=s->s.replaceAll("_x4", "");
		List<String> li=Arrays.stream(array).map(sf).collect(Collectors.toList());
		li.forEach(d->{ System.out.println(d);
		});
		
		//String[] st=str.split(",");
		// st.replaceall("_x4","");
		
		//for(int i=0;i<st.length;i++)
			
			//System.out.println(st[i]);
		

	}

}
