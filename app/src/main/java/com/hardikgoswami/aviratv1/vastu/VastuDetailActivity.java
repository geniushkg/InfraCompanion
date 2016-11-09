package com.hardikgoswami.aviratv1.vastu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.hardikgoswami.aviratv1.R;

public class VastuDetailActivity extends AppCompatActivity {

    TextView textViewVastu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vastu_detail_vastu);
        textViewVastu = (TextView) findViewById(R.id.tv_vastu_detail);
        textViewVastu.setText(Html.fromHtml(getString(R.string.vastu_detail)));
    }
}
