package group13.groupnote;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AddGroupActivity extends Activity {

    EditText groupName;
    EditText textIn;
    Button buttonAdd;
    LinearLayout container;
    Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);
        groupName = (EditText)findViewById(R.id.group_name);
        textIn = (EditText)findViewById(R.id.member_id_in);
        buttonAdd = (Button)findViewById(R.id.button_member_add);
        container = (LinearLayout)findViewById(R.id.member_container);

        buttonAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.member_row, null);
                TextView textOut = (TextView)addView.findViewById(R.id.member_id_out);
                textOut.setText(textIn.getText().toString());
                Button buttonRemove = (Button)addView.findViewById(R.id.button_remove);
                buttonRemove.setOnClickListener(new OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        ((LinearLayout)addView.getParent()).removeView(addView);
                    }});

                container.addView(addView);
            }});

        buttonSave = (Button)findViewById(R.id.button_save_new_group);
        buttonSave.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:SAVE THE GROUP INTO DB
            }
        });
    }

}