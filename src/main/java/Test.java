import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午2:08 2018/4/23
 */

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("1");
        list.add("a");
        list.add("s");
        list.add("4");
        System.out.println(list.toString());
        String s = list.toString();
        String s1 = s.substring(s.indexOf("[")+1, s.indexOf("]"));
        System.out.println(s1);
        String[] split = s1.split(", ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
