package co.galeano.recycleview_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainMenuActivity extends AppCompatActivity {

    ListView Users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        int [] profilePicture = {
                R.drawable.img_person1,
                R.drawable.img_person2,
                R.drawable.img_person3,
                R.drawable.img_person4,
                R.drawable.img_person5,
                R.drawable.img_person6,
        };
        String[] PersonName = {
                getString(R.string.person1),
                getString(R.string.person2),
                getString(R.string.person3),
                getString(R.string.person4),
                getString(R.string.person5),
                getString(R.string.person6)
        };

        String[] TextMessage = {
                getString(R.string.message1),
                getString(R.string.message2),
                getString(R.string.message3),
                getString(R.string.message4),
                getString(R.string.message5),
                getString(R.string.message6)
        };

        String[] TextTimeMessage = {
                getString(R.string.time1),
                getString(R.string.time2),
                getString(R.string.time3),
                getString(R.string.time4),
                getString(R.string.time5),
                getString(R.string.time6)
        };

        ListAdapter users = new ListAdapter(MainMenuActivity.this, PersonName, TextMessage,TextTimeMessage, profilePicture);
        Users = (ListView) findViewById(R.id.listViewPeople);
        Users.setAdapter(users);

        Users.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> list, View vista, int position, long id){
                Intent sendInformation = new Intent(MainMenuActivity.this,MoreInformationActivity.class)
                        .putExtra("name",PersonName[position])
                        .putExtra("picture",profilePicture[position])
                        .putExtra("text",TextMessage[position]);

                        //.putExtra("telefono",telefonos[posicion])
                        //.putExtra("imagen",fotoPerfil[posicion]);

                startActivity(sendInformation);
            }

        });
    }
}