package com.example.customdashboardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customdashboardui.ui.theme.CustomDashboardUITheme
import com.example.customdashboardui.ui.theme.LocalExtendedColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomDashboardUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    BackgroundAndContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BackgroundAndContent(
    modifier: Modifier = Modifier
) {
    val colors = LocalExtendedColors.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    0f to Color(110, 90, 133),
                    0.5f to Color(32, 28, 37),
                    1f to Color(15, 14, 18)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Greeting( name = "Tijo",
                modifier = Modifier
                    .weight(1f)
                    .height(96.dp)
                    .background(Color.Blue)
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(96.dp)
                    .background(Color.Blue)
            ) { }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(96.dp)
                    .background(Color.Blue)
            ) { }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Box(
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!", style = TextStyle(Color.White, 40.sp)
        )
    }
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=240")
@Composable
fun GreetingPreview() {
    CustomDashboardUITheme {
        BackgroundAndContent()
    }
}

//@Preview(showBackground = true)
//@Composable
//fun EquiRow() {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        repeat(4) {
//            Box(
//                modifier = Modifier
//                    .weight(1f)
//                    .height(96.dp)
//                    .background(Color.Blue)
//            ) {
//
//            }
//        }
//    }
//}