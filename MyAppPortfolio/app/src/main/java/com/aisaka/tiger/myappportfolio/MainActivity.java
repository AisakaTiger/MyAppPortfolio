package com.aisaka.tiger.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(String appName){
        String content = getResources().getString(R.string.toast_btn_click_text);
        String placeholder = getResources().getString(R.string.toast_btn_click_text_placeholder);
        content = content.replace(placeholder,appName);
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }

    /**
     * Button Click Event
     * */
    public void launchApp(View v){
        String appName = "";
        switch (v.getId()) {
            case R.id.btn_app_popular_movies:
                appName = getResources().getString(R.string.app_popular_movies_name);
                break;
            case R.id.btn_app_stock_hawk:
                appName = getResources().getString(R.string.app_stock_hawk_name);
                break;
            case R.id.btn_app_build_it_bigger:
                appName = getResources().getString(R.string.app_build_it_bigger_name);
                break;
            case R.id.btn_app_make_your_material:
                appName = getResources().getString(R.string.app_make_your_app_material_name);
                break;
            case R.id.btn_app_go_ubiquitous:
                appName = getResources().getString(R.string.app_go_ubiquitous_name);
                break;
            case R.id.btn_app_capstone:
                appName = getResources().getString(R.string.app_capstone_name);
                break;
        }
        showToast(appName);
    }
}
