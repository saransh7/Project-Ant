package in.antaragni.ant.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import in.antaragni.ant.R;
import in.antaragni.ant.datamodels.Contact;
import in.antaragni.ant.fragments.ContactFragment;

public class ContactActivity extends AppCompatActivity {
  private Toolbar mtoolbar;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent intent=getIntent();
    String post=intent.getStringExtra("post");
    setContentView(R.layout.activity_contact);
    Fragment contact= ContactFragment.newInstance("Contacts",post);
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,contact).commit();
  }
}
