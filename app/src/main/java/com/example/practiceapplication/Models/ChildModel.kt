package com.example.practiceapplication.Models

class ChildModel(private val foodImage: Int, private val foodName: String) {
    fun getFoodImage(): Int {
        return foodImage
    }

    fun getFoodName(): String {
        return foodName
    }
}
