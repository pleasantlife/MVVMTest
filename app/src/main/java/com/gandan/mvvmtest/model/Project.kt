package com.gandan.mvvmtest.model

import java.util.*

data class Project(
    var id: Long,
    var name: String,
    var full_name: String,
    var owner : User,
    var htmlUrl : String,
    var description: String,
    var url : String,
    var createdAt : Date,
    var updatedAt : Date,
    var pushedAt : Date,
    var gitUrl : String,
    var sshUrl : String,
    var cloneUrl : String,
    var svnUrl : String,
    var homepage : String,
    var starCount : Int,
    var watchCount : Int,
    var language : String) {

}