package com.example.echo.animals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by echo on 2018/3/22.
 */

public class win extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);

        Button bt_tryagin,bt_exit;

        bt_tryagin = (Button)win.this.findViewById(R.id.bt_win_tryagain);
        bt_exit = (Button)win.this.findViewById(R.id.bt_win_exit);

        bt_tryagin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(win.this,game.class);
                startActivity(intent);
                //finish();
                //System.exit(0);
            }
        });
        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(win.this,MainActivity.class);
                startActivity(intent);
                //finish();
                //System.exit(0);
            }
        });

    }

}
