package test.i18n;
import java.text.MessageFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

public class ParamFormat {

    public static void main(String[] args) {
       
       @SuppressWarnings({ "unused", "rawtypes" })
      LinkedList s;
        
//        // 测试缺省的资源文件 
//        testCustom();
//        // 测试美国英语的资源文件 
//        testDefault();
    }
    
    public static void testDefault() {
        // 获得缺省的系统区域 
        Locale locale = Locale.getDefault();
        // 获得资源文件 
        ResourceBundle rb = ResourceBundle.getBundle("message", locale);
        
        // 获得相应的key值        
        String greeting = rb.getString("greeting");
        String userInfo = rb.getString("userinfo");
        
        String name= "liky";
        int age = 18;
        Date birth = new Date();
        
        // 格式化参数,注意是一个Object的数组,这意味着可以将任何类型的对象来格式化模板. 
        Object[] params = {name,age,birth}; 
        
        // 格式化参数,返回格式后的字符串 
        String result = MessageFormat.format(userInfo, params);
        
        System.err.println(greeting + result);    
    }
    
    public static void testCustom() {
        // 设置定制的语言国家代码 
        Locale locale = new Locale("en_US");
        
        // 获得资源文件 
        ResourceBundle rb = ResourceBundle.getBundle("message", locale);
        
        // 获得相应的key值 
        String greeting = rb.getString("greeting");
        String userInfo = rb.getString("userinfo");
        
        String name= "liky";
        int age = 18;
        Date birth = new Date();
        
        // 格式化参数,注意是一个Object的数组,这意味着可以将任何类型的对象来格式化模板. 
        Object[] params = {name,age,birth}; 
        
        // 格式化参数,返回格式后的字符串 
        String result = MessageFormat.format(userInfo, params);
        
        System.err.println(greeting + result);    
    }    
}