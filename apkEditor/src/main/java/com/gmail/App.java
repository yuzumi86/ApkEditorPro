package com.gmail;
import android.app.Application;
import cat.ereza.customactivityoncrash.config.CaocConfig;

public class App extends Application{
  @Override
  public void onCreate() {
    super.onCreate();
    // TODO: Implement this method
    CaocConfig.Builder.create()
    .logErrorOnRestart(true)
    .showErrorDetails(true)
    .showRestartButton(true)
    .apply();
    
  }
  
}
