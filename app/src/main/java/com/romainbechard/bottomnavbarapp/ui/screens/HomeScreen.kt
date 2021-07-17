package com.romainbechard.bottomnavbarapp.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.romainbechard.bottomnavbarapp.R
import com.romainbechard.bottomnavbarapp.ui.theme.MySecondTheme

sealed class Screen(val route: String, val title : String, @DrawableRes val icon : Int) {
    object Home : Screen(route = "home", title = "Home", icon= R.drawable.ic_home)
    object Countries : Screen( route = "search", title = "Search", icon= R.drawable.ic_map)
    object Forecast : Screen(route = "profile", title = "Profile", icon= R.drawable.ic_calendar)
}

@Composable
fun HomeScreen() {
    MySecondTheme {
        val navController = rememberNavController()
    }
}

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MySecondTheme {
        HomeScreen()
    }
}