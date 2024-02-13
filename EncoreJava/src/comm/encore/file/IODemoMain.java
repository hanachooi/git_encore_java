package comm.encore.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IODemoMain {

	public static void main(String[] args) {

		IODemo demo = new IODemo();
		
		String msg = demo.inputStr();
		System.out.println(msg);
		IODemo d = new IODemo();
		boolean b = d.outputFile();
		String m = (b == true) ? "저장 성공" : "저장 실패";
		System.out.println(m);
	}

}
