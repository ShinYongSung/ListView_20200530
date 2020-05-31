package my.kim.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.kim.listview_20200530.datas.Student

class viewStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student)

        val student = intent.getSerializableExtra("Student") as Student

    }
}
