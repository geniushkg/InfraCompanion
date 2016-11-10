package com.hardikgoswami.aviratv1.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.hardikgoswami.aviratv1.R;
import com.hardikgoswami.aviratv1.about.AboutActivity;
import com.hardikgoswami.aviratv1.about.AboutFragment;
import com.hardikgoswami.aviratv1.brochure.BrochureFragment;
import com.hardikgoswami.aviratv1.faq.FaqFragment;
import com.hardikgoswami.aviratv1.info.InfoFragment;
import com.hardikgoswami.aviratv1.project.ProjectFragment;
import com.hardikgoswami.aviratv1.vastu.VastuFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // floating action bar
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Contact - info@aviratgroup.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.setVisibility(View.GONE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // default fragment

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.content_main, new HomeFragment());
        tx.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = new Fragment();
        int id = item.getItemId();
        //Toast.makeText(this, "item is : " + id, Toast.LENGTH_SHORT).show();
        switch (id) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_about:
                fragment = new AboutFragment();
                break;
            case R.id.nav_project:
                fragment = new ProjectFragment();
                break;
            case R.id.nav_brochure:
                fragment = new BrochureFragment();
                break;
            case R.id.nav_testimonial:
                break;
            case R.id.nav_vastu:
                fragment =  new VastuFragment();
                break;
            case R.id.nav_faq:
                fragment = new FaqFragment();
                break;
            case R.id.nav_info:
                fragment = new InfoFragment();
                break;
            default:
                break;


        }
        if (fragment != null) {
            FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
            tx.replace(R.id.content_main, fragment);
            tx.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClickCalled(String anyValue,String arg) {
        // Call another acitivty here and pass some arguments to it.
        switch (arg){
            case "vastu":

                break;
            default:
                break;
        }
    }

    public void onNavigateAboutDetail(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

}
