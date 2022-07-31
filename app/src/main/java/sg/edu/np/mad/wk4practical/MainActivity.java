package sg.edu.np.mad.wk4practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PART 4 NOT ATTEMPTED
        
        // Create list for Users
        userList = new ArrayList<>();

        // Populate list with User objects
        for (int i = 0; i < 20; i++) {
            int id = randomInteger();
            int desc = randomInteger();
            User user = new User("Name " + id, "Description " + desc, false);
            userList.add(user);
        }

        // Recycler View
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        myAdapter mAdapter = new myAdapter(userList, this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }

    // Create random number generator to create User objects
    private int randomInteger() {
        Random ran = new Random();
        return ran.nextInt(999999);
    }
}