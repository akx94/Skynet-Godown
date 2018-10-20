package brainwired.com.godownmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NewEntryBtn(View view) {
        Intent intent = new Intent(this, GodownPermitActivity.class);
        startActivity(intent);
    }

    public void NewSaleBtn(View view) {
        Intent intent = new Intent(this, GodownSalesInvoiceActivity.class);
        startActivity(intent);
    }
    public void LogoutBtn(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


}
