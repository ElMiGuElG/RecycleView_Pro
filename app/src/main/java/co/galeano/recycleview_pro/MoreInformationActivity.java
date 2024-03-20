package co.galeano.recycleview_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class MoreInformationActivity extends AppCompatActivity {

    private TextView  personName;
    private TextView TextMessage;
    private CircleImageView profilePicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);

        personName = (TextView) findViewById(R.id.personName);
        profilePicture = (CircleImageView) findViewById(R.id.profilePicture);
        TextMessage = (TextView) findViewById(R.id.TextMessage);

        Intent intent = this.getIntent();
        if (intent != null){
            String Name = intent.getStringExtra("name");
            String Text = intent.getStringExtra("text");
            int picture = intent.getIntExtra("picture",R.drawable.img_person1);

            personName.setText(Name);
            TextMessage.setText(Text);
            profilePicture.setImageResource(picture);

        }
    }
}