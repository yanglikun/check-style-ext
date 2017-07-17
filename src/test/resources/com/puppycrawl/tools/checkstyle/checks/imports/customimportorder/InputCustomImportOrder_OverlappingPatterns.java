package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;

// every import from javadoc package has comment in brackets indicating presence of keywords
// Javadoc, Check, Tag. For example J_T = Javadoc, no Check, Tag
// STANDARD - keyword Check
// SPECIAL_IMPORTS - keyword Tag
//import com.puppycrawl.tools.checkstyle.checks.javadoc.TagParser; // (__T)
//import com.puppycrawl.tools.checkstyle.checks.javadoc.HtmlTag; //warn, should be on SPECIAL (__T)

public class InputCustomImportOrder_OverlappingPatterns {
}
/*
test: testRulesOrder_ThirdBeforeSame()
configuration:
        checkConfig.addAttribute("customImportOrderRules",
                "THIRD_PARTY_PACKAGE###SAME_PACKAGE(3)###SPECIAL_IMPORTS");
        checkConfig.addAttribute("sortImportsInGroupAlphabetically", "true");
*/
