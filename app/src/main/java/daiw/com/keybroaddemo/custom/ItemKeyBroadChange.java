package daiw.com.keybroaddemo.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import daiw.com.keybroaddemo.R;

/****************************
 * 类描述：
 *
 * @author: daiw
 * @time: 2018/11/24  12:28 AM
 *
 *         ***************************
 */
public class ItemKeyBroadChange extends LinearLayout {

    private Context context;
    private View rootView;

    private KeyBroadChange keyBroadChange;

    private OnClickListener onClickListener;

    /**
     *是否是数字状态：true是false否
     */
    private boolean isNumber = true;

    public ItemKeyBroadChange(Context context) {
        super(context);
        this.context = context;
        initViews();
    }

    public ItemKeyBroadChange(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initViews();
    }

    public ItemKeyBroadChange(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initViews();
    }

    private void initViews() {
        rootView = LayoutInflater.from(context).inflate(R.layout.custom_item_keybroad_change,this);
        //初始化默认为数字键盘
        isNumber = true;
        //切换
        keyBroadChange = rootView.findViewById(R.id.custom_item_keybroad_change);
    }

//    @Override
//    public boolean onChildClick() {
//
//        return keyBroadChange.clickChangeState();
//    }

}
