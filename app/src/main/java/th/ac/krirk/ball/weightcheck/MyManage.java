package th.ac.krirk.ball.weightcheck;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by admin on 2/2/2559.
 */
public class MyManage {

    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String table_user = "userTABLE";
    public static final String table_wegit = "wegitTABLE";
    public static final String column_id = "id";
    public static final String column_user = "User";
    public static final String column_password = "Password";
    public static final String column_name = "Name";
    public static final String column_date = "Date";
    public static final String column_weight = "Weight";



    public MyManage(Context context) {
        // Create & Connected
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        writeSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    } // Constructor

    //Add New Value to userTABLE
    public long addUsertable(String strUser, String strPassword, String strName) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_password, strPassword);
        objContentValues.put(column_name, strName);

        return writeSqLiteDatabase.insert(table_user, null,objContentValues); // นำเข้าฐานข้อมูล
    }

} // Main Class
