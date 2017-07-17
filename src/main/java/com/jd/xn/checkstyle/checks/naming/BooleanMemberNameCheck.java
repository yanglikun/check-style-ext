package com.jd.xn.checkstyle.checks.naming;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;
import com.puppycrawl.tools.checkstyle.utils.ScopeUtils;

import java.util.regex.Pattern;

/**
 * Created by yanglikun on 2017/7/15.
 */
public class BooleanMemberNameCheck extends AbstractCheck {

    public static final String MSG_ILLEGAL_BOOLEAN_MEMBER_NAME = "illegal.boolean.member.name";

    private Pattern format = Pattern.compile("^is[A-Z]");

    @Override
    public int[] getDefaultTokens() {
        return getAcceptableTokens();
    }

    @Override
    public int[] getAcceptableTokens() {
        return new int[]{TokenTypes.VARIABLE_DEF};
    }

    @Override
    public int[] getRequiredTokens() {
        return getAcceptableTokens();
    }

    @Override
    public void visitToken(DetailAST ast) {
        //局部变量不校验
        if (ScopeUtils.isLocalVariableDef(ast)) {
            return;
        }
        String typeText = ast.findFirstToken(TokenTypes.TYPE).getFirstChild().getText();
        if ("boolean".equalsIgnoreCase(typeText)) {
            DetailAST memberNameAST = ast.findFirstToken(TokenTypes.IDENT);
            String memberName = memberNameAST.getText();
            if (format.matcher(memberName).find()) {
                log(memberNameAST.getLineNo(), memberNameAST.getColumnNo(), MSG_ILLEGAL_BOOLEAN_MEMBER_NAME, memberName);
            }
        }
    }
}
