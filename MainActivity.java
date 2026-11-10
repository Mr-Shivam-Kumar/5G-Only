package com.example.fivegshortcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(48, 64, 48, 48);

        TextView info = new TextView(this);
        info.setText("5G Settings Shortcut\\n\\nTap below to open Android's Phone Information screen. If it opens, choose NR Only under Preferred Network Type.");
        info.setTextSize(18);
        layout.addView(info);

        Button open = new Button(this);
        open.setText("Open Phone Information");
        open.setOnClickListener(v -> openRadioInfo());
        layout.addView(open);
        setContentView(layout);
    }

    private void openRadioInfo() {
        Intent intent = new Intent();
        intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
        try {
            startActivity(intent);
        } catch (Exception first) {
            Intent fallback = new Intent("android.intent.action.MAIN");
            fallback.setClassName("com.android.phone", "com.android.phone.MobileNetworkSettings");
            try { startActivity(fallback); }
            catch (Exception second) {
                Toast.makeText(this, "OxygenOS blocked this hidden settings activity. This shortcut may not work on this build.", Toast.LENGTH_LONG).show();
            }
        }
    }
}
