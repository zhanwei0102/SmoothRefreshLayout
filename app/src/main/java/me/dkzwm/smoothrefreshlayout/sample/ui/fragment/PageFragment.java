package me.dkzwm.smoothrefreshlayout.sample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.dkzwm.smoothrefreshlayout.sample.R;

/**
 * Created by dkzwm on 2017/6/2.
 *
 * @author dkzwm
 */

public class PageFragment extends Fragment {
    private int mPage;
    private int mColor;

    public static PageFragment newInstance(int page, int color) {
        PageFragment fragment = new PageFragment();
        fragment.mPage = page;
        fragment.mColor = color;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView_page_fragment);
        textView.setBackgroundColor(mColor);
        textView.setText("第" + mPage + "页");
        return view;
    }
}
