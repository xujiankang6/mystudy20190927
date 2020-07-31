#include "Java_com_jiankang_javacoretechnologythetenversion_dchapter12_v1_HelloNative.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_com_jiankang_javacoretechnologythetenversion_dchapter12_v1_HelloNative_greeting(JNIEnv *, jclass){
  
  printf("hello world! this greeting is from native method by C");
  }