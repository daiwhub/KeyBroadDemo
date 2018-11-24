package daiw.com.keybroaddemo.custom;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import daiw.com.keybroaddemo.R;

import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_CHANGE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_DELETE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_EIGHT;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_FIVE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_FOUR;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_NINE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_ONE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_SEVEN;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_SIX;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_THREE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_TWO;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_ZERO;

/****************************
 * 类描述：自定义数字键盘
 *
 * @author: daiw
 * @time: 2018/11/24  12:56 AM
 *
 *         ***************************
 */
public class CustomKeyBroadNumber extends ConstraintLayout implements View.OnClickListener{

    private Context context;
    private View rootView;

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_0;
    private ItemKeyBroadChange btn_change;
    private Button btn_delete;

    private OnClickListener onClickListener;

    public CustomKeyBroadNumber(Context context) {
        super(context);
        this.context = context;
        initViews();
    }

    public CustomKeyBroadNumber(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initViews();
    }

    public CustomKeyBroadNumber(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initViews();
    }

    private void initViews() {
        rootView = LayoutInflater.from(context).inflate(R.layout.layout_keybroad_number,this);
        btn_1 = rootView.findViewById(R.id.layout_keybroad_1_btn);
        btn_2 = rootView.findViewById(R.id.layout_keybroad_2_btn);
        btn_3 = rootView.findViewById(R.id.layout_keybroad_3_btn);
        btn_4 = rootView.findViewById(R.id.layout_keybroad_4_btn);
        btn_5 = rootView.findViewById(R.id.layout_keybroad_5_btn);
        btn_6 = rootView.findViewById(R.id.layout_keybroad_6_btn);
        btn_7 = rootView.findViewById(R.id.layout_keybroad_7_btn);
        btn_8 = rootView.findViewById(R.id.layout_keybroad_8_btn);
        btn_9 = rootView.findViewById(R.id.layout_keybroad_9_btn);
        btn_0 = rootView.findViewById(R.id.layout_keybroad_0_btn);
        btn_change = rootView.findViewById(R.id.layout_keybroad_state_btn);
        btn_delete = rootView.findViewById(R.id.layout_keybroad_delete_btn);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_change.setOnClickListener(this);
        btn_delete.setOnClickListener(this);

        //
//        String content = "数/英";
//        SpannableString spannableString = new SpannableString(content);
        //设置大小
//        RelativeSizeSpan sizeSpan01 = new RelativeSizeSpan(1f);
//        RelativeSizeSpan sizeSpan02 = new RelativeSizeSpan(0.7f);
//        spannableString.setSpan(sizeSpan01, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan02, 1, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        btn_change.setText(spannableString);
        //设置下标
//        SubscriptSpan subscriptSpan = new SubscriptSpan();
//        spannableString.setSpan(subscriptSpan, 1, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        btn_change.setText(spannableString);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layout_keybroad_1_btn:
                setOnClick(BTN_ONE);
                break;
            case R.id.layout_keybroad_2_btn:
                setOnClick(BTN_TWO);
                break;
            case R.id.layout_keybroad_3_btn:
                setOnClick(BTN_THREE);
                break;
            case R.id.layout_keybroad_4_btn:
                setOnClick(BTN_FOUR);
                break;
            case R.id.layout_keybroad_5_btn:
                setOnClick(BTN_FIVE);
                break;
            case R.id.layout_keybroad_6_btn:
                setOnClick(BTN_SIX);
                break;
            case R.id.layout_keybroad_7_btn:
                setOnClick(BTN_SEVEN);
                break;
            case R.id.layout_keybroad_8_btn:
                setOnClick(BTN_EIGHT);
                break;
            case R.id.layout_keybroad_9_btn:
                setOnClick(BTN_NINE);
                break;
            case R.id.layout_keybroad_0_btn:
                setOnClick(BTN_ZERO);
                break;
            case R.id.layout_keybroad_state_btn:
                //切换数字英文
//                ((ItemKeyBroadChange) v).onChildClick();
                setOnClick(BTN_CHANGE);
                break;
            case R.id.layout_keybroad_delete_btn:
                setOnClick(BTN_DELETE);
                break;
                default:
                    break;
        }
    }

    private void setOnClick(String content){
        if(onClickListener != null){
            onClickListener.onClick(content);
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener{
        void onClick(String content);
    }
}
