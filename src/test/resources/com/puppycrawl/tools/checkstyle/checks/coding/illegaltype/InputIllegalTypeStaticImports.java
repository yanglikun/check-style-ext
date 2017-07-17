package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;

import static com.puppycrawl.tools.checkstyle.checks.coding.illegaltype.InputIllegalType.SomeStaticClass;
import static com.puppycrawl.tools.checkstyle.utils.CheckUtils.isElseIf;

import com.puppycrawl.tools.checkstyle.api.DetailAST;
//configuration: "illegalClassNames": SomeStaticClass
public class InputIllegalTypeStaticImports
{
     private boolean foo(DetailAST ast) {
         return isElseIf(ast);
     }
     SomeStaticClass staticClass; //WARNING
     private static SomeStaticClass foo1() { return null;}
     private static void foo2(SomeStaticClass s) {}
}
