package com.example.androidmixedlistactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class ImageView extends View {
	
	private final Context context;
	public ImageView(Context context) {
		super(context);
		this.context = context;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
//		canvas.drawRGB(100, 100, 100);
		canvas.drawColor(Color.WHITE);
		Typeface font = Typeface.createFromAsset(context.getAssets(), "aladdin.ttf");
		Paint textFormat = new Paint();
		textFormat.setARGB(90, 0, 255, 0);
		textFormat.setTextAlign(Align.CENTER);
		textFormat.setTextSize(60);
		textFormat.setTypeface(font);
		canvas.drawText("HY4Academy", canvas.getWidth()/2, 50, textFormat);

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.green_nature);
		canvas.drawBitmap(bitmap, 0, 100, null);
		
		Rect middleRect = new Rect();
		middleRect.set(0, 600, canvas.getWidth(), 650);
		Paint ourBlue = new Paint();
		ourBlue.setColor(Color.DKGRAY);
		canvas.drawRect(middleRect, ourBlue);
		
		invalidate();

		
	}

	
	

}
