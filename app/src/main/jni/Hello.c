//
// Created by Administrator on 2017/6/15 0015.
//
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

/**
*jstring:返回值
*Java_全类名_方法名
*JNIEnv* env   上下文
*jobject jobj   谁调用了这个方法就是谁的实例
*当前就是JNI.this
*/

jstring Java_com_loadingbar_demo_demondk_JNI_sayHello(JNIEnv *env, jobject jobj) {
// jstring     (*NewStringUTF)(JNIEnv*, const char*);
    char *text = "I am from c";
    return (*env)->NewStringUTF(env, text);
}


jint Java_com_loadingbar_demo_demondk_JNI_add
        (JNIEnv *env, jobject jobj, jint ji, jint jj) {

    int result = ji + jj;
    return result;
};

jstring Java_com_loadingbar_demo_demondk_JNI_sayHi
        (JNIEnv * env, jobject jobject, jstring jstr){

};

