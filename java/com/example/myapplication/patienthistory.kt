package com.example.myapplication



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun patienthistory() {

    val fontFamily = FontFamily(
        Font(R.font.jost_semibold, FontWeight.SemiBold)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF60AAA1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){

        Text(
            text = "Patient History",
            color = Color.White,
            fontSize = 24.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.offset(y = 80.dp)
                .padding(bottom = 20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.End)
        )
        Box (modifier = Modifier.offset(y = -70.dp)){
            Image(
                painter = painterResource(id = R.drawable.backimage),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.padding(bottom = 50.dp)
            )
        }
    }

}
@Preview
@Composable
fun patienthistoryPreview(){
    patienthistory()
}