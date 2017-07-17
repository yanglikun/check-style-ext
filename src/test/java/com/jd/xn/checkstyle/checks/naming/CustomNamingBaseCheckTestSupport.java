package com.jd.xn.checkstyle.checks.naming;

import java.io.File;
import java.io.IOException;

import com.jd.xn.checkstyle.checks.CustomBaseCheckTestSupport;

/**
 * Created by yanglikun on 2017/7/16.
 */
public class CustomNamingBaseCheckTestSupport extends CustomBaseCheckTestSupport {

    @Override
    protected String getPath(String filename) throws IOException {
        return super.getPath("checks" + File.separator + "naming" + File.separator + filename);
    }
}
