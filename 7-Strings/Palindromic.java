package com.q10viking.Strings;
//判断是否是回文字符串
public class Palindromic {
	//核心算法
	public static boolean isPalindromic(String s) {
		for(int i=0,j=s.length()-1;i<j;++i,--j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
	//Test
	public static void main(String[] args) {
		String[] strArr= {"abcba","abccba","abcde"};
		for(int i=0;i<strArr.length;i++) {
			if(isPalindromic(strArr[i]))
				System.out.println(strArr[i]+" is Palindromic");
		}
	}

}
/*
abcba is Palindromic
abccba is Palindromic
*/