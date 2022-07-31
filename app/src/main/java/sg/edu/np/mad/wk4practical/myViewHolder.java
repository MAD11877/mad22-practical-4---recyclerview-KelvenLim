package sg.edu.np.mad.wk4practical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class myViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name, desc;

    public myViewHolder(View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        name = itemView.findViewById(R.id.name);
        desc = itemView.findViewById(R.id.desc);
    }
}