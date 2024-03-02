package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.zxing.qrcode.QRCodeReader
import com.google.zxing.qrcode.encoder.QRCode

@Composable
fun viewmedicine() {
    val fontFamily = FontFamily(
        Font(R.font.jost_semibold, FontWeight.SemiBold)
    )
    Box (modifier = Modifier){
        Image(
            painter = painterResource(id = R.drawable.viewmedicine),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
    Box(){
        Image(painter = painterResource(id = R.drawable.green1), contentDescription = null,
            modifier = Modifier
                .padding(start = 95.dp, top = 700.dp)
                .align(Alignment.BottomCenter))
        Text(text = "send",
            modifier = Modifier
                .clickable { println("Button Clicked!") }
                .align(Alignment.Center)
                .padding(start = 65.dp, top = 700.dp),
            fontSize = 18.sp,
//            fontFamily= FontFamily(),
            fontWeight = FontWeight.SemiBold,
            color = Color.White)
        Image(painter = painterResource(id = R.drawable.qrcode), contentDescription =null,
            modifier = Modifier
                .padding(start = 150.dp, top = 600.dp, bottom = 10.dp)
                .align(Alignment.BottomCenter)

             )
    }
}
@Preview
@Composable
fun viewmedicinePreview(){
    viewmedicine()
}