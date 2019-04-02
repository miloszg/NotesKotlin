package com.milosz.noteskotlin

class CourseInfo (val courseID: String,val title: String)

class NoteInfo (var course: CourseInfo, title: String)