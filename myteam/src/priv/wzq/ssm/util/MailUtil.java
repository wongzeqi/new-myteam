package priv.wzq.ssm.util;
 
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
 
/**
 * Created by liguoqing on 2016/4/1.
 */
public class MailUtil {
 
    /**
     * 文本邮件
     */
    public static void sendTxtMail() {
 
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        // 设置邮件服务器
        javaMailSender.setHost("smtp.163.com");
        javaMailSender.setUsername("18795207136@163.com");
        javaMailSender.setPassword("w19960915");
        javaMailSender.setDefaultEncoding("UTF-8");
 
        //
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 设置收件人，寄件人
        simpleMailMessage.setTo("1016484945@qq.com"); // 也可以传一个数组 new String[] {"user1@gmail.com","user2@gmail.com"}
        simpleMailMessage.setFrom("18795207136@163.com");
        simpleMailMessage.setSubject("测试java邮件-简单文本的发送");
        simpleMailMessage.setText("这里是一段简单文本。");
 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");  // 验证用户名和密码
        properties.put("mail.smtp.timeout","25000");
 
        javaMailSender.setJavaMailProperties(properties);
        // 发送邮件
        javaMailSender.send(simpleMailMessage);
 
        System.out.println("邮件已发送");
 
    }
 
 
 /**
  * html邮件
  * @throws Exception
  */
    public static void sendHtmlMail() throws Exception {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        // 设置邮件服务器
        javaMailSender.setHost("smtp.aliyun.com");
        javaMailSender.setUsername("lgq@gmail.com");
        javaMailSender.setPassword("mima");
        javaMailSender.setDefaultEncoding("UTF-8");
 
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setTo("lgq0218@foxmail.com");
        mimeMessageHelper.setFrom("lgq0218@aliyun.com");
        mimeMessageHelper.setSubject("测试java邮件-html邮件的发送");
        StringBuilder str = new StringBuilder("<html><head></head><body><h1>");
        str.append("hello!this is spring mail test。<br/>");
        str.append("spring 邮件测试。<br/>");
        str.append("</h1></body></html>");
        // true 表示启用html
        mimeMessageHelper.setText(str.toString(),true);
 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");  // 验证用户名和密码
        properties.put("mail.smtp.timeout","25000");
 
        javaMailSender.setJavaMailProperties(properties);
        // 发送邮件
        javaMailSender.send(mimeMessage);
 
        System.out.println("邮件已发送");
 
    }
 
 
    /**
     * 附件邮件
     * @throws MessagingException
     */
    public void sendAttachedImageMail(String toMail) throws MessagingException {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        // 设置邮件服务器
        javaMailSender.setHost("smtp.163.com");
        javaMailSender.setUsername("18795207136@163.com");
        javaMailSender.setPassword("w19960915");
        javaMailSender.setDefaultEncoding("UTF-8");
 
 
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        // multipart模式
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setTo(toMail);
        mimeMessageHelper.setFrom("18795207136@163.com");
        mimeMessageHelper.setSubject("来自Java项目开发创新团队");
        StringBuilder str = new StringBuilder("<html><head></head><body><h1>");
        str.append("spring 邮件测试。<br/>");
        str.append("这个邮件中包含图片<br/>");
        str.append("<img src=\"cid:imageId\"/><br/>");  // cid为固定写法，imageId指定一个标识
        str.append("</h1></body></html>");
        // 启用html
        mimeMessageHelper.setText(str.toString(),true);
 
        FileSystemResource img = new FileSystemResource(new File("F:/test.jpg"));
        mimeMessageHelper.addInline("imageId", img);
 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");  // 验证用户名和密码
        properties.put("mail.smtp.timeout","25000");
 
        javaMailSender.setJavaMailProperties(properties);
        // 发送邮件
        javaMailSender.send(mimeMessage);
 
        System.out.println("邮件已发送");
    }
 
 
    /**
     * 附件
     * @throws UnsupportedEncodingException 
     * @throws MessagingException
     */
    public static void sendAttendedFileMail(String toMail,File file,String fileName) throws UnsupportedEncodingException {
    	 JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
         // 设置邮件服务器
         javaMailSender.setHost("smtp.163.com");
         javaMailSender.setUsername("18795207136@163.com");
         javaMailSender.setPassword("w19960915");
         javaMailSender.setDefaultEncoding("UTF-8");
  
 
 
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        // multipart模式
        
        try {
        	MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,"utf-8");
            mimeMessageHelper.setTo(toMail);
            mimeMessageHelper.setFrom("18795207136@163.com");
            mimeMessageHelper.setSubject("来自Java项目开发创新团队--王嘉琪");
            StringBuilder str = new StringBuilder("<html><head></head><body><h1>");
            str.append(fileName +"<br/>");
            str.append("</h1></body></html>");
			mimeMessageHelper.setText(str.toString(),true);
			mimeMessageHelper.addAttachment("java.xlsx",file);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        
 
//        FileSystemResource file = new FileSystemResource(new File("F:/test.pdf"));
//        mimeMessageHelper.addAttachment("test.pdf",file);
 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true"); // 验证用户名和密码
        properties.put("mail.smtp.timeout","25000");
 
        javaMailSender.setJavaMailProperties(properties);
        // 发送邮件
        javaMailSender.send(mimeMessage);
    }
}