package com.tinyweb;

import java.util.List;
import java.util.Map;

/**
 * Created by hessam on 11/24/17.
 */
public interface View {

    public String render(Map<String,List<String>> model);

}
