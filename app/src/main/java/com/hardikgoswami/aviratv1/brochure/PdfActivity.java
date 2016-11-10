package com.hardikgoswami.aviratv1.brochure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hardikgoswami.aviratv1.R;
import com.joanzapata.pdfview.PDFView;

public class PdfActivity extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_act);
        pdfView = (PDFView) findViewById(R.id.pdfview);

        pdfView.fromAsset("sample.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
}
