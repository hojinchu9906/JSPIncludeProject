package com.jsp.change;

/**
 * Created by sist on 2016-03-18.
 */
public class JspChange {
    private static String[] jsp={
      "../main/default.jsp",
      "../member/join.jsp",
      "../board/list.jsp"
    };

    public static String jspChange(int no){
        return jsp[no];
    }
}
















