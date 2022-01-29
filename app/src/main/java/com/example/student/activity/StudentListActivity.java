package com.example.student.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;
import com.example.student.adapter.StudentAdapter;
import com.example.student.db.DBHelper;
import com.example.student.model.Student;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {
    DBHelper dbHelper;
    StudentAdapter studentAdapter;
    RecyclerView recyclerView;
    ArrayList<Student> students;
    TextView tvTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        tvTotal = findViewById(R.id.tvTotal);
        recyclerView = findViewById(R.id.recyclerView);

        dbHelper = new DBHelper(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        students = dbHelper.getAllStudents();
        tvTotal.setText(students.size());

        studentAdapter = new StudentAdapter(students, this);
        recyclerView.setAdapter(studentAdapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(llm);
    }
}