package de.denschub.diaspora;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TimelineAdapter extends BaseAdapter {
	private Context context;
	private int rowResID;
	private List<StatusMessage> messagesList;
	
	public TimelineAdapter(Context context, int rowResID) {
		this.context = context;
		this.rowResID = rowResID;
		this.messagesList = getMessages();
	}
	
	public List<StatusMessage> getMessages() {
		// TODO: Insert magic function
	}
		
	@Override
	public int getCount() {
		return messagesList.size();
	}
	
	@Override
	public Object getItem(int position) {
		return messagesList.get(position);
	}
	
	@Override
	public long getItemId(int position) {
		return position;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO: Insert magic function
	}

}