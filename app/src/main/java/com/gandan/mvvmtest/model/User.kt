package com.gandan.mvvmtest.model

data class User(
    var login : String,
    var id : Long,
    var avatarUrl : String,
    var githubAvatarUrl : String,
    var url : String,
    var htmlUrl : String,
    var followersUrl : String,
    var type : String,
    var name : String,
    var blog : String,
    var location : String) {
}