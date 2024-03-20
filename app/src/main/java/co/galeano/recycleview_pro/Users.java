package co.galeano.recycleview_pro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;
public class Users extends AppCompatActivity {
    int Picture;
    String PersonName;
    String TextMessage;
    String TextTimeMessage;
    CircleImageView picture;
    TextView personName, textMessage, textTimeMessage;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        picture = findViewById(R.id.profilePicture);
        personName = findViewById(R.id.personName);
        textMessage = findViewById(R.id.textMessage);
        textTimeMessage = findViewById(R.id.textTimeMessage);

        Intent receive= this.getIntent();
        if(receive != null ){
            PersonName = receive.getStringExtra("name");
            TextMessage = receive.getStringExtra("TextMessage");
            TextTimeMessage = receive.getStringExtra("TextTimeMessage");
            Picture = receive.getIntExtra("imagen",R.drawable.img_person1);

            personName.setText(PersonName);
            textMessage.setText(TextMessage);
            textTimeMessage.setText(TextTimeMessage);
            picture.setImageResource(Picture);
        }
    }
}

