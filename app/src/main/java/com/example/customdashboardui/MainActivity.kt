package com.example.customdashboardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customdashboardui.ui.components.weatherPart
import com.example.customdashboardui.ui.theme.CustomDashboardUITheme
import com.example.customdashboardui.ui.theme.LocalExtendedColors
import com.example.customdashboardui.ui.theme.mainFontFamily

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
//                    0f to Color(110, 90, 133),
//                    0.5f to Color(32, 28, 37),
//                    1f to Color(15, 14, 18)
                    0f to Color(110, 90, 133),
                    1f to Color(32, 28, 37)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            LeftColumn(modifier
                .weight(1f)
                .fillMaxSize())

            Greeting( name = "Tijo",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()

            )

            Greeting( name = "Tijo",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()

            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!", style = TextStyle(Color.White, 40.sp, background = Color.Red), textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LeftColumn(modifier: Modifier) {
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row {
            Text(
                text = "2025.03.25 MON",
                style = TextStyle(Color.White, 20.sp),
                textAlign = TextAlign.Left
            )
            Spacer(Modifier.width(70.dp))
        }

        timeDisplay()

        Spacer(Modifier.height(20.dp))
        weatherPart(modifier)
    }

}

@Composable
private fun timeDisplay() {
    Row {
        Text(
            text = "09:30",
            style = TextStyle(Color.White, 80.sp, fontFamily = mainFontFamily),
            textAlign = TextAlign.Center
        )
        Column {
            Spacer(Modifier.height(40.dp))
            Text(
                text = " am",
                style = TextStyle(Color.White),
                textAlign = TextAlign.End
            )
        }
    }
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=240")
@Composable
fun GreetingPreview() {
    CustomDashboardUITheme {
        BackgroundAndContent()
    }
}
