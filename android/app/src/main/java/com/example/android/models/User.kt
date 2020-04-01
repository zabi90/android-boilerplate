package com.example.android.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") var id: String,
    @SerializedName("user_name") var userName: String,
    @SerializedName("full_name") var fullName: String,
    @SerializedName("age") var age: String,
    @SerializedName("feed_image") var feedImage: String,
    @SerializedName("image") var image: String,
    @SerializedName("info") var info: String
)