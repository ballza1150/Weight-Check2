package th.ac.krirk.ball.weightcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by admin on 2/2/2559.
 */
public class MyManage {

    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;



    public MyManage(Context context) {
        // Create & Connected
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        writeSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    } // Constructor
} // Main Class
