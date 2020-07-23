package sg.edu.rp.c346.id19002765.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;
    ImageView colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBoxList);
        colour = findViewById(R.id.imageViewBoxColour);
        alBoxList = new ArrayList<>();
        alBoxList.add(new Box("Blue"));
        alBoxList.add(new Box("Orange"));
        alBoxList.add(new Box("Brown"));

        caBox = new CustomAdapter(this,R.layout.row, alBoxList);
        lvBox.setAdapter(caBox);

    }
}
