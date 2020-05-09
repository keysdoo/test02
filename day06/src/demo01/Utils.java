package demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Utils {
    // 静态成员变量
    public static int sid;// 学生id    100  重启程序后--->希望101   0
    public static int tid;// 教师id

    static {
        // 后期可以改为从文件或者数据库中读取初始值
        // sid,tid 存储到一个文件中 100
        sid = 0;// 从文件中读取上一次存储的值,赋为初始值
        tid = 0;
    }

    /**
     * 根据生日计算年龄
     * @param birthday
     * @return
     */
    public static int birthdayToAge(String birthday) {// 例如: "1999-10-10"
        // 得到生日日期的: 年,月,日  ---> 得到生日日期的日历对象

        // 1.把字符串类型的birthday转换为Date类型的对象
        Date birthdDate = null;
        // 1.1 创建一个日期格式化对象,指定解析规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 1.2 调用parse方法解析,得到Date类型对象    处理异常的代码不用管,后期会学
        try {
            birthdDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 2.把出生日期转换为日历对象
        Calendar calBirthday = Calendar.getInstance();// 获取当前日历对象
        // 5.使用日历对象调用setTime方法重新设置日期
        calBirthday.setTime(birthdDate);// calBirthday日历就是出生日期的日历对象


        // 得到当前日期的: 年,月,日  ---> 得到当前日期的日历对象
        // 3.获取当前系统时间
        Calendar cal = Calendar.getInstance();

        //如果出生日期大于当前时间，则返回-1
        if (cal.before(calBirthday)) {
            return -1;
        }

        // 4.获取当前年,月,日,用三个变量存储起来
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
        int nowDate = cal.get(Calendar.DAY_OF_MONTH);



        // 6.获取出生日期的年,月,日,用三个变量存储起来
        int birthYear = calBirthday.get(Calendar.YEAR);
        int birthMonth = calBirthday.get(Calendar.MONTH);
        int birthDate = calBirthday.get(Calendar.DAY_OF_MONTH);

        // 7.计算初步的年龄: 当前年份 - 出生年份
        int age = nowYear - birthYear;

        // 8.判断是否有没有过过生日:
        // 8.1 如果月份没到: 当前月份小于出生月份 年龄-1
        if (nowMonth < birthMonth) {
            age--;
        }

        // 8.2 如果月份到了,日期没到: 当前日期小于出生日期 年龄-1
        if (nowMonth == birthMonth) {
            if (nowDate < birthDate) {
                age--;
            }
        }

        // 9.返回年龄
        return age;
    }

    public static void printList(ArrayList list) {
        // 如果集合中没有数据,就显示所有数据,结束方法
        System.out.println("******************************************************");
        System.out.println("id\t\tname\tsex\t\tbirthday\t\tage\t\t描述");
        for (int i = 0; i < list.size(); i++) {
            // 获取集合中的对象
            Object obj = list.get(i);
            // 把获取的对象的类型强转为Person类型
            if (obj instanceof Person) {

                Person p = (Person) obj;
                // 使用工具方法打印Person对象
                Utils.printPerson(p);// 在工具类中定义打印规则
            }
        }
        System.out.println("******************************************************");
    }

    /**
     * 打印Person类的对象或者Person类的子类对象
     *
     * @param p
     */
    public static void printPerson(Person p) {
        System.out.println(p.getId() + "\t\t" +
                p.getName() + "\t\t" +
                p.getSex() + "\t\t" +
                p.getBirthday() + "\t\t" +
                p.getAge() + "\t\t" +
                "我是一名:" + p.type() + ",我的工作是:" + p.work());
    }
}
