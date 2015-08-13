package barqsoft.footballscores;

import android.app.Application;
import android.content.Context;

public class FootballScoresApp extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
