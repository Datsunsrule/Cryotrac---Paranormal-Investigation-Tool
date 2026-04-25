package com.cryotrac.paranormal;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Allow audio to autoplay without requiring a user gesture
        getBridge().getWebView().getSettings().setMediaPlaybackRequiresUserGesture(false);
    }
}
