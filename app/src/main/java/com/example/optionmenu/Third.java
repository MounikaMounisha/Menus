package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Third extends AppCompatActivity {
    ImageButton pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        pop = findViewById(R.id.button);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popup = new PopupMenu(Third.this,pop);
                popup.getMenuInflater().inflate(
                        R.menu.popup_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(
                        new PopupMenu.OnMenuItemClickListener(){

                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                switch (item.getItemId()){
                                    case R.id.p1:
                                        Toast.makeText(Third.this, "selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                                        return true;
                                    case R.id.p2:
                                        Toast.makeText(Third.this, "selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                                        break;
                                }

                                return false;
                            }
                        });
                popup.show();
            }

        });
    }
}



