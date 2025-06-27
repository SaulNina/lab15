package com.example.lab15

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import com.example.lab15.ui.theme.Lab15Theme

class WorkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab15Theme {
                Surface {
                    Text("¡Estás en la vista Work!") // Texto diferente
                }
            }
        }
    }
}