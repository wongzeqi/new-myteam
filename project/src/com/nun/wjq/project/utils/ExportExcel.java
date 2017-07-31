package com.nun.wjq.project.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;

import com.nun.wjq.project.result.Pst;

/**
 * 利用开源组件POI3.0.2动态导出EXCEL文档 转载时请保留以下信息，注明出处！
 * 
 * @author leno
 * @version v1.0
 * @param <T>
 *            应用泛型，代表任意一个符合javabean风格的类
 *            注意这里为了简单起见，boolean型的属性xxx的get器方式为getXxx(),而不是isXxx()
 *            byte[]表jpg格式的图片数据
 */
public class ExportExcel<T> {

	/**
	 * 这是一个通用的方法，利用了JAVA的反射机制，可以将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上
	 * 
	 * @param title
	 *            表格标题名
	 * @param headers
	 *            表格属性列名数组
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象。此方法支持的
	 *            javabean属性的数据类型有基本数据类型及String,Date,byte[](图片数据)
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyy-MM-dd"
	 * @throws IOException 
	 */
	public static void exportExcel(List<Pst> data, OutputStream out) throws IOException {
	   
	   final String titles[]={
		   "序号",	"项目编号",	"项目类型",	"项目名称",	"项目负责人姓名",	"项目负责人学号",	"参与学生人数",
		   "项目其他成员信息",	"指导教师姓名",	"指导教师职称",	"项目所属一级学科代码",	"项目经费（元）",	"项目所属学院"

	   };
	   
	  
	   
	   
	   
	   
	   
	   
	  
	   
      // 声明一个工作薄
	  HSSFWorkbook workbook = new HSSFWorkbook();
      // 生成一个表格
      HSSFSheet sheet = workbook.createSheet("国家级大学生创新创业训练计划项目");
      //设置默认高度
      sheet.setDefaultRowHeightInPoints(30);
      //创建合并单元格
      CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 12);
      //加载合并单元格对象
      sheet.addMergedRegion(cellRangeAddress);
      //设置默认宽度
      //sheet.setDefaultColumnWidth(20); 
     
      //
      //创建标题样式
      HSSFCellStyle titlestyle = workbook.createCellStyle();
      //创建表头样式
      HSSFCellStyle headerstyle = workbook.createCellStyle();
      //标题字体
	  HSSFFont font = workbook.createFont();
      font.setFontName("黑体");
      font.setFontHeightInPoints((short) 26);//设置字体大小
      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
      titlestyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
      titlestyle.setFont(font);
      
      
      HSSFFont font1 = workbook.createFont();
      font1.setFontName("宋体");
      font1.setFontHeightInPoints((short) 10);//设置字体大小
      font1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
      headerstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
      headerstyle.setFont(font1);
      
      
      //产生表头行
      HSSFRow row = sheet.createRow(0);
      HSSFCell cellheader = row.createCell(0);
      Calendar a=Calendar.getInstance();
	  cellheader.setCellValue(a.get(Calendar.YEAR)+"年国家级大学生创新创业训练计划项目信息表");
	  cellheader.setCellStyle(titlestyle);
      
      //产生表格标题行
      HSSFRow row1 = sheet.createRow(1);
      row1.setHeightInPoints(40);
      row1.setHeight((short) 40);
      for (short i = 0; i < titles.length; i++) {
		 HSSFCell cell = row1.createCell(i);
         cell.setCellStyle(headerstyle);
         HSSFRichTextString text = new HSSFRichTextString(titles[i]);
         cell.setCellValue(text);
      }
      
      
      
      int index = 1;
      int xuhao = 0;
      for(Pst p : data) {
    	  xuhao++;
    	  index++;
    	  System.out.println(xuhao);
    	  HSSFRow row11 = sheet.createRow(index);
    	  row11.setHeightInPoints(30);
    	  row11.setHeight((short) 30);
    	  for(short i = 0; i < titles.length; i++){
    		  @SuppressWarnings("deprecation")
			HSSFCell cell = row11.createCell(i);
    		  switch(i){
    		  
    		  	  case 0: 
    		  		  
    		  		  cell.setCellValue(xuhao);

    			  break; 

    			  case 1: 
    				  if(xuhao<10){
						cell.setCellValue(a.get(Calendar.YEAR)+"1140700"+xuhao);
    				  }
    				  if(10<=xuhao&&xuhao<100){
    					  Calendar.getInstance();
						cell.setCellValue(a.get(Calendar.YEAR)+"114070"+xuhao);
    				  }
    				  
    				  
    				  

    			  break;  

    			  case 2: 
    				  
    				  cell.setCellValue(p.getPtype().equals("1") ? "创新训练项目":"创业训练项目");

    			  break; 
    			  case 3: 
    				  cell.setCellValue(p.getPname());
    				  System.out.println(p.getPname());

    			  break; 
    			  case 4: 
    				  cell.setCellValue(p.getSname());

    			  break; 
    			  case 5: 
    				  cell.setCellValue(p.getSnumber());

    			  break; 
    			  case 6: 
    				  cell.setCellValue(6);

    			  break; 
    				  
    			  case 7: 
    				  cell.setCellValue("");

    			  break; 
    			  case 8: 
    				  cell.setCellValue(p.getTname());

    			  break; 
    			  //职称
    			  case 9: 
    				  cell.setCellValue(p.getPtitle());

    			  break; 
    			  	  //一级学科代码
    			  case 10: 
    				  cell.setCellValue("");

    			  break; 
    			  case 11: 
    				  cell.setCellValue("");

    			  break; 
    			  case 12: 
    				  cell.setCellValue(p.getAcademy());

    			 

    		  
    		  }
    	  }
    	  
      }
      
      
      workbook.write(out);
	
    
   }
	
	
	
	
}