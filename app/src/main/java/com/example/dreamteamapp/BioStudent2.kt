package com.example.dreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.dreamteamapp.data.UserProfile
import com.example.dreamteamapp.ui.theme.DreamteamappTheme

class StudentTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamteamappTheme {
                UserProfile(
                    id = 2,
                    name = "Joshua B. Layog",
                    role = "UI/UX Designer",
                    bio = "My name is Joshua B. Layog. I'm 22 years old and I want to be a ui/ux developer that can help and have fun learning.",
                    imageRes = R.drawable.ic_launcher_background
                )
            }
        }
    }
}