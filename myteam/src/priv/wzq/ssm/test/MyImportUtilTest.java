package priv.wzq.ssm.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class MyImportUtilTest {
	public static void main(String[] args) {
		try{
			FileInputStream inputStream = new FileInputStream("d:\\java值班表.xlsx");
			//读取工作簿
			@SuppressWarnings("resource")
			Workbook workbook = new XSSFWorkbook(inputStream);
			//读取
			Sheet sheet =  workbook.getSheetAt(0);
			if(sheet.getPhysicalNumberOfRows()>1){
				for(int k=2;k<7;k++){
					Row row = sheet.getRow(k);
					for(int j=1;j<=4;j++){
						Cell cell2 = row.getCell(j);
						System.out.print(cell2+" ");
					}
						System.out.println();
					}
				}
				
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
