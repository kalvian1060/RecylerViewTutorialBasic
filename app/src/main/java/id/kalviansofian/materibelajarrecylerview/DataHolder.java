package id.kalviansofian.materibelajarrecylerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 24/05/17.
 */

public class DataHolder extends RecyclerView.ViewHolder{

    TextView tvJudul;
    ImageView imgProfile;

    public DataHolder(View view) {
        super(view);
        tvJudul=(TextView)view.findViewById(R.id.tvJudul);
        imgProfile=(ImageView) view.findViewById(R.id.imgProfile);
    }
}
