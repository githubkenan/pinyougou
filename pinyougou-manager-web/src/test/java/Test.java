import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @描述:
 * @创建人: 柯南_java
 * @修改人和其它信息:
 */
public class Test {
    public static void main(String[] args) {

        /*Java类初始化顺序
　　这是所有情况的类初始化顺序，如果实际类中没有定义则跳过：
    父类静态变量——父类静态代码块——子类静态代码块——
    父类非静态变量——父类非静态代码块——
    父类构造函数——
    子类非静态变量——子类非静态代码块——子类构造函数 */
        List<List<String>> add = new LinkedList<>();
        List<String> add2 = new ArrayList<>();
        add2.add("hello");
        add.add(add2);
        add2.add("hello");
        //add2.add("hello");
       // add.add(add2);
        System.out.println(add);
       // System.out.println(add2);


    }
    @org.junit.Test
    public void demo(){
        String s1="aaa";
        String s2="bbb";
        System.out.println(s1+"===="+s2);
        change(s1,s2);
        System.out.println(s1+"===="+s2);
        StringBuilder sb1=new StringBuilder("aa");
        StringBuilder sb2=new StringBuilder("bb");
        System.out.println(sb1+"===="+sb2);
        change(sb1,sb2);
        System.out.println(sb1+"===="+sb2);
    }

    public static  void change(StringBuilder sb1,StringBuilder sb2){
        sb1=sb2;
        sb2.append(sb1);
    }
    public static  void change(String s1,String s2){
        s1=s2;
        s2=(s1+s2);
       // System.out.println(s1+"=========="+s2);
    }
}
