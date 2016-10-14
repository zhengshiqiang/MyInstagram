package com.example.zsq.instagram.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.zsq.instagram.R;
import com.example.zsq.instagram.ui.view.SendingProgressView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton mCreateBtn;
    private SendingProgressView mSendingPV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    void initUI(){
        mCreateBtn = (ImageButton) findViewById(R.id.btnCreate);
        mCreateBtn.setOnClickListener(this);

        mSendingPV = (SendingProgressView) findViewById(R.id.vSendingProgress);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btnCreate:
                mSendingPV.simulateProgress();
                Toast.makeText(this, "show", Toast.LENGTH_SHORT).show();;
                break;
            default:
                break;
        }
    }
}
