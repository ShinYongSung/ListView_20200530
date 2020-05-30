package my.kim.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import my.kim.listview_20200530.adapter.StudentAdapter
import my.kim.listview_20200530.datas.Student

class MainActivity : AppCompatActivity() {

    val students = ArrayList<Student>()

    //onCreate  실행된 이후에 내용을 채워야함.
// 변수는 멤버변수로 만들어두면 차후에 편리함.
    // 만드는건 지금 만들지만, 채우는건 나중에 해주겠당~ =>Lateinit
    lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        students.add(Student("조경진", iby = 1988, gender = true))
        students.add(Student("김광철", iby = 1966, gender = true))
        students.add(Student("김재환", iby = 1993, gender = true))
        students.add(Student("박수정", iby = 1994, gender = false))
        students.add(Student("신용성", iby = 1988, gender = true))
        students.add(Student("엄곤지", iby = 1984, gender = false))
        students.add(Student("이승원", iby = 1978, gender = true))
        students.add(Student("이현호", iby = 1981, gender = true))

        studentAdapter = StudentAdapter(this, R.layout.student_list_item, students)

        studentListView.adapter = studentAdapter
    }
}
