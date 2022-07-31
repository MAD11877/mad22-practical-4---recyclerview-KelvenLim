package sg.edu.np.mad.wk4practical;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    ArrayList<User> data;
    Context context;

    public myAdapter (ArrayList<User> input, Context context){
        data = input;
        this.context = context;
    }

    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context).inflate(R.layout.list, parent, false);
        return new myViewHolder(item);
    }

    public void onBindViewHolder(myViewHolder holder, int position) {
        User u = data.get(position);
        holder.name.setText(u.getName());
        holder.desc.setText(u.getDescription());
        holder.image.setImageResource(R.mipmap.ic_launcher_round);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Profile");
                builder.setMessage(u.getName());
                builder.setCancelable(false);
                builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(context, profilePage.class);
                        intent.putExtra("name", u.getName());
                        intent.putExtra("desc", u.getDescription());
                        context.startActivity(intent);
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create();
                builder.show();
            }
        });
    }

    public int getItemCount() {
        return data.size();
    }
}
