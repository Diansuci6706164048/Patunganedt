package org.d3ifcool.patungan_edt;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class FragmentTimeline extends Fragment {

    private View view;

    public FragmentTimeline(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.timeline_fragment, container, false);
        view = inflater.inflate(R.layout.timeline_fragment, container, false);

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));
        posts.add(new Post("Samsung Gear V5", 1250000,"12 Maret 2018", R.drawable.brandonly));


        PostAdapter postAdapter = new PostAdapter(getActivity(), posts);
        ListView timelineListView = (ListView) view.findViewById(R.id.timeline_listview);
        timelineListView.setAdapter(postAdapter);

        return view;
    }
}
