package pj.gdcp.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 国富小哥 on 2017/3/11.
 * 另一个左边的flagment
 *
 */

public class AnotherLeftFlagment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.anotherleft_flagment,container,false);
        return view;
    }
}
