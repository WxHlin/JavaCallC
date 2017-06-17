# JavaCallC
JNI/NDK   java调用c
开发流程
1、在java写native代码
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
2、生成头文件.h
在AS下Terminal进入到app/src/main/java下，使用命令javah+全类名生成头文件
3、配置动态链接库的名称
        ndk{
            moduleName "Hello" //so文件：lib+moduleName+.so
            abiFilters "armeabi","armesbi-v7a","x86" //cpu的类型
        }
4、加载动态链接库

    {
        System.loadLibrary("app");
    }
    
5、调用

