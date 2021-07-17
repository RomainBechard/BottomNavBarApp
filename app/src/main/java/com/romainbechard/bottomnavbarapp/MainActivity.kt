package com.romainbechard.bottomnavbarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.romainbechard.bottomnavbarapp.ui.screens.FirstScreen
import com.romainbechard.bottomnavbarapp.ui.theme.BottomNavBarAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navHostController= rememberNavController()
                    NavHost(navController = navHostController, startDestination = "first") {
                        composable("first") { FirstScreen()}
                    }
                }
            }
        }
    }
}

