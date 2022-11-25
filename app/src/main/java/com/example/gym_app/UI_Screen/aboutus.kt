package com.example.gym_app.UI_Screen

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gym_app.R

@Composable
fun aboutUs(){
    Box() {
        Image(painter = painterResource(id = R.drawable.pexels_photo_841130) , contentDescription = "bg", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Box(modifier = Modifier
            .fillMaxSize()
            .alpha(0.3f)
            .padding(top = 172.dp, bottom = 35.dp, start = 8.dp, end = 12.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0, 0, 100))) {
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp),modifier=Modifier.fillMaxSize()) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Image(painter = painterResource(id = R.drawable.logo2), contentDescription ="Logo" ,modifier= Modifier
            .size(135.dp)
            .padding(top = 45.dp))
        
        Text(text = "BodyWizard", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace, fontSize = 28.sp, color = Color.White)}
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(top =10.dp)) {


            Divider(
                color=Color.Yellow.copy(alpha = 0.5f),
                thickness=4.dp,
                modifier=Modifier.padding(horizontal = 32.dp)

            )
            Text(text = "About Us",fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif, fontSize =36.sp, color = Color(255,240,140),modifier=Modifier.padding(horizontal = 32.dp))
            Divider(
                color=Color.Yellow.copy(alpha = 0.5f),
                thickness=4.dp,
                modifier=Modifier.padding(horizontal = 32.dp)

            )}
            Row(horizontalArrangement = Arrangement.spacedBy(0.dp)) {
                
            Text(text = "⚒", fontSize = 40.sp,modifier=Modifier.padding(start=10.dp), color = Color.White)
            Text(text = "BodyWizard is a Gym service provider ,It was started by some certified gym trainers it helps us to get courses from ease of our home.BodyWizard provides training from certified trainers",modifier=Modifier.padding(horizontal = 28.dp), color = Color.White, fontSize = 20.sp)
        }
            Row(horizontalArrangement = Arrangement.spacedBy(0.dp)) {

                Text(text = "⚒", fontSize = 40.sp,modifier=Modifier.padding(start=10.dp), color = Color.White)
                Text(text = "BodyWizard is a Gym service provider ,It was started by some certified gym trainers it helps us to get courses from ease of our home.BodyWizard provides training from certified trainers",modifier=Modifier.padding(horizontal = 28.dp), color = Color.White, fontSize = 20.sp)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(0.dp)) {

                Text(text = "⚒", fontSize = 40.sp,modifier=Modifier.padding(start=10.dp), color = Color.White)
                Text(text = "BodyWizard is a Gym service provider ,It was started by some certified gym trainers it helps us to get courses from ease of our home.BodyWizard provides training from certified trainers",modifier=Modifier.padding(horizontal = 28.dp), color = Color.White, fontSize = 20.sp)
            }
            Divider(
                color=Color.Yellow.copy(alpha = 0.5f),
                thickness=4.dp,
                modifier=Modifier.padding(horizontal = 32.dp)

            )
            Text("Follow Us On", color = Color.White, fontSize = 18.sp)
            Row(verticalAlignment = Alignment.CenterVertically){

                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.image__1_), contentDescription ="Google logo",modifier=Modifier.size(28.dp) )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.image__2_), contentDescription ="FB LOGO",modifier=Modifier.size(28.dp) )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription ="Email",tint= Color.White)
                }}

        }
    }
}