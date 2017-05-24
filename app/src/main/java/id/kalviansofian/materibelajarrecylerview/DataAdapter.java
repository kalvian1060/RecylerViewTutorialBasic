package id.kalviansofian.materibelajarrecylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by root on 24/05/17.
 */

public class DataAdapter extends RecyclerView.Adapter<DataHolder> {

    ArrayList<Data> mData=new ArrayList<>();
    private Context mContext;
    DataHolder mHolder;

    public DataAdapter(ArrayList<Data> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.row_layout,parent,false);
        mHolder=new DataHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        Data data=mData.get(position);
        mHolder.tvJudul.setText(data.getJudul());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
