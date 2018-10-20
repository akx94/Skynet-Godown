package brainwired.com.godownmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GodownPermitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godown_permit);
    }
    public void PermitConfirm(View view) {






        Intent intent = new Intent(this, GodownUnitEntryActivity.class);
        startActivity(intent);
    }


}
