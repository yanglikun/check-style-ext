package com.jd.xn.checkstyle.checks.naming;

/**
 * test
 * Created by yanglikun on 2017/7/15.
 */
public class BooleanMemberNameSimple {

    private String a;

    private boolean isSuccess;

    private boolean success;

    private Boolean isSuccess;

    private Boolean success;

    private boolean issue;

    public void save() {
        System.out.println("aa");
    }

    public void update() {
        System.out.println("aa");
    }

    public void insert3() {
        System.out.println("aa");
    }


}
