package suwonsmartapp.com.studentmanager

/**
 * Created by junsuk on 16. 3. 27..
 */
class Student(var id: String?, var name: String?) {

    override fun toString(): String {
        val sb = StringBuffer("")
        sb.append("학번: ").append(id).append('\n')
        sb.append("이름: ").append(name).append('\n')
        return sb.toString()
    }
}
