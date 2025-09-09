import java.io.FileInputStream;
import java.io.IOException;

public class FileExistance {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Practice_Demo\\src\\handlingExceptions\\data.txt");
			int byteData;
			while ((byteData = fis.read()) != -1) { 
                System.out.print((char) byteData); 
            }
		}catch(IOException e) {
			System.out.println("File not found");
		}finally {
			try {
				if(fis!= null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}