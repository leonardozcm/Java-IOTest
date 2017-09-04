package com.java.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src=new File("demo/raf.dat");
		File dest=new File("demo/dest.dat");
        try {
        	IOUtil.copyFile(src, dest);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
