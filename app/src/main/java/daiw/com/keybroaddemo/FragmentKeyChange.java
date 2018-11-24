package daiw.com.keybroaddemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import daiw.com.keybroaddemo.custom.ConstantsKeyBroad;
import daiw.com.keybroaddemo.custom.CustomKeyBroadEnglish;
import daiw.com.keybroaddemo.custom.CustomKeyBroadNumber;

/****************************
 * 类描述：
 *
 * @author: daiw
 * @time: 2018/11/24  5:46 PM
 *
 *         ***************************
 */
public class FragmentKeyChange extends Fragment {

    private View rootView;
    private TextView closeTv;

    private CustomKeyBroadNumber keyBroadNumber;
    private CustomKeyBroadEnglish keyBroadEnglish;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.dialog_keybroad,container,false);

        initViews();
        setListener();

        return rootView;
    }
    private void setListener() {
        //关闭键盘
        closeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关闭键盘
                ((MainActivity) getActivity()).hideAnimation();
            }
        });
        //数字键盘
        keyBroadNumber.setOnClickListener(new CustomKeyBroadNumber.OnClickListener() {
            @Override
            public void onClick(String content) {
                if(ConstantsKeyBroad.BTN_CHANGE.equals(content)){
                    //切换英文键盘
                    keyBroadNumber.setVisibility(View.GONE);
                    keyBroadEnglish.setVisibility(View.VISIBLE);
                }
            }
        });
        //英文键盘
        keyBroadEnglish.setOnClickListener(new CustomKeyBroadEnglish.OnClickListener() {
            @Override
            public void onClick(String content) {
                if(ConstantsKeyBroad.BTN_123.equals(content)){
                    //切换英文键盘
                    keyBroadNumber.setVisibility(View.VISIBLE);
                    keyBroadEnglish.setVisibility(View.GONE);
                }else {

                }
            }
        });
    }

    private void initViews() {
        //关闭键盘
        closeTv = rootView.findViewById(R.id.dialog_keybroad_input_show_tv);
        //数字键盘
        keyBroadNumber = rootView.findViewById(R.id.dialog_keybroad_number);
        //英文键盘
        keyBroadEnglish = rootView.findViewById(R.id.dialog_keybroad_english);
    }

}
