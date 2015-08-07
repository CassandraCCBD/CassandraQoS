#include<stdio.h>
#include<jni.h>
#include<syscall.h>
#include "Hello.h"

JNIEXPORT jint JNICALL Java_Hello_HelloWorld(JNIEnv *env, jobject obj) 
{
	printf("hello World");
	jint tid = syscall(__NR_gettid);
	printf("Thread ID is %d\n", tid);
	return tid;
}
