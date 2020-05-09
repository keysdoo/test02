package demo01;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        ArrayList<Teacher>teachers=new ArrayList<>();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("系统总菜单");
            System.out.println("请选择学生端/教师端，或者登出系统");
            System.out.println("1：");
            System.out.println("学生端");
            System.out.println("2：");
            System.out.println("教师端");
            System.out.println("3:");
            System.out.println("登出系统");

            switch (scanner.nextInt()){
                case 1:
                    studentsManage(students);
                    break;
                case 2:
                    teachersManage(teachers);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误请重新输入！");

            }

        }





    }

    //添加学员
    private static void addStudent(ArrayList<Student> stuList, Scanner sc) {

        Student student = new Student();
        System.out.println("请输入学员生日：");
        student.setBirthday(sc.next());
        System.out.println("请输入学员姓名：");
        student.setName(sc.next());
        System.out.println("请输入学员性别：");
        student.setSex(sc.next());
        student.setId(Utils.sid++);

        student.setAge(Utils.birthdayToAge(student.getBirthday()));
        stuList.add(student);
        System.out.println("【成功】学员信息添加成功！");


    }
    //修改学员
    private static int updateStudent(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("请输入修改的学生id：");
        int id=sc.nextInt();
        for (int i=0;i<stuList.size();i++){
            Student student=stuList.get(i);
            if (student.getId() ==id) {
                System.out.println("【查询结果】要修改的学员信息：");
                //打印
                Utils.printPerson(student);
                //执行修改
                System.out.println("请输入新姓名(保留原值输入0)：");
                String newName = sc.next();
                System.out.println("请输入新性别(保留原值输入0)：");
                String newSex = sc.next();
                System.out.println("请输入新出生日期(yyyy-MM-dd)(保留原值输入0)：");
                String newBirthday = sc.next();

                if (!"0".equals(newName)) {
                    student.setName(newName);
                }
                if (!"0".equals(newSex)) {
                    student.setSex(newSex);
                }
                if (!"0".equals(newBirthday)) {
                    student.setBirthday(newBirthday);
                }
                System.out.println("【成功】学员信息修改成功！");
                return 0;
            }

        }
        System.out.println("【错误】学员ID：" +id + " 没找到！");
        return  0;
    }


    //删除学员
    private static void deleteStudent(ArrayList<Student> stuList, Scanner sc) {

        System.out.println("请输入要删除的学员ID：");
        int stuId = sc.nextInt();
        //查询
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId() == stuId) {
                System.out.println("【查询结果】要删除的学员信息：");
                Utils.printPerson(stu);
                System.out.println("【确认】您确定要删除这条信息吗(y/n)？");
                String str = sc.next();
                if ("y".equals(str)) {
                    stuList.remove(i);
                    System.out.println("【成功】数据已被删除！");
                    return;//结束方法
                }else{
                    System.out.println("【取消】操作被取消！");
                    return;
                }

            }

        }
        System.out.println("【错误】学员ID：" + stuId + " 未找到！");

    }
    //查询所有学员
    private static void selectAll(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("查询结果");
        if (stuList.size() == 0) {
            System.out.println("无数据");
            return;
        }
        Utils.printList(stuList);//调用工具类打印

    }


    private static int teachersManage(ArrayList<Teacher> teachers) {
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("欢迎来到教师端！");
            System.out.println("请选择功能：");
            System.out.println("1:");
            System.out.println("添加教师");
            System.out.println("2:");
            System.out.println("查询所有教师");
            System.out.println("3:");
            System.out.println("删除教师");
            System.out.println("4:");
            System.out.println("修改教师");
            System.out.println("5:");
            System.out.println("返回上一级菜单！");
            switch (scanner.nextInt()){
                case 1:
                    addTeachers(teachers,scanner);
                    break;
                case 2:
                    selectTeachers(teachers,scanner);
                    break;
                case 3:
                    deleteTeachers(teachers,scanner);
                    break;
                case 4:
                    updateTeachers(teachers,scanner);
                    break;
                case 5:

                    return 0;

                default:
                    System.out.println("输入错误，请重新输入！");
                    break;

            }


        }






    }

    private static int updateTeachers(ArrayList<Teacher> teachers, Scanner sc) {
        System.out.println("请输入修改的教师id：");
        int id=sc.nextInt();
        for (int i=0;i<teachers.size();i++){
            Teacher teacher=teachers.get(i);
            if (teacher.getId() ==id) {
                System.out.println("【查询结果】要修改的学员信息：");
                //打印
                Utils.printPerson(teacher);
                //执行修改
                System.out.println("请输入新姓名(保留原值输入0)：");
                String newName = sc.next();
                System.out.println("请输入新性别(保留原值输入0)：");
                String newSex = sc.next();
                System.out.println("请输入新出生日期(yyyy-MM-dd)(保留原值输入0)：");
                String newBirthday = sc.next();

                if (!"0".equals(newName)) {
                    teacher.setName(newName);
                }
                if (!"0".equals(newSex)) {
                    teacher.setSex(newSex);
                }
                if (!"0".equals(newBirthday)) {
                    teacher.setBirthday(newBirthday);
                }
                System.out.println("【成功】学员信息修改成功！");
                return 0;
            }

        }
        System.out.println("【错误】学员ID：" +id + " 没找到！");
        return  0;

    }

    private static void deleteTeachers(ArrayList<Teacher> teachers, Scanner scanner) {
        System.out.println("请输入要删除的教师ID：");
        int id =scanner.nextInt();
        //查询
        for (int i = 0; i < teachers.size(); i++) {
            Teacher stu =teachers.get(i);
            if (stu.getId() ==id) {
                System.out.println("【查询结果】要删除的教师信息：");
                Utils.printPerson(stu);
                System.out.println("【确认】您确定要删除这条信息吗(y/n)？");
                String str = scanner.next();
                if ("y".equals(str)) {
                    teachers.remove(i);
                    System.out.println("【成功】数据已被删除！");
                    return;//结束方法
                }else{
                    System.out.println("【取消】操作被取消！");
                    return;
                }

            }

        }
        System.out.println("【错误】教师ID：" + id + " 未找到！");

    }

    private static void addTeachers(ArrayList<Teacher> teachers ,Scanner sc) {

        Teacher teacher = new Teacher();
        System.out.println("请输入教师生日：");
        teacher.setBirthday(sc.next());
        System.out.println("请输入教师姓名：");
        teacher.setName(sc.next());
        System.out.println("请输入教师性别：");
        teacher.setSex(sc.next());
        teacher.setId(Utils.tid++);
        teacher.setAge(Utils.birthdayToAge(teacher.getBirthday()));
        teachers.add(teacher);
        System.out.println("【成功】教师信息添加成功！");
    }

    private static void selectTeachers(ArrayList<Teacher> teachers ,Scanner sc) {
        System.out.println("查询结果");
        if (teachers.size() == 0) {
            System.out.println("无数据");
            return;
        }
        Utils.printList(teachers);//调用工具类打印


    }

    private static int studentsManage(ArrayList<Student> students) {
        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("欢迎来到学生端！");
            System.out.println("请选择功能：");
            System.out.println("1:");
            System.out.println("添加学员");
            System.out.println("2:");
            System.out.println("查询所有学员");
            System.out.println("3:");
            System.out.println("删除学员");
            System.out.println("4:");
            System.out.println("修改学员");
            System.out.println("5:");
            System.out.println("返回上一级菜单！");
            switch (scanner.nextInt()){
                case 1:
                    addStudent(students,scanner);
                    break;
                case 2:
                    selectAll(students,scanner);
                    break;
                case 3:
                    deleteStudent(students,scanner);
                    break;
                case 4:
                    updateStudent(students,scanner);
                    break;
                case 5:
                    return 0;

                default:
                    System.out.println("输入错误，请重新输入！");
                    break;

            }
        }



    }


}
