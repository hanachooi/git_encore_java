package comm.encore.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.Scanner;

import com.encore.inheritance.Person;
import com.encore.inheritance.StudentDTO;

public class IODemo {

	public IODemo() {
		
	}

	public String inputStr() {
		
		// char 형으로 받지만, 읽어오는 것은 문자열로 받아오기에, 속도 측면에서 장점이 있다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Message : ");
		try {
		String[] data = br.readLine().split(" ");
		System.out.println("length : " + data.length);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return " ";
	}
	
	// 파일 저장 기능
		public static boolean outputFile() {
			
			boolean isFlag = false;
			Person[] perAry = new Person[10];
			int idx = 0;
			
			for(idx = 0; idx<3; idx++) {
				perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");
			}
			
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Input : ");
			String msg = scan.nextLine();
			
			File file = new File("c:/encore_file/testWriter.txt");
			
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				for(int i=0; i<perAry.length; i++) {
					if(perAry[i] != null) {
						bw.write(perAry[i].getName() + ":" + perAry[i].getAge() + ":" + perAry[i].getAddress() + ":" + ((StudentDTO)perAry[i]).getStuId());
						bw.newLine();
					}
				}
				isFlag = true;
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					
					if(bw != null)
						bw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			return isFlag;
			
		}
		
		public void outputSerializable() {
			//String msg = "난 직렬화된 객체여서 바이너리 형태로 저장이 가능함";
			StudentDTO stu = new StudentDTO("임정섭", 20, "서울", "1992");
			FileOutputStream fis;
			ObjectOutputStream oos = null;
			
			try {
				fis = new FileOutputStream("C:/encore_file/serial.txt");
				oos = new ObjectOutputStream(fis);
				oos.writeObject(stu);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				{try {if(oos!=null) 
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
					}
				}
			}
			
		}
		
		public void inputSerializable() {
			
			String msg = null;
			FileInputStream fls = null;
			ObjectInputStream oos = null;
			
			try {
				
				fls = new FileInputStream("c:/encore_file/serial.txt");
				oos = new ObjectInputStream(fls);
				
				//msg =  (String) (oos.readObject());
				//System.out.println(msg);
				Person [] perAry = (Person [])(oos.readObject());
				for(int i = 0; i<perAry.length; i++) {
					if(perAry[i] != null) {
						System.out.println(perAry[i].personInfo());
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				{try {if(oos!=null) 
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
					}
				}
			}
		}
}
