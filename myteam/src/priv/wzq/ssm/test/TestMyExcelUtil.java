package priv.wzq.ssm.test;

import java.util.ArrayList;
import java.util.List;

import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.util.MyExcelUtil;

public class TestMyExcelUtil {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		
		MyExcelUtil.saveWorkBook2007ToFile(MyExcelUtil.exportUserExcel(list), "d:/java.xlsx");
	}
}
