package com.liuly.www.likeindeterminatecheckbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.buildware.widget.indeterm.IndeterminateCheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private IndeterminateCheckBox icb;
    private Button btn_as_checked;
    private Button btn_not_as_checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        icb = (IndeterminateCheckBox) findViewById(R.id.icb);
        btn_as_checked = (Button) findViewById(R.id.btn_as_checked);
        btn_not_as_checked = (Button) findViewById(R.id.btn_not_as_checked);
        icb.setIndeterminateColorAsChecked(false);

        btn.setOnClickListener(this);
        btn_as_checked.setOnClickListener(this);
        btn_not_as_checked.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() ) {
            case R.id.btn:
                icb.setIndeterminate(true);
                break;
            case R.id.btn_as_checked:
                icb.setIndeterminateColorAsChecked(true);
                break;
            case R.id.btn_not_as_checked:
                icb.setIndeterminateColorAsChecked(false);
                break;
        }
    }
}
