package com.founq.sdk.dialogtest;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ring on 2019/8/14.
 */
public class MyDialog extends Dialog {

    private TextView mTitleText;
    private Button mSureBtn;
    private Button mCancleBtn;

    private String mTitle;
    private myOnclickListener mMyOnclickListener;



    private MyDialog(MyBuilder builder) {
        super(builder.mContext);
        mTitle = builder.mTitle;
        mMyOnclickListener = builder.mMyOnclickListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog);
        mTitleText = findViewById(R.id.tv_title);
        mSureBtn = findViewById(R.id.btn_sure);
        mCancleBtn = findViewById(R.id.btn_cancle);

        if (!TextUtils.isEmpty(mTitle)){
            mTitleText.setText(mTitle);
        }

        mSureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMyOnclickListener != null){
                    mMyOnclickListener.onSure(MyDialog.this);
                }
            }
        });

        mCancleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMyOnclickListener != null){
                    mMyOnclickListener.onCancle(MyDialog.this);
                }
            }
        });
    }

    interface myOnclickListener {
        public void onSure(MyDialog dialog);

        public void onCancle(MyDialog dialog);
    }

    public static class MyBuilder {
        private String mTitle;
        private myOnclickListener mMyOnclickListener;
        private Context mContext;
        public MyBuilder(Context context){
            mContext = context;
        }

        public MyBuilder setTitle(String title){
            this.mTitle = title;
            return this;
        }

        public MyBuilder setListener(myOnclickListener myOnclickListener){
            this.mMyOnclickListener = myOnclickListener;
            return this;
        }

        public MyDialog build(){
            return new MyDialog(this);
        }

    }
}
