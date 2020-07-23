package sg.edu.rp.c346.id19002765.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;


    public CustomAdapter(Context context, int resource, ArrayList<Box> objects){
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);


        ImageView ivBox = rowView.findViewById(R.id.imageViewBoxColour);
        // Obtain the Android Version information based on the position
        Box currentItem = boxList.get(position);

        // Set values to the TextView to display the corresponding information

        if(currentItem.getColour()== "Blue"){
            ivBox.setImageResource(R.drawable.blue_box);

        }
        else if(currentItem.getColour()=="Orange"){
            ivBox.setImageResource(R.drawable.orange_box);

        }
        else{
            ivBox.setImageResource(R.drawable.brown_box);

        }

        return rowView;
    }

}
