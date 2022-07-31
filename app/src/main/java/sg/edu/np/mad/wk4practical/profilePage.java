package sg.edu.np.mad.wk4practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class profilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        // Receive intent
        Intent i = getIntent();

        // Find TextViews
        TextView profileName = findViewById(R.id.profileName);
        TextView profileDesc = findViewById(R.id.profileDesc);

        // Set texts
        profileName.setText(i.getStringExtra("name"));
        profileDesc.setText(i.getStringExtra("desc"));
    }
}