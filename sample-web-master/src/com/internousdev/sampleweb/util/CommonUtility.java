package com.internousdev.sampleweb.util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtility {
	public String getRamdomValue() {
		String value="";
		double d;
		//16桁の数字の「文字列」を作っているだけ
		for(int i=1; i<=16; i++) {
			d=Math.random() * 10;
			//計算しているわけではなく、ただ単に追加しているだけ
			value=value+((int)d);
		}
		return value;
	}


	// splitするだけ、後ろの「0」は関係ない。
	public String[] parseArrayList(String s) {
		return s.split(", ",0);
	}

	//　多分、配列をさらに配列にして分けてる
	public <E> List<List<E>>  devideList(List<E> list, int size){
		if (list == null || list.isEmpty() || size <= 0) {
			return null;
		}
		// 　　　　　　　　　　　　　　　剰余の余りを0or1にします？たぶん
		int block = list.size() / size + (list.size() % size > 0 ? 1 : 0 );
		List<List<E>> devidedList = new ArrayList<List<E>>(block);
		for (int i = 0; i < block; i ++) {
			int start = i * size;
			int end = Math.min(start + size, list.size());
			devidedList.add(new ArrayList<E>(list.subList(start, end)));
		}
		return devidedList;
		}
}
