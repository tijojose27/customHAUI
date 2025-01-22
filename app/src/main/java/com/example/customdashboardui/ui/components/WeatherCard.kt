package com.example.customdashboardui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customdashboardui.R
import com.example.customdashboardui.ui.theme.CustomDashboardUITheme
import com.example.customdashboardui.ui.theme.mainFontFamily


@Composable
fun weatherPart(modifier: Modifier) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(19, 18, 30),
            contentColor = Color.White
        ),
        modifier = Modifier
            .size(width = 380.dp, height = 200.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "TODAY",
                modifier = Modifier.padding(20.dp),
            )
            Row(
                modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    painterResource(R.drawable.sunny),
                    contentDescription = "Sunny",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(45.dp)
                        .padding(top = 8.dp)
                )
                Text(
                    text = "19\u2103",
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 45.sp, fontFamily = mainFontFamily)
                )
                Text(
                    text = "12 \u2103 / 35 \u2103",
                    modifier = Modifier
                        .padding(vertical = 20.dp, horizontal = 10.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 10.sp)
                )
            }

            Text(
                text = "Its sunny today",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=240")
@Composable
fun GreetingPreview() {
    CustomDashboardUITheme {
        weatherPart(modifier = Modifier)
    }
}
