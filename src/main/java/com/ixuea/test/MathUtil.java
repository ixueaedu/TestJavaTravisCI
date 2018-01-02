package com.ixuea.test;

public class MathUtil {

    /**
     * 返回a,b两个数中最大数的
     *
     * @param a
     * @param b
     * @return
     */
    public static int max(int a, int b) {
        return a > b ? a : b;

//                return a>b?b:a;// 这是错误的
    }


    public static int min(int a, int b) {
        if (a > b) {
            //假设这里还有很多逻辑
            return b;
        } else {
            //假设这里还有很多逻辑
            return a;
        }
    }
}
