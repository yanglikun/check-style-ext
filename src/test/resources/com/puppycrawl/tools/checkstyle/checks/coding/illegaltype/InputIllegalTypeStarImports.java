package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;

import java.util.LinkedList;
import java.util.List;
//configuration "illegalClassNames": List
public class InputIllegalTypeStarImports
{
    List<Integer> l = new LinkedList<>(); //WARNING
}
