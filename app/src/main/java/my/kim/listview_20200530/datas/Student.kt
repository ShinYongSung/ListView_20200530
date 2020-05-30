package my.kim.listview_20200530.datas

class Student(inputName: String, iby:Int, gender:Boolean) {

    val name = "미입력" //이름이 기본적으로 String이 되도록
    val birthYear = 0  //생년은 기본으로 Int가 되게
    val isMale = gender // 성별을 booLean으로, true : 남성 false : 여성

    // 2020년 1988년생은 몇살?? 2020 - 1988 + 1 = 33

    fun getKoreanAge(year: Int) : Int{
        return year - this.birthYear + 1
    }
}