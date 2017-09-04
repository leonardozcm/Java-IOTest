package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	/*
	 * ��ȡָ���ļ�����16�������������̨
	 * ����û���10byte������
	 */
public static void printHex(String fileName)throws IOException {
	//���ļ���Ϊ�ֽ�����������
	FileInputStream in=new FileInputStream(fileName);
	int b;
	int i=1;
	while((b=in.read())!=-1) {
		if(b<=0xf) {
			System.out.print("0");
		}
		System.out.print(Integer.toHexString(b)+"  ");
		if(i++%10==0) {
			System.out.println();
		}
	}
	in.close();
}
public static void printHexByByteArray(String fileName)throws IOException {
	FileInputStream in=new FileInputStream(fileName);
	byte[] buf=new byte[20*1024];
	//��in��������ȡ�ֽڣ�����buf����ֽ�������
	//���ص��Ƕ������ֽڸ���
	int  bytes=in.read(buf,0,buf.length);//һ���Զ��꣬˵���㹻��
	int j=0;
	for(int i=0;i<bytes;i++){
		if(buf[i]<=0xf) {
			System.out.print("0");
		}
		System.out.println(Integer.toHexString(buf[i])+"  ");
		if(j++%10==0) {
			System.out.println();
		}

	}
	in.close();
}
/**
 * 
 * @param srcFile Դ�ļ�
 * @param destFile Ŀ���ļ�
 * @throws IOException
 */
public static void copyFile(File srcFile,File destFile)throws IOException{
	if(!srcFile.exists()) {
		throw new IllegalArgumentException("�ļ�������");
	}
	if(!srcFile.isFile()) {
		throw new IllegalArgumentException("�����ļ�");
	}
	FileInputStream in=new FileInputStream(srcFile);
	FileOutputStream out=new FileOutputStream(destFile);
	byte[] buf=new byte[8*1024];
	int b;
	while((b=in.read(buf,0,buf.length))!=-1) {
		out.write(buf, 0, b);
		out.flush();
	}
	in.close();
	out.close();
 }

}
