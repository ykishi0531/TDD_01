package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		
		System.out.println("ソート処理を開始");
		List<Integer> sortedList = main.sortNum(args);
		System.out.println("ソート完了");
		
		for (Integer number : sortedList) {
			System.out.println(number);
		}
	}
	
	/**
	 * String型の数値が入力された配列を
	 * 数値の小さい順にソートしたリストに変換\ます
	 * 
	 * @param args
	 * @return ソート済リスト
	 * @throws IllegalArgumentException, NumberFormatException
	 */
	public List<Integer> sortNum(String[] args) {
		List<Integer> resultList =  new ArrayList<Integer>();
		
		// ここの処理を実装
		
		return resultList;
	}

}
