package daiw.com.keybroaddemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText username_edt;
    private EditText password_edt;
    private EditText password_edt_up;
    private Button login_btn;
    private FrameLayout keybraod_fl;
    /**
     *是否显示了键盘
     */
    private boolean isShowKeyBroad = false;

    private TranslateAnimation mShowAction;
    private TranslateAnimation mCloseAction;
    /**
     *是否是输入姓名
     */
    private boolean isUserName = true;

    private  FragmentKeyChange fragmentKeyChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        initView();
        setListener();
    }

    private void setListener() {
        username_edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    if(fragmentKeyChange != null){
                        fragmentKeyChange.resetTextView(((EditText)v).getText().toString().trim());
                    }
                }
                isUserName = true;
                //展示键盘
                if(! isShowKeyBroad) {
                    showAnimation();
                }
            }
        });
        password_edt_up.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    fragmentKeyChange.resetTextView(((EditText)v).getText().toString().trim());
                }
                isUserName = false;
                //展示键盘
                if(! isShowKeyBroad) {
                    showAnimation();
                }
            }
        });
    }

    private void initView() {
        username_edt = (EditText) findViewById(R.id.username_edt);
        password_edt = (EditText) findViewById(R.id.password_edt_down);
        password_edt_up = (EditText) findViewById(R.id.password_edt_up);
        login_btn = (Button) findViewById(R.id.login_btn);
        keybraod_fl = (FrameLayout) findViewById(R.id.keybraod_fl);

        username_edt.setInputType(InputType.TYPE_NULL); // 关闭软键盘
        password_edt.setInputType(InputType.TYPE_NULL); // 关闭软键盘
        password_edt_up.setInputType(InputType.TYPE_NULL); // 关闭软键盘

        initKeyBroadView();

        login_btn.setOnClickListener(this);
    }

    private void initKeyBroadView() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragmentKeyChange = new FragmentKeyChange();
        ft.add(R.id.keybraod_fl, fragmentKeyChange);
        ft.commit();
    }

    private void showAnimation() {
        isShowKeyBroad = true;

        keybraod_fl.setVisibility(View.VISIBLE);
        if(mCloseAction != null){
            mCloseAction.cancel();
            mCloseAction = null;
        }
        //设置显示时的动画
        mShowAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        mShowAction.setDuration(500);
        keybraod_fl.startAnimation(mShowAction);
    }

    public void hideAnimation() {
        if(mShowAction != null){
            mShowAction.cancel();
            mShowAction = null;
        }
        //设置隐藏时的动画，监听动画结束后隐藏选择框
        mCloseAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 1.0f);
        mCloseAction.setDuration(500);
        mCloseAction.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                isShowKeyBroad = false;
                keybraod_fl.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        keybraod_fl.startAnimation(mCloseAction);
    }

    public String addEditContent(String content){
        String result = "";
        if(isUserName){
            addChar(username_edt,content);
            result = username_edt.getText().toString().trim();
        }else {
            addChar(password_edt,content);
            addChar(password_edt_up,"*");
            result = password_edt_up.getText().toString().trim();
        }
        return result;
    }

    public String deleteEditContent(){
        String result = "";
        if(isUserName){
            deleteChar(username_edt);
            result = username_edt.getText().toString().trim();
        }else {
            deleteChar(password_edt);
            deleteChar(password_edt_up);
            result = password_edt_up.getText().toString().trim();
        }
        return result;
    }

    private void addChar(EditText editText, String data) {
        int index = editText.getSelectionStart();
        Editable editable = editText.getText();
        editable.insert(index, data);
    }

    private void deleteChar(EditText editText) {
        int index = editText.getSelectionStart();
        Editable editable = editText.getText();
        editable.delete(index - 1, index);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mShowAction != null){
            mShowAction.cancel();
            mShowAction = null;
        }
        if(mCloseAction != null){
            mCloseAction.cancel();
            mCloseAction = null;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:

                break;
        }
    }
}
