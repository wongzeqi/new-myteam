package priv.wzq.ssm.test;


public class TestExcelAndMail {
//	public static void main(String[] args) throws Exception {
//		// 准备数据
//		List<Wind> winds = new ArrayList<>();// Wind有三个方法:getLocation、getSpeed、getTimestamp
//		for (int i = 0; i < 10; i++) {
//			Wind wind = new Wind();
//			wind.setLocation(i);
//			wind.setSpeed(i * 10);
//			wind.setTimestamp("2016/3/2" + i);
//			winds.add(wind);
//		}
//		String[] columnNames = { "地点ref", "wjq", "时间" };
//		String[] methodNames = { "getLocation", "getSpeed", "getTimestamp" };
//	//				String fileName = "d:/temp/excel1.xlsx";
//		String fileName = "d:/excel1.xlsx";
//		// 生成ExcelEntity实体，包含4个必备参数
//		ExcelEntity<Wind> excelEntity = new ExcelEntity<>(fileName, columnNames, methodNames, winds);
//		excelEntity.setHeader("题头");
//		//excelEntity.setFooter("脚注");
//		Workbook excel = ExcelExporter.export2Excel(excelEntity);
//		//ExcelExporter.export2Excel("题头","脚注", "sheet1", columnNames, methodNames, winds);//也可以这样调用,无需新建ExcelEntity对象
//		//将Workbook存为文件
//		File file = ExcelExporter.saveWorkBook2007ToFile(excel, excelEntity.getFileName());
//		MailUtil.sendAttendedFileMail("1016484945@qq.com",file);
//		System.out.println("导出完成！");
//	}
}
