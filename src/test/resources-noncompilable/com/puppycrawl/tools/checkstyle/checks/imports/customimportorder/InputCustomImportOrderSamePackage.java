//Moved to noncompilable because UT requires imports from the same package
package java.util.concurrent;
public class InputCustomImportOrderSamePackage {
}
/*
test: testStaticSamePackage()
configuration:
        checkConfig.addAttribute("thirdPartyPackageRegExp", "org.");
        checkConfig.addAttribute("customImportOrderRules",
                "STATIC###SAME_PACKAGE(3)");
        checkConfig.addAttribute("sortImportsInGroupAlphabetically", "true");
*/
