package fauzi.hilmy.quizandroiddataprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etAlamat, etEmail, etTelpon;
    TextView lblInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText)findViewById(R.id.editText);
        etAlamat = (EditText)findViewById(R.id.editText3);
        etEmail = (EditText)findViewById(R.id.editText2);
        etTelpon = (EditText)findViewById(R.id.editText4);
        lblInput = (TextView)findViewById(R.id.textView);
    }

    public void doInput(View view) {
        String nama = etNama.getText().toString();
        String email = etAlamat.getText().toString();
        String alamat = etEmail.getText().toString();
        String telpon = etTelpon.getText().toString();

        lblInput.setText("Full Name = " + nama + ", Email = " + email + ", Address = " + alamat + ", Phone Num = " + telpon);
    }
}
