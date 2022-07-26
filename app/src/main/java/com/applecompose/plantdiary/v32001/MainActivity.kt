package com.applecompose.plantdiary.v32001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applecompose.plantdiary.v32001.presentation.screens.HomeScreen
import com.applecompose.plantdiary.v32001.ui.theme.PlantDiaryTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			PlantDiaryTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					Greeting("Jetpack Compose")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Column() {
		Text(text = "Hello $name!")
		Spacer(modifier = Modifier.height(16.dp))
		HomeScreen()
	}

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	PlantDiaryTheme {
		Greeting("Android")
	}
}