package pj.gdcp.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Fragment mLeftFlagment;
    private Fragment mAnotherLeftFlagment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button= (Button) findViewById(R.id.button);
        mLeftFlagment= new LeftFlagment();
        mAnotherLeftFlagment=new AnotherLeftFlagment();

        //动态添加flagment
        replaceFlagment(mLeftFlagment);

        /**
         * 点击事件,替换另一个Fragment
         * */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFlagment(mAnotherLeftFlagment);
            }
        });


    }

    /**
     * 动态添加或替换碎片的方法
     * */
    private void replaceFlagment(Fragment leftFlagment) {
        //获取FragmentManager
        FragmentManager manager=getSupportFragmentManager();
        //开启一个事务
        FragmentTransaction transaction=manager.beginTransaction();
        //向容器内添加碎片
        transaction.replace(R.id.left_layout,leftFlagment);
        //提交事务
        transaction.commit();
    }
}
