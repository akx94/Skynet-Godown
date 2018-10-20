package brainwired.com.godownmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SaleEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_entry);
    }

    public void AddSalesEntry(View view) {




        Toast toast = Toast.makeText(getApplicationContext(),
                "Entry Added",
                Toast.LENGTH_SHORT);

        toast.show();



        Intent intent = new Intent(this, SaleEntryActivity.class);
        startActivity(intent);

    }

    public void EndSalesEntry(View view) {



        Toast toast = Toast.makeText(getApplicationContext(),
                "Entry Completed",
                Toast.LENGTH_SHORT);

        toast.show();


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
