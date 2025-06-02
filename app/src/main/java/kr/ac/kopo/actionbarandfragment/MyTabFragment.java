package kr.ac.kopo.actionbarandfragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyTabFragment extends Fragment {

    String tabName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        tabName = data.getString("tabName");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout baseLayout = new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        baseLayout.setLayoutParams(params);

        if (tabName.equals("Spring"))
            baseLayout.setBackgroundColor(Color.rgb(206, 247, 110));

        if (tabName.equals("Summer"))
            baseLayout.setBackgroundColor(Color.rgb(85, 135, 237));

        if (tabName.equals("Fall"))
            baseLayout.setBackgroundColor(Color.rgb(150, 60, 7));

        return baseLayout;
    }
}