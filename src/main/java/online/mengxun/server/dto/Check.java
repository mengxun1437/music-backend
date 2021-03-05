package online.mengxun.server.dto;

import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;

public class Check {
    public boolean containFormBody(JSONObject neededFormData, JSONObject submitFormData) {
        try {
            Iterator<String> neededKeys = neededFormData.keySet().iterator();

            while (neededKeys.hasNext()) {
                String neededKey = neededKeys.next();
                if (!submitFormData.containsKey(neededKey)) {
                    return false;
                }
            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
