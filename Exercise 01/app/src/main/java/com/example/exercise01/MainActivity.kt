package com.example.exercise01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercise01()
        }
    }
}

@Composable
fun Exercise01(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.background_01),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Surface(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Jetpack Compose tutorial",
                fontSize = 24.sp,
                modifier = Modifier.fillMaxWidth()
                    .padding(all = 16.dp)
            )
        }
        Surface(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                textAlign = TextAlign.Justify,
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
            )
        }
        Surface(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text (
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                textAlign = TextAlign.Justify,
                modifier = Modifier.fillMaxWidth()
                    .padding(all = 16.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Exercise01Preview() {
    Exercise01()
}