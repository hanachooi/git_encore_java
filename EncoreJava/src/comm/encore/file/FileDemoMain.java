package comm.encore.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemoMain {

	public static void main(String[] args){

		/*
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\testReader.txt");
			int data = 0;
			// file의 마지막은 -1이므로, -1이 아닐때까지 출력함. 
			while((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e ) {
			e.printStackTrace();
		}*/
		
		IODemo demo = new IODemo();
		demo.outputSerializable();
		demo.inputSerializable();
		
	}
}
