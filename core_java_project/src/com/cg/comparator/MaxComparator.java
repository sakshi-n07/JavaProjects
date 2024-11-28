package com.cg.comparator;

import java.util.Comparator;

public class MaxComparator implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Empp e1 = (Empp) o1;
		Empp e2 = (Empp) o2;
		if (e1.salary==e2.salary)
			return 0;
		else if(e1.salary>e2.salary)
			return 1;
		else 
			return -1;
	}

}
