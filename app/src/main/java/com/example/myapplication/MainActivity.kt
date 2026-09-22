package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyScreen()
        }
    }
}

@Composable
fun MyScreen() {
    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text("Xin chào Chinh!")
        Text("Đây là chương trình Kotlin đầu tiên.")
        Text("10 + 20 = ${10 + 20}")
    }
}