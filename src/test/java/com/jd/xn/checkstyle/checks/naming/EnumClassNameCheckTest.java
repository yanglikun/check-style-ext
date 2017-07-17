package com.jd.xn.checkstyle.checks.naming;

import static com.jd.xn.checkstyle.checks.naming.EnumClassNameCheck.MSG_ILLEGAL_ENUM_CLASS_NAME;

import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import org.junit.Test;

/**
 * Created by yanglikun on 2017/7/16.
 */
public class EnumClassNameCheckTest extends CustomNamingBaseCheckTestSupport {

    @Test
    public void testInvalid()
            throws Exception {
        final DefaultConfiguration checkConfig =
                createCheckConfig(EnumClassNameCheck.class);
        final String[] expected = {
                "6: " + getCheckMessage(MSG_ILLEGAL_ENUM_CLASS_NAME, "EnumClassNameCheckSimple"),
        };
        verify(checkConfig, getPath("EnumClassNameCheckSimple.java"), expected);
    }

    @Test
    public void testValid()
            throws Exception {
        final DefaultConfiguration checkConfig =
                createCheckConfig(EnumClassNameCheck.class);
        final String[] expected = {

        };
        verify(checkConfig, getPath("EnumClassNameCheckEnum.java"), expected);
    }

}
