package suwonsmartapp.com.studentmanager

import java.util.ArrayList

/**
 * Created by junsuk on 16. 3. 27..
 */
class StudentManager {
    private val mStudentList: MutableList<Student>

    init {
        mStudentList = ArrayList<Student>()
        initDataSet()
    }

    fun addStudent(student: Student): Boolean {
        return mStudentList.add(student)
    }

    fun removeStudent(id: String): Boolean {
        var deleteStudent: Student? = null
        for (s in mStudentList) {
            if (s.id == id) {
                deleteStudent = s
                break
            }
        }
        return mStudentList.remove(deleteStudent)
    }

    fun findStudent(id: String): Student? {
        for (s in mStudentList) {
            if (s.id == id) {
                return s
            }
        }
        return null
    }

    fun printAllStudent(): String {
        var result = ""

        for (s in mStudentList) {
            result += s
            result += "-----------------------\n"
        }

        return result
    }

    private fun initDataSet() {
        mStudentList.add(Student("1", "홍길동"))
        mStudentList.add(Student("2", "이순신"))
        mStudentList.add(Student("3", "강감찬"))
    }

    val count: Int
        get() = mStudentList.size
}
