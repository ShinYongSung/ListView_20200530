package my.kim.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.kim.listview_20200530.datas.Student

class MainActivity : AppCompatActivity() {

    val students = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        students.add(Student("조경진", iby = 1988, gender = true))
        students.add(Student("김광철", iby = 1966, gender = true))
        students.add(Student("조경진", iby = 1988, gender = true))
        students.add(Student("박수정", iby = 1994, gender = false))
        students.add(Student("신용성", iby = 1988, gender = true))
        students.add(Student("엄곤지", iby = 1984, gender = false))
        students.add(Student("이승원", iby = 1978, gender = true))
        students.add(Student("이현호", iby = 1981, gender = true))

    }
}
