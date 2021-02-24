package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;

    public static User fromJson(JSONObject jsonobject) throws JSONException {
        User user = new User();
        user.name = jsonobject.getString("name");
        user.screenName = jsonobject.getString("screen_name");
        user.profileImageUrl = jsonobject.getString("profile_image_url_https");
        return user;
    }
}
