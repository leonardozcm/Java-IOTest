package com.java.io;

public class EncodeDemo {
public static void main(String[] args) throws Exception {
	String s="Ä½¿ÎABC";
	byte[] byte1=s.getBytes();
	for(byte b:byte1) {
		System.out.print(Integer.toHexString(b & 0xff)+" ");
	}
	System.out.println();
	byte[]byte2=s.getBytes("gbk");
	for(byte b:byte2) {
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
    byte[]byte3=s.getBytes("utf-8");
    for(byte b:byte3) {
    	System.out.print(Integer.toHexString(b&0xff)+" ");
    }
}
}
