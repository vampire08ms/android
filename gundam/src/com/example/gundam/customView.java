package com.example.gundam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class customView extends View {

	public customView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);
		paint.setAntiAlias(true);
		
		canvas.drawCircle(100, 100, 50, paint);
		
	}
	
}
