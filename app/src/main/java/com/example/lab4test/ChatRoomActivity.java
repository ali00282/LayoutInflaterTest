package com.example.lab4test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomActivity extends AppCompatActivity {

    ListView lv;
    List<Message> messageStorage = new ArrayList<>();
    Button sendBtn;
    Button receiveBtn;
    EditText ed;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        lv = (ListView)findViewById(R.id.textLV);
        sendBtn =(Button)findViewById(R.id.sendBtn);
        receiveBtn =(Button)findViewById(R.id.receiveBtn);
        ed = (EditText)findViewById(R.id.chatet);
       final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.chatLayout);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = ed.getText().toString();
                Message storedMessage = new Message(msg);


                messageStorage.add(storedMessage);

                    try {
//                ArrayAdapter<String> cd = new ArrayAdapter<String>(ChatRoomActivity.this,android.R.layout.simple_list_item_1,storedMessage);
                        ArrayAdapter<Message> ad = new ArrayAdapter(ChatRoomActivity.this, android.R.layout.simple_list_item_1, messageStorage);

                        LayoutInflater layoutInflater = getLayoutInflater();
                        View view=layoutInflater.inflate(R.layout.activity_send, relativeLayout,true);
                        ed.setText(" ");
                        lv.setAdapter(ad);


                    }catch (Exception e){
                        e.printStackTrace();
                    }

            }

        });


        receiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = ed.getText().toString();
                Message storedMessage = new Message(msg);


                messageStorage.add(storedMessage);

                try {
//                ArrayAdapter<String> cd = new ArrayAdapter<String>(ChatRoomActivity.this,android.R.layout.simple_list_item_1,storedMessage);
                    ArrayAdapter<Message> ad = new ArrayAdapter(ChatRoomActivity.this, android.R.layout.simple_list_item_1, messageStorage);

                    LayoutInflater layoutInflater = getLayoutInflater();
                    View view=layoutInflater.inflate(R.layout.activity_receive, relativeLayout,true);
                    lv.setAdapter(ad);
                    ed.setText(" ");

                }catch (Exception e){
                    e.printStackTrace();
                }

            }

        });




    }
}
