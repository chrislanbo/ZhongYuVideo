package com.example.administrator.day0121.download;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class VideoListView extends RelativeLayout{
	
	protected TextView videoView;
	
	protected ImageView imageView;
	
	private final int VIDEOIDVIEW_ID = 5000001;

	public VideoListView(Context context, String text, int resId) {
		super(context);
	
		videoView = new TextView(context);
		videoView.setText(text);
		videoView.setId(VIDEOIDVIEW_ID);
		videoView.setTextSize(16);
		videoView.setTextColor(Color.BLACK);
		videoView.setPadding(20, 10, 0, 0);
		videoView.setSingleLine();
		
		imageView = new ImageView(context);
		imageView.setImageResource(resId);
		imageView.setPadding(0, 10, 20, 0);
		
		LayoutParams videoLayoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		videoLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
		addView(videoView, videoLayoutParams);
		
		LayoutParams imageLayoutParams = new LayoutParams(ParamsUtil.dpToPx(context, 25), ParamsUtil.dpToPx(context, 25));
		imageLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		imageLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
		addView(imageView, imageLayoutParams);
		
		setMinimumHeight(ParamsUtil.dpToPx(context, 48));
		setPadding(10, 10, 10, 10);
	}
}
