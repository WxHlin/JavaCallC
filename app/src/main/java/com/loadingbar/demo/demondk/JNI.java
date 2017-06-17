package com.loadingbar.demo.demondk;

/**
 * Created by Administrator on 2017/6/15 0015.
 *
 * 作用：java调用对应的C代码
 */

public class JNI {

    {
        System.loadLibrary("app");
    }

    /**
     *定义native代码
     * 调用C代码对于的方法
     * com.loadingbar.demo.demondk.JNI#sayHello()
     * @return
     */
    public native String sayHello();

    /**
     * 让c代码做加法运算，把结果返回
     * @param x
     * @param y
     * @return
     */
    public native int add(int x,int y);

    /**
     *从java传入字符串，c代码拼接后返回
     * @param s
     * @return
     */
    public native String sayHi(String s);


    /**
     * 让C代码给数组的每个元素加上10
     * @param array
     * @return
     */
    public native int[] increaseArrayEles(int[] array);

    /**
     * c代码检查密码是否正确  正确返回200  错误返回400
     * @param pwd
     * @return
     */
    public native int checkPwd(String pwd);

}
