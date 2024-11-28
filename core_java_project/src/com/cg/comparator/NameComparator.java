package com.cg.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Empp e1 = (Empp) o1;
		Empp e2 = (Empp) o2;
		return e1.name.compareTo(e2.name);
		
	}

}
