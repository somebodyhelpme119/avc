package com.teamsparta.workbox.domain.course.repository

import com.teamsparta.workbox.domain.course.model.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository: JpaRepository<Course, Long>{

}