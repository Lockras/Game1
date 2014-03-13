package com.example.game1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GraphicsView myView=new GraphicsView(this);
        setContentView(myView);
    }
    
    public class GraphicsView extends View
    {
    	public GraphicsView(Context context){
    		super(context);
    	}
    	float touchX = 0;
    	float touchY = 0;
    	@Override
    	protected void onDraw(Canvas canvas)
    	{
    		Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
    		canvas.drawBitmap(myBitmap, touchX, touchY, null);
    	}
    	
    	public boolean onTouchEvent(MotionEvent event)
    	{
    	if(event.getAction() == MotionEvent.ACTION_DOWN) { 
    		touchX = event.getX();
    		touchY = event.getY();
    		invalidate(); 
    	}
    	return true;
    	}
    }
}
