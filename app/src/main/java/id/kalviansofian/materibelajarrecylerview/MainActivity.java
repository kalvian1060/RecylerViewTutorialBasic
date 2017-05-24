package id.kalviansofian.materibelajarrecylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRvList;
    private ArrayList<Data> mData;
    private DataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. mencari id recylerview dan setul layout manager
        mRvList=(RecyclerView)findViewById(R.id.rvList);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.setHasFixedSize(true);

        //2. isi model POJO
        mData=new ArrayList<>();
        mData.add(new Data("Laskar Pelangi"));
        mData.add(new Data("Laskar Embun"));
        mData.add(new Data("Laskar Pejuang"));
        mData.add(new Data("Laskar Pendekar"));
        mData.add(new Data("Laskar Spammer"));


        //3. seting adapter dan set ke recylerview
        mAdapter=new DataAdapter(mData,getBaseContext());
        mRvList.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
