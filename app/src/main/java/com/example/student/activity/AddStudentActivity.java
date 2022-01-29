package com.example.student.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.student.R;
import com.example.student.db.DBHelper;
import com.example.student.model.Student;

public class AddStudentActivity extends AppCompatActivity {
    EditText edName, edCourse, edMobile, edTotal, edPaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        edName = findViewById(R.id.edName);
        edCourse = findViewById(R.id.edCourse);
        edMobile = findViewById(R.id.edMobile);
        edTotal = findViewById(R.id.edTotal);
        edPaid = findViewById(R.id.edPaid);

    }

    public void save(View view) {
        String name = edName.getText().toString().trim();
        String course = edCourse.getText().toString().trim();
        String mobile = edMobile.getText().toString().trim();
        String total = edTotal.getText().toString().trim();
        String paid = edPaid.getText().toString().trim();

        DBHelper dbHelper = new DBHelper(AddStudentActivity.this);

        Student s = new Student(name, course, mobile, Integer.parseInt(total),Integer.parseInt(paid));

        long result = dbHelper.addStudent(s);
        if (result == -1) {
            Toast.makeText(this, "Failed " + result, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Saved " + result, Toast.LENGTH_SHORT).show();
        }
    }

    public void showAll(View view) {
        startActivity(new Intent(AddStudentActivity.this, StudentListActivity.class));
    }
}