package com.jd.xn.checkstyle.checks.naming;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

import java.util.regex.Pattern;

/**
 * Created by yanglikun on 2017/7/16.
 */
public class EnumClassNameCheck extends AbstractCheck {

    public static final String MSG_ILLEGAL_ENUM_CLASS_NAME = "illegal.enum.class.name";

    private Pattern format = Pattern.compile(".+Enum$");

    @Override
    public int[] getDefaultTokens() {
        return getAcceptableTokens();
    }

    @Override
    public int[] getAcceptableTokens() {
        return new int[]{TokenTypes.ENUM_DEF};
    }

    @Override
    public int[] getRequiredTokens() {
        return getAcceptableTokens();
    }

    @Override
    public void visitToken(DetailAST ast) {
        String enumName = ast.findFirstToken(TokenTypes.IDENT).getText();
        if (!isMatchingEnumName(enumName)) {
            log(ast.getLineNo(),
                    MSG_ILLEGAL_ENUM_CLASS_NAME, enumName);
        }

    }

    private boolean isMatchingEnumName(String className) {
        return format.matcher(className).find();
    }
}
