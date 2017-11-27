package com.tinyweb;

import java.util.List;
import java.util.Map;

/**
 * Created by hessam on 11/24/17.
 */
public interface RenderingStrategy {

    public String renderView(Map<String,List<String>> model);
}
