package com.java.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args) throws IOException{
		String file="demo/dos.dat";
		DataOutputStream dos=new DataOutputStream(
				new FileOutputStream(file));
	dos.writeInt(10);
	dos.writeInt(-10);
	dos.writeDouble(10.5);
	dos.writeUTF("�й�");//UTF-8
dos.writeChars("�й�");//UTF-16be
dos.close();
IOUtil.printHex(file);
	}

}
