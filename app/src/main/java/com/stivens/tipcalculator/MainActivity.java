package com.stivens.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.eBillAmount)
//    EditText eBillAmount;
//    @BindView(R.id.tvTipPercent)
//    TextView tvTipPercent;
//    @BindView(R.id.tvTipAmount)
//    TextView tvTipAmount;
//    @BindView(R.id.tvBillTotalAmount)
//    TextView tvBillTotalAmount;

//    float percentage = 0;
//    float tipTotal = 0;
//    float finalBillAMount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        setTipValues();

    }

//    private void setTipValues() {
//
//        tvTipPercent.setText( getString( R.string.main_msg_tippercent, percentage ) );
//        tvTipAmount.setText( getString( R.string.main_mas_tiptotal, tipTotal ) );
//        tvBillTotalAmount.setText(getString(R.string.main_msg_billtotalresult, finalBillAMount));
//    }

    @OnClick({R.id.ibRegularService, R.id.ibGoodService, R.id.ibExcellentService})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ibRegularService:
                break;
            case R.id.ibGoodService:
                break;
            case R.id.ibExcellentService:
                break;
        }
    }
}
