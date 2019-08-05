package com.uhutu.miniapp.miniapp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uhutu.miniapp.mappandroid.miniapp.MiniappSupport;

public class MainActivity extends AppCompatActivity {


    private final static  MiniappDelegate miniappDelegate=new MiniappDelegate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);



                //final  String sLocalDir=this.getBaseContext().getFilesDir().getAbsolutePath() + File.separator;

        btn .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {





//你要执行的代码


                //MiniappSupport miniappSupport=new MiniappSupport();

                //miniappSupport.initConfig("http://icomeminiapp.srnpr.com/mapps/version/#/beta_android.json","","","",sLocalDir);




                //MiniappSupport.getInstance().jumpUrl("icome-miniapp://demo_one.app",miniappDelegate,getApplicationContext());
                //MiniappSupport.getInstance().jumpUrl("icome-miniapp://demo_one.app?a=1",miniappDelegate,getApplicationContext());
                MiniappSupport.getInstance().jumpUrl("debug-miniapp://",miniappDelegate,getApplicationContext());


            }
        });

    }
}
