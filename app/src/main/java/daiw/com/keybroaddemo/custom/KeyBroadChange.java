package daiw.com.keybroaddemo.custom;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import daiw.com.keybroaddemo.R;

/****************************
 * 类描述：
 *
 * @author: daiw
 * @time: 2018/11/24  12:28 AM
 *
 *         ***************************
 */
public class KeyBroadChange extends ConstraintLayout {

    private Context context;
    private View rootView;

    private TextView mNumberTv;
    private TextView mEnglishTv;

    /**
     *是否是数字状态：true是false否
     */
    private boolean isNumber = true;

    public KeyBroadChange(Context context) {
        super(context);
        this.context = context;
        initViews();
    }

    public KeyBroadChange(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initViews();
    }

    public KeyBroadChange(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initViews();
    }

    private void initViews() {
        rootView = LayoutInflater.from(context).inflate(R.layout.item_keybraod_change,this);
        //初始化默认为数字键盘
        isNumber = true;
        //数字
        mNumberTv = rootView.findViewById(R.id.item_keybroad_change_number_tv);
        //英文
        mEnglishTv = rootView.findViewById(R.id.item_keybroad_change_english_tv);
    }
     /*
      * @Description : 点击切换
      * @Params :
      * @Author : daiw
      * @Date : 2018/11/24
      */
    public boolean clickChangeState(){
        if(isNumber){
            //切换成英文键盘
            //数字
            mNumberTv.setTextColor(ContextCompat.getColor(context,R.color.blue_light));
            //英文
            mEnglishTv.setTextColor(ContextCompat.getColor(context,R.color.blue));
        }else {
            //切换成中文键盘
            //数字
            mNumberTv.setTextColor(ContextCompat.getColor(context,R.color.blue));
            //英文
            mEnglishTv.setTextColor(ContextCompat.getColor(context,R.color.blue_light));
        }
        isNumber = !isNumber;
        return isNumber;
    }

}
