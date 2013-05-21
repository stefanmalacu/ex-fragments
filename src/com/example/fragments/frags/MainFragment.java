package com.example.fragments.frags;


import com.example.fragments.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;







public class MainFragment extends Fragment implements OnClickListener{

	@Override
	
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view =inflater.inflate(R.layout.fragment_main, container, false);
		Button nextButton = (Button) view.findViewById(R.id.button_first);
		nextButton.setOnClickListener(this);
		return view;
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
