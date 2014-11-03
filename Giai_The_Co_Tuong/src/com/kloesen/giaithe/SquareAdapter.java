package com.kloesen.giaithe;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class SquareAdapter extends BaseAdapter {

	private Context context;
	
	public SquareAdapter(Activity act) {
		context = act.getApplicationContext();
	}	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}*/
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View squareContainerView = convertView;
        
		  if ( convertView == null ) {
		    //Inflate the layout
		    final LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
		    squareContainerView =  layoutInflater.inflate(R.id.square, null);

		    if (position % 2 == 0) { //mock test
		        // Add The piece
		        final ImageView pieceView = (ImageView) squareContainerView.findViewById(R.id.piece);
		        pieceView.setImageResource(R.drawable.b_soldier);
		        
		        squareContainerView.setTag(position);
		    }
		  }
		  return squareContainerView;
	}

	
	
}
