package commercialvehicle.careagle.com.baserecyclerviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by lida on 2017/12/13.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbarTb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbarTb = (Toolbar) findViewById(R.id.tb_toolbar);
        if (mToolbarTb !=null) {
            setSupportActionBar(mToolbarTb);
//            getSupportActionBar().setHomeButtonEnabled(true);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
