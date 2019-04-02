package com.milosz.noteskotlin

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("Android_intent","Intense Intent")
        courses.set(course.courseID, course)

        course= CourseInfo(courseID = "android_async",title = "Android Async")
        courses.set(course.courseID,course)

        course= CourseInfo(courseID = "fava_language",title = "Java fundamentals")
        courses.set(course.courseID,course)
    }
}