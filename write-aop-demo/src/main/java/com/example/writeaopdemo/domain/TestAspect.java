package com.example.writeaopdemo.domain;

import com.example.writeaopdemo.annotion.Aspect;
import com.example.writeaopdemo.annotion.PointCut;
import com.example.writeaopdemo.proxy.AbsMethodAdvance;
@Aspect
public class TestAspect extends AbsMethodAdvance {
    /**
     *全类名 方法名
     */
    @PointCut("com.example.writeaopdemo.domain.Test_doSomeThing")
    public void testAspect(){

    }


    @Override
    public void doBefore() {
            System.out.println("do before");
    }

    @Override
    public void doAfter() {
        System.out.println("do after");
    }
}
