package co.galeano.recycleview_pro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends BaseAdapter {
    Context Context;
    String[] PersonName, TextMessage, TextTimeMessage;
    int[] Picture;
    LayoutInflater Inflater;

    public ListAdapter(Context context, String[] personName, String[] textMessage, String[] textTimeMessage, int[] picture) {
        this.Context = context;
        this.PersonName = personName;
        this.TextMessage = textMessage;
        this.TextTimeMessage = textTimeMessage;
        this.Picture = picture;
        Inflater = LayoutInflater.from(Context);
    }

    @Override
    public int getCount() {
        return PersonName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = Inflater.inflate(R.layout.list_item, null);
        ImageView profilePicture = view.findViewById(R.id.profilePicture);
        TextView personName = view.findViewById(R.id.personName);
        TextView textMessage = view.findViewById(R.id.textMessage);
        TextView textTimeMessage = view.findViewById(R.id.textTimeMessage);

        profilePicture.setImageResource(Picture[i]);
        personName.setText(PersonName[i]);
        textMessage.setText(TextMessage[i]);
        textTimeMessage.setText(TextTimeMessage[i]);
        return view;
    }
}
