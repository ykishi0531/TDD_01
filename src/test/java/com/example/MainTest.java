package com.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest {
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 正順
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_正順_Test() {
		// 入力値を設定
		String[] args = new String[]{"10", "20", "30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(20));
		assertThat(resultList.get(2), is(30));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 逆順
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_逆順_Test() {
		// 入力値を設定
		String[] args = new String[]{"30", "20", "10"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(20));
		assertThat(resultList.get(2), is(30));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * ランダム
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_ランダム_Test() {
		// 入力値を設定
		String[] args = new String[]{"30", "10", "20"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(20));
		assertThat(resultList.get(2), is(30));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 同数含む
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_同数含む_Test() {
		// 入力値を設定
		String[] args = new String[]{"30", "10", "10"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(10));
		assertThat(resultList.get(2), is(30));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 同数のみ
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_同数のみ_Test() {
		// 入力値を設定
		String[] args = new String[]{"10", "10", "10"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(10));
		assertThat(resultList.get(2), is(10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 負数のみ正順
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_負数のみ正順_Test() {
		// 入力値を設定
		String[] args = new String[]{"-10", "-20", "-30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-30));
		assertThat(resultList.get(1), is(-20));
		assertThat(resultList.get(2), is(-10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 負数のみ逆順
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_負数のみ逆順_Test() {
		// 入力値を設定
		String[] args = new String[]{"-30", "-20", "-10"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-30));
		assertThat(resultList.get(1), is(-20));
		assertThat(resultList.get(2), is(-10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 負数のみランダム
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_負数のみランダム_Test() {
		// 入力値を設定
		String[] args = new String[]{"-10", "-30", "-20"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-30));
		assertThat(resultList.get(1), is(-20));
		assertThat(resultList.get(2), is(-10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 負数のみ同数含む
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_負数のみ同数含む_Test() {
		// 入力値を設定
		String[] args = new String[]{"-10", "-10", "-30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-30));
		assertThat(resultList.get(1), is(-10));
		assertThat(resultList.get(2), is(-10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 負数のみ同数のみ
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_負数のみ同数のみ_Test() {
		// 入力値を設定
		String[] args = new String[]{"-10", "-10", "-10"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-10));
		assertThat(resultList.get(1), is(-10));
		assertThat(resultList.get(2), is(-10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * 正数負数混合
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_正数負数混合_Test() {
		// 入力値を設定
		String[] args = new String[]{"10", "-10", "0"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(-10));
		assertThat(resultList.get(1), is(0));
		assertThat(resultList.get(2), is(10));
	}
	
	/**
	 * 正常系
	 * 整数のみの配列の場合
	 * プラスの記号を含む場合
	 * 
	 * 数の小さい順にソートされたリストが取得できること
	 * 
	 */
	@Test
	public void sortNum_プラスの記号を含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"+10", "+20", "+30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		List<Integer> resultList = main.sortNum(args);
		
		// 配列数が変わっていない事
		assertThat(resultList.size(), is(args.length));
		// リストの並び順が期待通りであること
		assertThat(resultList.get(0), is(10));
		assertThat(resultList.get(1), is(20));
		assertThat(resultList.get(2), is(30));
	}
	
	/**
	 * 異常系
	 * 配列に整数以外を含む場合
	 * 小数
	 * 
	 * IllegalArgumentExceptionの例外がスローされること
	 * 
	 */
	@Test
	public void sortNum_小数を含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"10.1", "20.2", "30.3"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		try {
			main.sortNum(args);
			// 正常終了はテスト失敗
			fail();
		} catch (IllegalArgumentException e) {
			// 期待する例外がスローされる事
			assertThat(e.getMessage(), is("小数を含めないでください"));
		}
	}

	/**
	 * 異常系
	 * 配列に整数以外を含む場合
	 * 文字列
	 * 
	 * NumberFormatExceptionの例外がスローされること
	 * 
	 */
	@Test
	public void sortNum_文字列を含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"10a", "20b", "30c"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		try {
			main.sortNum(args);
			// 正常終了はテスト失敗
			fail();
		} catch (NumberFormatException e) {
			// 期待する例外がスローされる事
			assertThat(e.getMessage(), is("文字列を含めないでください"));
		}
	}
	
	/**
	 * 異常系
	 * 配列に整数以外を含む場合
	 * プラスマイナス以外の記号
	 * 
	 * NumberFormatExceptionの例外がスローされること
	 * 
	 */
	@Test
	public void sortNum_プラスマイナス以外の記号を含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"*10", "20", "30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		try {
			main.sortNum(args);
			// 正常終了はテスト失敗
			fail();
		} catch (NumberFormatException e) {
			// 期待する例外がスローされる事
			assertThat(e.getMessage(), is("文字列を含めないでください"));
		}
	}

	/**
	 * 異常系
	 * 配列に整数以外を含む場合
	 * プラス記号のみを含む
	 * 
	 * NumberFormatExceptionの例外がスローされること
	 * 
	 */
	@Test
	public void sortNum_プラス記号のみを含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"+", "20", "30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		try {
			main.sortNum(args);
			// 正常終了はテスト失敗
			fail();
		} catch (NumberFormatException e) {
			// 期待する例外がスローされる事
			assertThat(e.getMessage(), is("文字列を含めないでください"));
		}
	}

	/**
	 * 異常系
	 * 配列に整数以外を含む場合
	 * マイナス記号のみを含む
	 * 
	 * NumberFormatExceptionの例外がスローされること
	 * 
	 */
	@Test
	public void sortNum_マイナス記号のみを含む場合_Test() {
		// 入力値を設定
		String[] args = new String[]{"-", "20", "30"};
		
		// テスト対象のクラスのインスタンスを作る
		Main main = new Main();
		
		// テスト対象メソッドを実行
		try {
			main.sortNum(args);
			// 正常終了はテスト失敗
			fail();
		} catch (NumberFormatException e) {
			// 期待する例外がスローされる事
			assertThat(e.getMessage(), is("文字列を含めないでください"));
		}
	}
}
