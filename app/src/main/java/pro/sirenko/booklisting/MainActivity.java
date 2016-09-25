package pro.sirenko.booklisting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText query = (EditText) findViewById(R.id.te_query);
        query.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE ||
                        ( // Enter button
                                i == EditorInfo.IME_NULL &&
                                keyEvent.getAction() == KeyEvent.ACTION_UP
                                && keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    String text = query.getText().toString().trim();
                    if (!text.isEmpty()) {

                        request(text);
                    }
                }
                return true;
            }
        });
    }

    private void request(String query) {
        Toast.makeText(getApplicationContext(), query, Toast.LENGTH_SHORT).show();
    }
}
