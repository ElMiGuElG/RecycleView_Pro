package co.galeano.recycleview_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainMenuActivity extends AppCompatActivity {

    ListView Users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        int[] profilePicture = {
                R.drawable.img_person1,
                R.drawable.img_person2,
                R.drawable.img_person3,
                R.drawable.img_person4,
                R.drawable.img_person5,
                R.drawable.img_person6,
        };
        String[] PersonName = {};

        String[] TextMessage = {};

        String[] TextTimeMessage = {};

        ListAdapter users = new ListAdapter(MainMenuActivity.this, PersonName, TextMessage,TextTimeMessage, profilePicture);
        Users = (ListView) findViewById(R.id.listViewPeople);
        Users.setAdapter(users);

    }
}