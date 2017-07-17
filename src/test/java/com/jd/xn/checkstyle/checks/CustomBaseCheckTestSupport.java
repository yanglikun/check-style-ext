package com.jd.xn.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.BaseCheckTestSupport;

import java.io.File;
import java.io.IOException;

/**
 * Created by yanglikun on 2017/7/15.
 */
public class CustomBaseCheckTestSupport extends BaseCheckTestSupport {

    @Override
    protected String getPath(String filename) throws IOException {
        return new File("src/test/resources/com/jd/xn/checkstyle/" + filename)
                .getCanonicalPath();
    }
}
