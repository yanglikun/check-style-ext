package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;

public class InputCustomImportOrderThirdPartyAndSpecial
{
}
/*
test: testThirdPartyAndSpecialImports()
configuration:
        checkConfig.addAttribute("specialImportsRegExp", "antlr.*");
        checkConfig.addAttribute("customImportOrderRules",
                "SAME_PACKAGE(3)###THIRD_PARTY_PACKAGE###STATIC###SPECIAL_IMPORTS");
*/
