package com.nun.wjq.project.fileupload.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * 对文件的基本操作，包括查找文件是否存在，文件创建，路径是否存在，路径的创建，文件的删除，拷贝，移动，重命名
 * @author zxm
 * @version 1.0
 */
import java.io.IOException;
import java.io.InputStream;
public class FileTakes {
	/**
	 * 根据路径文件夹{@link File}}，查找文件路径是否存在
	 * @param file 文件路径制定的文件
	 * @return 是否存在，存在返回true不存在返回false
	 */
	public static boolean isExistFilePath(File file){
		if(!file.exists()&&!file.isDirectory()){
			return false;
		}else{
			return true;
		}
		
	}
	
	/**
	 * 根据路径名，查找文件路径是否存在
	 * @param filePath 文件路径
	 * @return 是否存在，存在返回true不存在返回false
	 */
	public static boolean isExistFilePath(String filePath){
		File file = new File(filePath);
		return isExistFilePath(file);
	}
	
	/**
	 * 根据路径文件对象{@link File},创建文件路径
	 * @param file 路径文件对象
	 * @return 是否创建成功，成功返回true,失败返回false
	 */
	public static boolean createFilePath(File file){
		if(!isExistFilePath(file)){
			file.mkdirs();
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据路径名，创建相应的路径
	 * @param filePath 文件路径
	 * @return 返回文件路径是否创建成功
	 */
	public static boolean createFilePath(String filePath){
		File file = new File(filePath);
		return createFilePath(file);
	}
	
	/**
	 * 根据文件{@link File}}，判断文件是否存在
	 * @param file 要查找是否存在的文件
	 * @return
	 */
	public static boolean isExitFile(File file){
		if(file.exists()){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据文件路径，判断文件是否存在
	 * @param filePath
	 * @return
	 */
	public static boolean isExitFile(String filePath){
		File file = new File(filePath);
		return isExitFile(file);
	}
	
	/**
	 * 根据文件创建不存在的文件,如果存在就不创建，只要最后文件存在就返回true，否则返回false
	 * @param file 文件对象
	 * @return
	 */
	public static boolean createFile(File file){
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		}
		return true;
	}
	
	/**
	 * 根据文件路径，创建文件，如果存在就不创建，只要最后文件存在则返回true,否则返回false
	 * @param filePath 文件路径
	 * @return
	 */
	public static boolean createFile(String filePath){
		File file = new File(filePath);
		return createFile(file);
		
	}
	
	/**
     * 删除空目录
     * @param dir 将要删除的目录路径
     */
    public static boolean deleteEmptyDir(String dir) {
       return (new File(dir)).delete();
        
    }
    
    /**
     * 更具文件路径文件删除文件
     * @param file
     * @return
     */
    public static boolean deleteEmptDir(File file){
    	return file.delete();
    }

    /**
     * 递归删除目录下的所有文件及子目录下所有文件，包括本身文件
     * @param dir 将要删除的文件目录
     * @return 
     */
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }
    /**
     * 递归删除文件夹下面的所有文件，包括本身文件
     * @param dir
     * @return
     */
    public static boolean deleteDir(String dir){
    	File file = new File(dir);
    	return deleteDir(file);
    }
    
    /**
     * zxm
     * @param file 要更改文件名的文件的文件对象
     * @param toFileName 要更改的文件名字，不包含路径
     * @return
     */
    public static boolean changeFileName(File file,String toFileName){
    	if(!file.exists()||file.isDirectory()){
    		return false;
    	}else{
    		File toFile = new File(file.getParent()+"\\"+toFileName);
    		file.renameTo(toFile);
    		return true;
    	}
    	
    }
    /**
     * 通过文件路径来更改文件名
     * @param filePath 要更改名字的文件路径，包含文件名
     * @param toFileName 要更改到的文件名
     * @return
     */
    public static boolean changeFileName(String filePath,String toFileName){
    	File file = new File(filePath);
    	return changeFileName(file, toFileName);
    }
    
   /** 
    * 复制单个文件 
    * @param oldPath String 原文件路径 如：c:/fqf.txt 
    * @param newPath String 复制后路径 如：f:/fqf.txt 
    * @return boolean 
    */ 
    public static boolean copyFile(String oldPath, String newPath) { 
	    try { 
		    int bytesum = 0; 
		    int byteread = 0; 
		    File oldfile = new File(oldPath); 
		    if (oldfile.exists()) { //文件存在时 
			    InputStream inStream = new FileInputStream(oldPath); //读入原文件 
			    FileOutputStream fs = new FileOutputStream(newPath); 
			    byte[] buffer = new byte[1444]; 
			    int length; 
			    while ( (byteread = inStream.read(buffer)) != -1) { 
				    bytesum += byteread; //字节数 文件大小 
				    
				    fs.write(buffer, 0, byteread); 
			    } 
			    inStream.close(); 
		    } 
	    } 
	    catch (Exception e) { 
		    System.out.println("复制单个文件操作出错"); 
		    e.printStackTrace(); 
		    return false;
	    } 
	    return true;

    } 

    /** 
    * 复制整个文件夹内容 
    * @param oldPath String 原文件路径 如：c:/fqf 
    * @param newPath String 复制后路径 如：f:/fqf/ff 
    * @return boolean 
    */ 
    public static boolean copyFolder(String oldPath, String newPath) { 

	    try { 
		    (new File(newPath)).mkdirs(); //如果文件夹不存在 则建立新文件夹 
		    File a=new File(oldPath); 
		    String[] file=a.list(); 
		    File temp=null; 
		    for (int i = 0; i < file.length; i++) { 
			    if(oldPath.endsWith(File.separator)){ 
			    	temp=new File(oldPath+file[i]); 
			    } 
			    else{ 
			    	temp=new File(oldPath+File.separator+file[i]); 
			    } 
		
			    if(temp.isFile()){ 
				    FileInputStream input = new FileInputStream(temp); 
				    FileOutputStream output = new FileOutputStream(newPath + "/" + (temp.getName()).toString()); 
				    byte[] b = new byte[1024 * 5]; 
				    int len; 
				    while ( (len = input.read(b)) != -1) { 
				    	output.write(b, 0, len); 
				    } 
				    output.flush(); 
				    output.close(); 
				    input.close(); 
				} 
			    if(temp.isDirectory()){//如果是子文件夹 
			    	copyFolder(oldPath+"/"+file[i],newPath+"/"+file[i]); 
			    } 
		    }
	    } 
	    catch (Exception e) { 
		    System.out.println("复制整个文件夹内容操作出错"); 
		    e.printStackTrace(); 
		    return false;
	    } 
	    return true;

    }
	
	public static void main(String[] args) {
		File file = new File("E:\\TT\\index.txt");
		copyFile("E:\\TT\\index.txt","E:\\TT\\index1.txt");
	}
}
