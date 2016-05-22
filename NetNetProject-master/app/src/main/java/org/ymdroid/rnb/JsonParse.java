package org.ymdroid.rnb;

import org.json.JSONException;
import org.json.JSONObject;




public class JsonParse {

    public JsonParse(){}

    public boolean StatusJsonParse(String data){
        boolean status = false;
        try {
            JSONObject  jsonRootObject = new JSONObject(data);
            status =jsonRootObject.optBoolean("status");
            return status;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void getUserInfo(String res){
        try {
            JSONObject  jsonRootObject = new JSONObject(res);
            JSONObject data =jsonRootObject.optJSONObject("data");
            UserInfo userInfo = UserInfo.getInstance();
            String user_id= data.optString("uemail");
            String password= data.optString("upasswd");
            String name= data.optString("uname");
            //String birth= data.optString("birth");
            userInfo.setUserData(user_id, password,name);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
