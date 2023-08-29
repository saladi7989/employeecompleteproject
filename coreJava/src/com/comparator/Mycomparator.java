package com.comparator;

import java.util.Comparator;

public class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer val1, Integer val2) {
		if(val1>val2) {
			return -1;
		}else if(val1<val2) {
			return +1;
		}else{
			return 0;
	}

}
}
