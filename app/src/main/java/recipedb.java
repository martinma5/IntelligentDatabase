import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yoshii on 8/16/14.
 */
public class recipedb extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "recipedb";

    public recipedb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String recipe_create = "CREATE TABLE recipe (" +
                "recipe_id INT NOT NULL," +
                "title VARCHAR(45) NOT NULL," +
                "numview VARCHAR(45) NULL," +
                "favorite TINYINT(1) NULL," +
                "PRIMARY KEY (`recipe_id`))";

        sqLiteDatabase.execSQL(recipe_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS books");

        this.onCreate(sqLiteDatabase);
    }
}
