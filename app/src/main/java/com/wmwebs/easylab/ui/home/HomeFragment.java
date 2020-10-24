package com.wmwebs.easylab.ui.home;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.wmwebs.easylab.R;
import com.wmwebs.easylab.ui.Biocare.biocareFragment;
import com.wmwebs.easylab.ui.advance.advance;
import com.wmwebs.easylab.ui.capital.capital;
import com.wmwebs.easylab.ui.chughtai.chughtai;
import com.wmwebs.easylab.ui.city.city;
import com.wmwebs.easylab.ui.excel.excellab;
import com.wmwebs.easylab.ui.ibnesena.ibnesena;
import com.wmwebs.easylab.ui.islamabad.islamabad;
import com.wmwebs.easylab.ui.nayyab.nayyab;
import com.wmwebs.easylab.ui.shifa.shifa;

public class HomeFragment extends Fragment {
    WebView webView;

    ImageView nayyab, islamabad, excel, biovcare, chughtaie, advance, city, ibnesena, shifa, capital;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        webView = root.findViewById(R.id.homewebview);
      // button
        nayyab = root.findViewById(R.id.nayab);
        islamabad = root.findViewById(R.id.islamabaddiagnostic);
        excel = root.findViewById(R.id.excel);
        biovcare = root.findViewById(R.id.biocare);
        chughtaie = root.findViewById(R.id.chugtaie);
        advance = root.findViewById(R.id.advance);
        city = root.findViewById(R.id.city);
        ibnesena = root.findViewById(R.id.ibnesena);
        shifa = root.findViewById(R.id.shifa);
        capital = root.findViewById(R.id.capital);


        loadwebview();

        nayyab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new nayyab());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        islamabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new islamabad());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        excel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new excellab());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        biovcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new biocareFragment());
                fr.addToBackStack(null);
                fr.commit();


            }
        });
        chughtaie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new chughtai());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new advance());
                fr.addToBackStack(null);
                fr.commit();


            }
        });
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new city());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        ibnesena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new ibnesena());
                fr.addToBackStack(null);
                fr.commit();


            }
        });
        shifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new shifa());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        capital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Toast.makeText(getContext(),"Page is loading",Toast.LENGTH_SHORT).show();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment, new capital());
                fr.addToBackStack(null);
                fr.commit();


            }
        });


        return root;
    }


    public void loadwebview() {
        // fruitewebview.clearCache(true);
        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//faster to load
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        // webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        // webView.getSettings().setAppCacheEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webView.loadUrl("https://easylab.pk/join-the-newsletter/");


        //  swipeRefreshLayout.setRefreshing(true);


        //back button implimetation
        webView.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
                    webView.goBack();
                    return true;
                }
                return false;
            }
        });
        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());
        webView.setWebViewClient(new WebViewClient() {

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                Toast.makeText(getContext(), "Failed loading app!, No Internet Connection found.", Toast.LENGTH_SHORT).show();
            }

            public void onPageFinished(WebView view, String url) {

                //Hide the SwipeReefreshLayout


            }

        });


    }

}