package appewtc.masterung.ungrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    public static final String database_name = "Atc.db";
    private static final int databaee_version = 1;
    private static final String create_user_table = "create table userTABLE(" +
            "_id integer primary key, " +
            "User text, " +
            "Password text," +
            "Name text);";


    private static final String create_question_table = "create table questionTABLE(" +
            "_id integer primary key, " +
            "Question text, " +
            "Choice1 text, " +
            "Choice2 text, " +
            "Choice3 text, " +
            "Choice4 text," +
            "Answer text);";



    public MyOpenHelper(Context context) {
        super(context, database_name, null, databaee_version);

    }//Constructor


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_question_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}// Main Class
