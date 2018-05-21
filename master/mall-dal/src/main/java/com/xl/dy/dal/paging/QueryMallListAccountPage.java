package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_EMPL TA_EMPL
 */
public class QueryMallListAccountPage extends BasePage<Map>{

    /**
     * value .
     */
    private String value;

    /**
     * Set value .
     */
    public void setValue(String value){
        this.value = value;
    }

    /**
     * Get value .
     *
     * @return the string
     */
    public String getValue(){
        return value;
    }
}
