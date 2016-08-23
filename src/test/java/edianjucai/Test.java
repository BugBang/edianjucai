package edianjucai;

import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

import com.edianjucai.util.DateFormatUtils;
import com.edianjucai.util.FileUtil;

public class Test {

    public static String[] chars = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x0a]);
        }
        return shortBuffer.toString();

    }
    
    /*public static void main(String[] args) {
        List<String> test = new ArrayList<String>();
        int i = 0;
        while (true) {
            String result = MD5Util.MD5Bit12(UUID.randomUUID().toString());
            if (test.contains(result)) {
                System.out.println("出现了重复数字:" + result);
                break;
            }
            test.add(result);
            System.out.println(i++);
        }
    }*/

    public static void main(String[] args) throws ParseException {
        /*String str = "06/15/2016";
        Date date = new Date();
        date.setTime(1356285180 * 1000);
        System.out.println(DateFormatUtils.dateToString(date));
        System.out.println(date.getTime() / 1000);
        System.out.println(DateFormatUtils.StringToDate(str, "MM/dd/yyyy").getTime() / 1000);*/
        String oldPath = "D:\\document\\项目\\会员管理\\css\\img\\01.png";
        String newPath = "D:\\document\\项目\\积分商城\\test\\jesse.png";
        FileUtil.Copy(oldPath, newPath);
    }

}
