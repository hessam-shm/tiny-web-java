package com.tinyweb;

import java.util.List;
import java.util.Map;

/**
 * Created by hessam on 11/24/17.
 */
public class StrategyView implements View{

    private RenderingStrategy viewRenderer;

    public StrategyView(RenderingStrategy viewRenderer) {
        this.viewRenderer = viewRenderer;
    }

    @Override
    public String render(Map<String, List<String>> model) {
        try{
            return viewRenderer.renderView(model);
        }catch (Exception e){
            //throw new RenderingException(e);
            throw e;
        }
    }
}
