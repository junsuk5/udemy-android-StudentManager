package suwonsmartapp.com.studentmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private StudentManager mStudentManager;

    private TextView mMessageText;
    private TextView mTotalStudentCount;

    private EditText mNameField;
    private EditText mIdField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStudentManager = new StudentManager();

        mMessageText = (TextView) findViewById(R.id.message_text);
        mTotalStudentCount = (TextView) findViewById(R.id.total_student_count);

        mNameField = (EditText) findViewById(R.id.name_field);
        mIdField = (EditText) findViewById(R.id.id_field);
    }

    public void printAllStudent(View view) {
        mMessageText.setText(mStudentManager.printAllStudent());
        mTotalStudentCount.setText("" + mStudentManager.getCount());
    }

    public void addStudent(View view) {
        Student student = new Student(mIdField.getText().toString(),
                mNameField.getText().toString());

        if (mStudentManager.addStudent(student)) {
            mMessageText.setText(student.getName() + "이 잘 등록되었습니다");
        }
        mTotalStudentCount.setText("" + mStudentManager.getCount());
    }

    public void deleteStudent(View view) {
        if (mStudentManager.removeStudent(mIdField.getText().toString())) {
            mMessageText.setText("삭제 되었습니다");
        }
        mTotalStudentCount.setText("" + mStudentManager.getCount());
    }

    public void findStudent(View view) {
        Student findStudent = mStudentManager.findStudent(mIdField.getText().toString());
        mMessageText.setText(findStudent.toString());
    }
}
