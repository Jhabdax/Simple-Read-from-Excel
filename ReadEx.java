	import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEx {


		    public static void main(String[] args) {
		        try {
		            FileInputStream fStream = new FileInputStream(new File("test.xlsx"));
		            Scanner sc = new Scanner(System.in);
				 	System.out.println("enter Row Number");
				 	
				 	int r= sc.nextInt();
				 	System.out.println("enter Column number");
				 	int c= sc.nextInt();
				 	sc.close();
		            
		            // Create workbook instance referencing the file created above
		            @SuppressWarnings("resource")
		            
					XSSFWorkbook workbook = new XSSFWorkbook(fStream);
		            
		            // Get your first or desired sheet from the workbook
		            XSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

		            XSSFRow row = sheet.getRow(r); // starts from 0
		            XSSFCell cell = row.getCell(c); // starts from 0


		            String location = cell1.toString();


		            System.out.println(location);
		            fStream.close();
		        } catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		    }	
	}

