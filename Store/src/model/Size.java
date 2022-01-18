package model;

import java.util.ArrayList;
import java.util.List;

public class Size {
    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";


    public Size() {}

    public List<String> listSize()
    {
        List<String> list = new ArrayList<String>();
        list.add(XS);
        list.add(S);
        list.add(M);
        list.add(L);
        list.add(XL);
        return list;
    }

}
