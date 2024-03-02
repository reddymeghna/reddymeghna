package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun medicinepage(modifier: Modifier=Modifier) {
    val fontFamily = FontFamily(
        Font(R.font.jost_semibold, FontWeight.SemiBold)
    )
    Box(
        modifier = modifier.fillMaxSize()


    ) {
        Image(
            painter = painterResource(id = R.drawable.docshome), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column {


        Box(modifier = Modifier.align(Alignment.CenterHorizontally))
        {
            Text(
                text = "PATIENT NAME \nAND DETAILS \nPATIENT ID",
                fontSize = 24.sp,
                color = Color.White,
                fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 30.dp,top = 30.dp)
            )
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.logo2), contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 35.dp, start = 50.dp),
//                contentScale = ContentScale.Fit

            )
            var box by remember {
                mutableStateOf("medicines...")
            }
            TextField(
                value = box, onValueChange = { text -> box = text },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(top = 150.dp),


                shape = RoundedCornerShape(30),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    color = Color.Gray,
                    fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,


                    )
            )
        }
        Box() {
            Text(
                text = "Add Medicine",
                fontSize = 24.sp,
                color = Color.Black,
                fontFamily = fontFamily, fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(30.dp, top = 50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.rect), contentDescription = null,
                modifier = Modifier
                    .padding(top = 90.dp, start = 35.dp)
                    .align(Alignment.Center)
            )

        }
        Box {


            Image(
                painter = painterResource(id = R.drawable.rect2), contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(top = 20.dp, start = 55.dp)
            )
            Text(text = "view medicine",
                modifier = Modifier
                    .clickable { }
                    .padding(start = 110.dp, top = 30.dp),
                fontSize = 24.sp,
//            fontFamily= FontFamily(),
                fontWeight = FontWeight.SemiBold,
                color = Color.White)

        }
    }
}
@Preview
@Composable
fun medicinepagePreview(){
  medicinepage()
}
