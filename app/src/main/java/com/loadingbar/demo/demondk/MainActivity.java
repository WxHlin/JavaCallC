package com.loadingbar.demo.demondk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    private JNI jni;
    private Button sayhello ,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jni=new JNI();

        sayhello= (Button) findViewById(R.id.sayhello);
        add= (Button) findViewById(R.id.add);

        sayhello.setOnClickListener(this);
        add.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            /**
             * java 调用 C   输出：I am from c
             * @param view
             */
            case R.id.sayhello:
                Log.d(MainActivity.class.getSimpleName(),jni.sayHello());
                break;
            case R.id.add:
                Log.d(MainActivity.class.getSimpleName(),jni.add(156122,45152)+"");
                break;
        }
    }
}
