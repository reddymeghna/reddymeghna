package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun docsprofile(
) {
    val fontFamily = FontFamily(
        Font(R.font.jost_semibold, FontWeight.SemiBold)
    )
    Box(
        modifier = Modifier.fillMaxSize()


    ) {
        Image(
            painter = painterResource(id = R.drawable.docsprofile), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column {
        Text(
            text = "PROFILE",
            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(74.dp, 36.dp)


        )
        Box {
            Column {
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.logo1), contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(100.dp),
                    contentScale = ContentScale.Fit

                )
                Box {
                    androidx.compose.foundation.Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(RoundedCornerShape(size = 35.dp))
                            .padding(45.dp)
                    )
                    Text(
                        text = "DOC'S NAME",
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(65.dp)
                    )
                    Text(
                        text = "DOC'S UNIQUE ID",
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(65.dp)
                            .align(Alignment.CenterStart)
                    )
                    Text(
                        text = "SPECIALIZATION",
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(65.dp)
                            .align(Alignment.BottomStart)
                    )
                }
            }

        }
        Box( modifier=Modifier.align(Alignment.CenterHorizontally)) {


            Image(
                painter = painterResource(id = R.drawable.green1),
                contentDescription = null,
                modifier = Modifier
                    .clickable { println("Button Clicked!") }
                    .padding(bottom = 180.dp)

            )
            Text(text = "patient history",
                modifier = Modifier
                    .clickable { }
                    .padding(bottom = 180.dp)
                    .align(Alignment.Center),
                fontSize = 18.sp,
//            fontFamily= FontFamily(),
                fontWeight = FontWeight.SemiBold,
                color = Color.White)


        }
        Text(text = "sign out",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { println("Button Clicked!") }
                .padding(top = 40.dp),
            fontSize = 20.sp,
//            fontFamily= FontFamily(),
            fontWeight = FontWeight.SemiBold,
            color = Color.White

        )
    }
}
@Preview
@Composable
fun docsprofilePreview(){
    docsprofile()
}
