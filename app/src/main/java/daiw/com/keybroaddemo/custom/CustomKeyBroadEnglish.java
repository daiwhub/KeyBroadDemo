package daiw.com.keybroaddemo.custom;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import daiw.com.keybroaddemo.R;

import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_123;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_A;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_B;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_C;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_D;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_DELETE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_E;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_EIGHT;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_F;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_FIVE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_FOUR;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_G;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_H;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_I;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_J;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_K;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_L;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_M;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_N;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_NINE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_O;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_ONE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_P;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_Q;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_R;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_S;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_SEVEN;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_SIX;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_T;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_THREE;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_TWO;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_U;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_UP;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_V;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_W;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_X;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_Y;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_Z;
import static daiw.com.keybroaddemo.custom.ConstantsKeyBroad.BTN_ZERO;

/****************************
 * 类描述：自定义英文键盘
 *
 * @author: daiw
 * @time: 2018/11/24  12:56 AM
 *
 *         ***************************
 */
public class CustomKeyBroadEnglish extends ConstraintLayout implements View.OnClickListener {

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

    private Button btn_q;
    private Button btn_w;
    private Button btn_e;
    private Button btn_r;
    private Button btn_t;
    private Button btn_y;
    private Button btn_u;
    private Button btn_i;
    private Button btn_o;
    private Button btn_p;

    private Button btn_a;
    private Button btn_s;
    private Button btn_d;
    private Button btn_f;
    private Button btn_g;
    private Button btn_h;
    private Button btn_j;
    private Button btn_k;
    private Button btn_l;
    private LinearLayout btn_up;

    private Button btn_123;
    private Button btn_z;
    private Button btn_x;
    private Button btn_c;
    private Button btn_v;
    private Button btn_b;
    private Button btn_n;
    private Button btn_m;
    private LinearLayout btn_delete;

    /**
     * 大小写标识:true小写flase大写
     */
    private boolean bigOrSmall = true;
    /**
     * 所有英文按钮
     */
    private ArrayList<View> btnList = new ArrayList<>();

    private OnClickListener onClickListener;

    public CustomKeyBroadEnglish(Context context) {
        super(context);
        this.context = context;
        initViews();
    }

    public CustomKeyBroadEnglish(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initViews();
    }

    public CustomKeyBroadEnglish(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initViews();
    }

    private void initViews() {
        rootView = LayoutInflater.from(context).inflate(R.layout.layout_keybroad_english, this);
        btn_1 = rootView.findViewById(R.id.layout_keybroad_english_1_btn);
        btn_2 = rootView.findViewById(R.id.layout_keybroad_english_2_btn);
        btn_3 = rootView.findViewById(R.id.layout_keybroad_english_3_btn);
        btn_4 = rootView.findViewById(R.id.layout_keybroad_english_4_btn);
        btn_5 = rootView.findViewById(R.id.layout_keybroad_english_5_btn);
        btn_6 = rootView.findViewById(R.id.layout_keybroad_english_6_btn);
        btn_7 = rootView.findViewById(R.id.layout_keybroad_english_7_btn);
        btn_8 = rootView.findViewById(R.id.layout_keybroad_english_8_btn);
        btn_9 = rootView.findViewById(R.id.layout_keybroad_english_9_btn);
        btn_0 = rootView.findViewById(R.id.layout_keybroad_english_0_btn);

        btn_q = rootView.findViewById(R.id.layout_keybroad_english_q_btn);
        btn_w = rootView.findViewById(R.id.layout_keybroad_english_w_btn);
        btn_e = rootView.findViewById(R.id.layout_keybroad_english_e_btn);
        btn_r = rootView.findViewById(R.id.layout_keybroad_english_r_btn);
        btn_t = rootView.findViewById(R.id.layout_keybroad_english_t_btn);
        btn_y = rootView.findViewById(R.id.layout_keybroad_english_y_btn);
        btn_u = rootView.findViewById(R.id.layout_keybroad_english_u_btn);
        btn_i = rootView.findViewById(R.id.layout_keybroad_english_i_btn);
        btn_o = rootView.findViewById(R.id.layout_keybroad_english_o_btn);
        btn_p = rootView.findViewById(R.id.layout_keybroad_english_p_btn);

        btn_a = rootView.findViewById(R.id.layout_keybroad_english_a_btn);
        btn_s = rootView.findViewById(R.id.layout_keybroad_english_s_btn);
        btn_d = rootView.findViewById(R.id.layout_keybroad_english_d_btn);
        btn_f = rootView.findViewById(R.id.layout_keybroad_english_f_btn);
        btn_g = rootView.findViewById(R.id.layout_keybroad_english_g_btn);
        btn_h = rootView.findViewById(R.id.layout_keybroad_english_h_btn);
        btn_j = rootView.findViewById(R.id.layout_keybroad_english_j_btn);
        btn_k = rootView.findViewById(R.id.layout_keybroad_english_k_btn);
        btn_l = rootView.findViewById(R.id.layout_keybroad_english_l_btn);
        btn_up = rootView.findViewById(R.id.layout_keybroad_english_up_btn);

        btn_123 = rootView.findViewById(R.id.layout_keybroad_english_change_btn);
        btn_z = rootView.findViewById(R.id.layout_keybroad_english_z_btn);
        btn_x = rootView.findViewById(R.id.layout_keybroad_english_x_btn);
        btn_c = rootView.findViewById(R.id.layout_keybroad_english_c_btn);
        btn_v = rootView.findViewById(R.id.layout_keybroad_english_v_btn);
        btn_b = rootView.findViewById(R.id.layout_keybroad_english_b_btn);
        btn_n = rootView.findViewById(R.id.layout_keybroad_english_n_btn);
        btn_m = rootView.findViewById(R.id.layout_keybroad_english_m_btn);
        btn_delete = rootView.findViewById(R.id.layout_keybroad_english_delete_btn);

        //默认为小写
        bigOrSmall = true;
        //添加集合，以便后面大小写切换
        if (!btnList.isEmpty()) {
            btnList.clear();
        }
        btnList.add(btn_a);
        btnList.add(btn_b);
        btnList.add(btn_c);
        btnList.add(btn_d);
        btnList.add(btn_e);
        btnList.add(btn_f);
        btnList.add(btn_g);
        btnList.add(btn_h);
        btnList.add(btn_i);
        btnList.add(btn_j);
        btnList.add(btn_k);
        btnList.add(btn_l);
        btnList.add(btn_m);
        btnList.add(btn_n);
        btnList.add(btn_o);
        btnList.add(btn_p);
        btnList.add(btn_q);
        btnList.add(btn_r);
        btnList.add(btn_s);
        btnList.add(btn_t);
        btnList.add(btn_u);
        btnList.add(btn_v);
        btnList.add(btn_w);
        btnList.add(btn_x);
        btnList.add(btn_y);
        btnList.add(btn_z);

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

        btn_q.setOnClickListener(this);
        btn_w.setOnClickListener(this);
        btn_e.setOnClickListener(this);
        btn_r.setOnClickListener(this);
        btn_t.setOnClickListener(this);
        btn_y.setOnClickListener(this);
        btn_u.setOnClickListener(this);
        btn_i.setOnClickListener(this);
        btn_o.setOnClickListener(this);
        btn_p.setOnClickListener(this);

        btn_a.setOnClickListener(this);
        btn_s.setOnClickListener(this);
        btn_d.setOnClickListener(this);
        btn_f.setOnClickListener(this);
        btn_g.setOnClickListener(this);
        btn_h.setOnClickListener(this);
        btn_j.setOnClickListener(this);
        btn_k.setOnClickListener(this);
        btn_l.setOnClickListener(this);
        btn_up.setOnClickListener(this);

        btn_123.setOnClickListener(this);
        btn_z.setOnClickListener(this);
        btn_x.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_v.setOnClickListener(this);
        btn_b.setOnClickListener(this);
        btn_n.setOnClickListener(this);
        btn_m.setOnClickListener(this);
        btn_delete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_keybroad_english_1_btn:
                setOnClick(BTN_ONE);
                break;
            case R.id.layout_keybroad_english_2_btn:
                setOnClick(BTN_TWO);
                break;
            case R.id.layout_keybroad_english_3_btn:
                setOnClick(BTN_THREE);
                break;
            case R.id.layout_keybroad_english_4_btn:
                setOnClick(BTN_FOUR);
                break;
            case R.id.layout_keybroad_english_5_btn:
                setOnClick(BTN_FIVE);
                break;
            case R.id.layout_keybroad_english_6_btn:
                setOnClick(BTN_SIX);
                break;
            case R.id.layout_keybroad_english_7_btn:
                setOnClick(BTN_SEVEN);
                break;
            case R.id.layout_keybroad_english_8_btn:
                setOnClick(BTN_EIGHT);
                break;
            case R.id.layout_keybroad_english_9_btn:
                setOnClick(BTN_NINE);
                break;
            case R.id.layout_keybroad_english_0_btn:
                setOnClick(BTN_ZERO);
                break;
            //
            case R.id.layout_keybroad_english_q_btn:
                setOnClick(BTN_Q);
                break;
            case R.id.layout_keybroad_english_w_btn:
                setOnClick(BTN_W);
                break;
            case R.id.layout_keybroad_english_e_btn:
                setOnClick(BTN_E);
                break;
            case R.id.layout_keybroad_english_r_btn:
                setOnClick(BTN_R);
                break;
            case R.id.layout_keybroad_english_t_btn:
                setOnClick(BTN_T);
                break;
            case R.id.layout_keybroad_english_y_btn:
                setOnClick(BTN_Y);
                break;
            case R.id.layout_keybroad_english_u_btn:
                setOnClick(BTN_U);
                break;
            case R.id.layout_keybroad_english_i_btn:
                setOnClick(BTN_I);
                break;
            case R.id.layout_keybroad_english_o_btn:
                setOnClick(BTN_O);
                break;
            case R.id.layout_keybroad_english_p_btn:
                setOnClick(BTN_P);
                break;
            //
            case R.id.layout_keybroad_english_a_btn:
                setOnClick(BTN_A);
                break;
            case R.id.layout_keybroad_english_s_btn:
                setOnClick(BTN_S);
                break;
            case R.id.layout_keybroad_english_d_btn:
                setOnClick(BTN_D);
                break;
            case R.id.layout_keybroad_english_f_btn:
                setOnClick(BTN_F);
                break;
            case R.id.layout_keybroad_english_g_btn:
                setOnClick(BTN_G);
                break;
            case R.id.layout_keybroad_english_h_btn:
                setOnClick(BTN_H);
                break;
            case R.id.layout_keybroad_english_j_btn:
                setOnClick(BTN_J);
                break;
            case R.id.layout_keybroad_english_k_btn:
                setOnClick(BTN_K);
                break;
            case R.id.layout_keybroad_english_l_btn:
                setOnClick(BTN_L);
                break;
            case R.id.layout_keybroad_english_up_btn:
                changeBigOrSmall();
                break;
            //
            case R.id.layout_keybroad_english_change_btn:
                //切换大小写
                setOnClick(BTN_123);
                break;
            case R.id.layout_keybroad_english_z_btn:
                setOnClick(BTN_Z);
                break;
            case R.id.layout_keybroad_english_x_btn:
                setOnClick(BTN_X);
                break;
            case R.id.layout_keybroad_english_c_btn:
                setOnClick(BTN_C);
                break;
            case R.id.layout_keybroad_english_v_btn:
                setOnClick(BTN_V);
                break;
            case R.id.layout_keybroad_english_b_btn:
                setOnClick(BTN_B);
                break;
            case R.id.layout_keybroad_english_n_btn:
                setOnClick(BTN_N);
                break;
            case R.id.layout_keybroad_english_m_btn:
                setOnClick(BTN_M);
                break;
            case R.id.layout_keybroad_english_delete_btn:
                setOnClick(BTN_DELETE);
                break;
            default:
                break;
        }
    }

    private void setOnClick(String content) {
        if (onClickListener != null) {
            if (bigOrSmall) {
                //小写
                onClickListener.onClick(content.toLowerCase());
            } else {
                //大写
                onClickListener.onClick(content.toUpperCase());
            }
        }
    }

    /*
     * @Description : 切换大小写
     * @Params :
     * @Author : daiw
     * @Date : 2018/11/24
     */
    private void changeBigOrSmall() {
        if (!btnList.isEmpty()) {
            for (View view : btnList) {
                String content = ((Button) view).getText().toString();
                if (!content.isEmpty()) {
                    if (bigOrSmall) {
                        //切换大写
                        ((Button) view).setText(content.toUpperCase());
                    } else {
                        //切换小写
                        ((Button) view).setText(content.toLowerCase());
                    }
                }
            }
        }

        bigOrSmall = !bigOrSmall;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(String content);
    }
}
