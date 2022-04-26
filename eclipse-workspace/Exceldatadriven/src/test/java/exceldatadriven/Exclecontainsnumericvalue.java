package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exclecontainsnumericvalue {
	

	public ArrayList<String> getdata(String TestName) throws IOException {

		ArrayList<String> d = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\Demotest.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			// System.out.println( workbook.getSheetName(0));

			if (workbook.getSheetName(i).equalsIgnoreCase("sample")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();

				Iterator<Cell> ce = firstrow.cellIterator();

				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("testcases")) {

						column = k;

					}
					k++;

				}
				System.out.println(column);

				//
				while (rows.hasNext()) {
					Row r = rows.next();

					if (r.getCell(column).getStringCellValue().equals(TestName)) {
						Iterator<Cell> cv = r.cellIterator();

						while (cv.hasNext()) {
                         
							Cell c=cv.next();
							
							if(c.getCellType()==CellType.STRING)
							{
								d.add(c.getStringCellValue());
							}
							
							else
							{
							   d.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}

						
							    
							    
							
						}
					}

				}

			}

		}
		return d;

	}

	public static void main(String[] args) throws IOException {

		Exclecontainsnumericvalue a = new Exclecontainsnumericvalue(); // dont want to create obj use static keyword
		ArrayList<String> data = a.getdata("username"); // ArrayList<String> data =getdata("username");

		System.out.println(data.get(0));
		System.out.println(data.get(1));

		System.out.println(data.get(2));

		System.out.println(data.get(3));

	}
}
