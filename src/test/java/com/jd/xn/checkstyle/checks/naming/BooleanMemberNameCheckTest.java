package com.jd.xn.checkstyle.checks.naming;

import static com.jd.xn.checkstyle.checks.naming.BooleanMemberNameCheck.MSG_ILLEGAL_BOOLEAN_MEMBER_NAME;

import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import org.junit.Test;

/**
 * Created by yanglikun on 2017/7/15.
 */
public class BooleanMemberNameCheckTest extends CustomNamingBaseCheckTestSupport {


    @Test
    public void testSpecified()
            throws Exception {
        final DefaultConfiguration checkConfig =
                createCheckConfig(BooleanMemberNameCheck.class);

        final String[] expected = {
                "11: " + getCheckMessage(MSG_ILLEGAL_BOOLEAN_MEMBER_NAME,"isSuccess"),
                "15: " + getCheckMessage(MSG_ILLEGAL_BOOLEAN_MEMBER_NAME,"isSuccess"),
        };
        verify(checkConfig, getPath("BooleanMemberNameSimple.java"), expected);
    }

}
