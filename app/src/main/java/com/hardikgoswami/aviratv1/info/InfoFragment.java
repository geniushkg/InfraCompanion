package com.hardikgoswami.aviratv1.info;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hardikgoswami.aviratv1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }

    private Button shareButton;
    private TextView contactDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.info_frag, container, false);
        shareButton = (Button) rootView.findViewById(R.id.btn_share_app);
        contactDetails = (TextView) rootView.findViewById(R.id.tv_info_contact);
        contactDetails.setText(Html.fromHtml(getString(R.string.contact_info_html)));
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                intent.putExtra(Intent.EXTRA_TEXT, "please visit www.aviratgroup.com");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
        return rootView;
    }

}
