package com.uhutu.miniapp.miniapp_android;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.nebula.provider.H5AppCenterPresetProvider;
import com.alipay.mobile.nebula.util.H5Utils;
import com.mpaas.nebula.adapter.api.MPNebula;
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
                //MiniappSupport.getInstance().jumpUrl("debug-miniapp://?system_uec-init_router=url%3ffield_a1%3d%e5%ad%97%e6%ae%b5%e4%b8%80%e5%8f%b7%26field_a2%3d%e5%ad%97%e6%ae%b5%e4%ba%8c%e5%8f%b7",miniappDelegate,getApplicationContext());
                //MiniappSupport.getInstance().jumpUrl("debug-miniapp://",miniappDelegate,getApplicationContext());
                //MiniappSupport.getInstance().jumpUrl("icome-miniapp://dream_career.app?a=1",miniappDelegate, MainActivity.this);

                MiniappSupport.getInstance().jumpUrl("icome-miniapp://demo_one.app",miniappDelegate,getApplicationContext());




            }
        });


        Button btn3 = (Button) findViewById(R.id.button3);



        btn3 .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                //MPNebula.startUrl("https://www.baidu.com");

                H5Utils.setProvider(H5AppCenterPresetProvider.class.getName(), new H5AppCenterPresetProviderImpl());


                String appId = "1001100110011001";
                Bundle bundle = new Bundle();

                LauncherApplicationAgent.getInstance().getMicroApplicationContext().startApp(null, appId, bundle);
            }
        });


    }
}
