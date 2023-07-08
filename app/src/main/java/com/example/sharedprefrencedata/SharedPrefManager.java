package com.example.sharedprefrencedata;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefManager(Context context){
        sharedPreferences =context.getSharedPreferences(
                "com.example.sharedprefrence",context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setAsDefaultValue();
    }
    private void setAsDefaultValue(){
        setUsername("Admin");
        setPassword("123456");
    }

    private void setPassword(String password) {
        editor.putString("sp_Password", password);
        editor.commit();
    }

    private void setUsername(String admin) {
        editor.putString("sp_Username", admin);
        editor.commit();
    }
     public void saveIsLogin (Boolean value){
        editor.putBoolean("sp_isLogin",value);

     }

     public String getUsename(){
        return sharedPreferences.getString("sp_Username", "");
    }
    public String getPassword(){
        return sharedPreferences.getString("sp_Password", "");
    }
    public boolean getIsLogin(){
        return sharedPreferences.getBoolean("sp_isLogin", false);
    }
}
