package com.playground;

public class ReverseInteger {

	public static int binaryReversal(String str) {

		StringBuilder sb;

		// convert the input string to number and to the binary form
		int num = Integer.parseInt(str);
		str = Integer.toBinaryString(num);

		int binaryNum = Integer.parseInt(str);

		// add the padding 0's.
		str = String.format("%08d", binaryNum);

		// reverse the binary number
		sb = new StringBuilder(str).reverse();

		str = sb.toString();

		// convert the reversed binary string to integer
		int decimalNum = Integer.parseInt(str, 2);

		return decimalNum;

	}

	public static void main(String[] args) {

		System.out.println(binaryReversal("47"));

	}

}
