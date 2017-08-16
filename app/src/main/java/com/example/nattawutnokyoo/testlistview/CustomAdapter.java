package com.example.nattawutnokyoo.testlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class CustomAdapter extends BaseAdapter {
    Context mContext;
    String[] strName;
    int[] resId;
    Button btn;
    EditText edt;
    TextView display;

    public CustomAdapter(Context context, String[] strName, int[] resId) {
        this.mContext= context;
        this.strName = strName;
        this.resId = resId;

    }

    public int getCount() {

        if(strName != null && strName.length != 0){
            return strName.length;
        }
        return 0;
    }

    public Object getItem(int position) {
        return strName[position];
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.item_user, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        textView.setText(strName[i]);

        final EditText edt = (EditText) view.findViewById(R.id.editText);
        final TextView display = (TextView) view.findViewById(R.id.textView);
        final Button btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getVisibility() == View.GONE)
                {
                    display.setVisibility(View.VISIBLE);
                    edt.setVisibility(View.GONE);
                    display.setText(edt.getText().toString());
                }
                else if (display.getVisibility() ==  View.VISIBLE){
                    edt.setVisibility(View.VISIBLE);
                    display.setVisibility(View.GONE);
                }


                //Toast.makeText(mContext.getApplicationContext(), "Pass", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(resId[i]);
        return view;

    }

}
