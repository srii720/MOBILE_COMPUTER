package com.example.widgetapp;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import com.example.exp7.R;

public class MainActivity extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        for (int appWidgetId : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widge_layout);
            views.setTextViewText(R.id.widget_text, "Widget is working!");

            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
