/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午2:08 2018/4/23
 */

public class Test {
    public static void main(String[] args) {
        String problemDesc = "投保人杜二粉投保华夏福临门年金保险（2015至尊版），意外风险保额达500万(包含500万)以上，需做体检项目三，并提交财务资料。";
        String number = problemDesc.substring(problemDesc.indexOf("体检项目") + 4,
                problemDesc.indexOf("，并"));
        System.out.println(number);
    }
}
