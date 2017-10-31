package com.codepath.example.customadapterdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list);
		populateUsersList();
	}

	private void populateUsersList() {
		ArrayList<User> arrayOfUsers = User.getUsers();
		CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
		ListView listView = (ListView) findViewById(R.id.lvUsers);
		listView.setAdapter(adapter);
	}
	
}
