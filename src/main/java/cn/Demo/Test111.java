package cn.Demo;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Administrator on 2022/10/19.
 */
@Slf4j
public class Test111 {
    public static void main(String[] args) {
        Test111 test111 = new Test111();
        String str = "abc";
        test111.changeStr(str);
        System.out.println(str);
        String[] chars = str.split("");
        for (String s : chars) {
            System.out.println(s);
        }
        char[] chars1 = str.toCharArray();
        for (char s : chars1) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(chars));
        ArrayList<String> strings = new ArrayList<String>();
        Object[] objects = strings.toArray();
        HashMap<String, Character> map = new HashMap<String, Character>();
        /**
         * 验证值传递和引用传递的区别
         */
        String a = "good";
        char[] chars2 = {'a', 'b', 'c'};
        test111.change(a,chars2);
        System.out.println(a + Arrays.toString(chars2));
    }
    private  void changeStr(String input){
        input = input + "11111";
    }
    private void change(String str,char[] chars){
        str = str.substring(0,2);
        chars[0] = 'g';
    }
}
