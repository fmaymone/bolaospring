package com.estudos.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {

	public static Integer[] solution(Object[] in) {

		if (in == null)
			return null;

		List<Integer> out = new ArrayList<Integer>();

		for (Object element : in) {
			if (element instanceof Integer) {
				out.add((Integer) element);
			} else if (element instanceof Object[]) {
				out.addAll(Arrays.asList(solution((Object[]) element)));
			}
		}
		return out.toArray(new Integer[out.size()]);
	}

}
