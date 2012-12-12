package com.theultimatelabs.scale;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.webkit.WebView;
import android.widget.TextView;

public class AboutActivity extends Activity {

	final private String TAG = "AboutActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

		String about = "<h1><a href=\"http://theultimatelabs.com\">theUltimateLabs.com</a></h1>"
				+ "<h2>About</h2>"
				+ "This app is open source licenced under GPL."
				+ "<p><a href=\"http://theultimatelabs.com\">Homepage</a></p>"
				+ "<p><a href=\"http://theultimatelabs.com//p/donate.html\">Donate</a></p>"
				+ "<p><a href=\"https://play.google.com/store/apps/developer?id=theUltimateLabs\">Other Apps</a></p>"
				+ "<p><a href=\"https://github.com/theUltimateLabs\">Source</a></p>"
				+ "<p><a href=\"market://details?id=\">Rate This App</a></p>"
				+ "<p><a href=\"http://theultimatelabsstore.blogspot.com/p/store.html\">Buy A Scale</a></p>"
				+ "<p><a href=\"http://theultimatelabsstore.blogspot.com/p/store.html\">Video Demostration</a></p>"
				+ "<h2>Usage</h2>"
				+ "<ul> <li> Connect the scale to the device using an OTG USB adapter. The app should start automatically.</li>"
				+ "<li>Touch the weight text to tare (zero) the scale.</li>"
				+ "<li>Long touch the weight text to clear/reset the tare (zero). </li>"
				+ "<li>Touch the unit text to change the units using voice recognition.  </li>"
				+ "<li>Available weights:"
				+ "<ul><li>ounces</li><li>pounds</li><li>grams</li><kilograms</li><li>quarters</li><li>dimes</li><li>pennies</li><li>nickles</li></ul></li>"
				+ "<li>Available volumes:"
				+ "<ul><li>teaspoons</li><li>tablespoons</li><li>quarts</li><li>fluid ounces</li><li>milliliters</li><li>liters</li><li>gallons</li><li>pints</li></ul></li>"
				+ "<li>Available volume types:"
				+ "<ul><li>flour</li><li>sugar</li><li>rice</li><li>butter</li><li>milk</li><li>water</li><li>oil</li><li>powder sugar</li></ul></li>"
				+ "</ul>"
				+ "<h2>Support</h2>"
				+ "Please comment on the blog or email <a href=\"mailto:rob@theultimatelabs.com\">rob@theultimatelabs.com</a>. Reviews on on Google Play may go unnoticed.";
				
		
		WebView webView = (WebView) findViewById(R.id.webView1);
		webView.loadData(about,  "text/html", null);

		/*TextView aboutText = (TextView) findViewById(R.id.about_text);
		aboutText.setMovementMethod(LinkMovementMethod.getInstance());
		aboutText
				.setText(
						Html.fromHtml(about),
						TextView.BufferType.SPANNABLE);*/
	}

}
