package priv.wzq.ssm.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import priv.wzq.ssm.po.Zbitem;
import priv.wzq.ssm.service.ZbService;
/**
 * 导入值班表
 * @author admin
 *在实际情况中  上传一个文件，然后获取这个excel的文件流 传入该方法 进行 数据保存到数据库
 */
public class ImportUtil{
	public static void  importZbExcel(ZbService zbService ,FileInputStream inputStream){
		try{
			FileInputStream fileInputStream = new FileInputStream("d:\\java值班表.xlsx");
			//读取工作簿
			@SuppressWarnings("resource")
			Workbook workbook = new XSSFWorkbook(inputStream);
			//读取
			Sheet sheet =  workbook.getSheetAt(0);
			if(sheet.getPhysicalNumberOfRows()>1){
				for(int k=2;k<7;k++){
					Row row = sheet.getRow(k);
					for(int j=1;j<=4;j++){
							String cell2 = row.getCell(j).getStringCellValue();
							String [] s = cell2.split("-");
							for(int i =0 ;i<s.length;i++){
								Zbitem zb = new Zbitem();
								zb.setZj(k-1);//设置成周几
								zb.setKs(j);//设置那几节课值班
								zb.setSchoolnumber(s[i]);
								zbService.insert(zb);//将这个保存到数据库中
								System.out.println(zb.toString());
							}
						}
				}
			}
			}catch (Exception e){
				e.printStackTrace();
			}
	}
	
}
