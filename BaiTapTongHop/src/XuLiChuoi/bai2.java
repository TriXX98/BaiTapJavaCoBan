package XuLiChuoi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Liet ke so lan xuat hien cua cac tu trong 1 chuoi");
		System.out.println("Moi ban nhap chuoi : ");
		String str = new Scanner(System.in).nextLine();
		Map<String, Integer> word = countWord(str);
		for (String key : word.keySet()) {
			System.out.print(key + " " + word.get(key) + "\n");

		}

	}
	/**
     * Đếm số từ của một chuỗi, 
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều 
     * dấu 'space', tab '\t' và xuống dòng '\n'
     * 
     * @param str - chuỗi ký tự
     * @return số từ của chuỗi ký tự str
     */


	private static Map<String, Integer> countWord(String str) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new TreeMap<>();
		if (str == null) {
			return map;
		}
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
				builder.append(str.charAt(i));

			} else {
				addWord(map, builder);
				builder = new StringBuilder();
			}
		}

		return map;
	}
	 /**
     * Thêm từ vào word
     * 
     * @param word: map chứa các từ và số lần xuất hiện
     * @param sb: từ cần thêm vào word
     */


	public static void addWord(Map<String, Integer> map, StringBuilder builder) {

		String word = builder.toString();
		if (word.length() == 0) {
			return;
		}

		if (map.containsKey(word)) {
			int count = map.get(word) + 1;
			map.put(word, count);

		} else {
			map.put(word, 1);
		}

	}

}
