package vtca.npa.minh.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    TextView url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        url = (TextView) findViewById(R.id.url);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://m.genk.vn/tin-moi.chn");
        url.setText(webView.getUrl());
    }
}
