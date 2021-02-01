package com.lbl.advice;

import net.bytebuddy.asm.Advice;
import org.apache.skywalking.apm.toolkit.trace.RunnableWrapper;

/**
 * @author binglongli217932
 * <a href="mailto:libinglong9@gmail.com">libinglong:libinglong9@gmail.com</a>
 * @since 2021/1/23
 */
public class MyAdvice {

    @Advice.OnMethodEnter
    static void enter(@Advice.Argument(value = 0, readOnly = false) Runnable runnable){
        runnable = RunnableWrapper.of(runnable);
    }

}