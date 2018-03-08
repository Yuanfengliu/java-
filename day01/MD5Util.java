 import java.security.MessageDigest;
  
/**  
 * 采用MD5加密 
 * @author Xingxing,Xie 
 * @datetime 2014-5-31  
 */  
public class MD5Util {  
    /***  
     * MD5加密 生成32位md5码 
     * @param 待加密字符串 
     * @return 返回32位md5码 
     */  
    public static String md5Encode(String inStr) throws Exception {  
        MessageDigest md5 = null;  
        try {  
            md5 = MessageDigest.getInstance("MD5");  
        } catch (Exception e) {  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
  
        byte[] byteArray = inStr.getBytes("UTF-8");  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++) {  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16) {  
                hexValue.append("0");  
            }  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
    }  
  
    /** 
     * 测试主函数 
     * @param args 
     * @throws Exception 
     */  
    public static void main(String args[]) throws Exception {  
        String str = new String("amigoxiexiexingxing1111222233334444555566667777888899990000");  
        System.out.println("原始：" + str);  
			long startTime=System.nanoTime();   //获取开始时间  
        System.out.println("MD5后：" + md5Encode(str)); 
			long endTime=System.nanoTime(); //获取结束时间  
			System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }  
}   

/*
//伪代码  
long startTime=System.nanoTime();   //获取开始时间  
doSomeThing();  //测试的代码段  
long endTime=System.nanoTime(); //获取结束时间  
System.out.println("程序运行时间： "+(end-start)+"ns");
*/