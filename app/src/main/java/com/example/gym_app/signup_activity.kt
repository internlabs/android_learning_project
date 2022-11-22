package com.example.gym_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gym_app.ui.theme.Gym_appTheme

class signup_activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gym_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  Signup()
                }
            }
        }
    }
}

@Composable
fun Signup() {
    Box(){
        Image(painter = painterResource(id = R.drawable.sporty), contentDescription ="logo",modifier=Modifier.fillMaxSize(), contentScale = ContentScale.Crop )
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 120.dp, bottom = 88.dp, start = 8.dp, end = 10.dp)
        .alpha(0.0f)
        .clip(shape = RoundedCornerShape(8.dp))
        .background(color = Color.LightGray) ){

    }
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Text(text = "Sign Up for BodyWizard", fontWeight = FontWeight.Bold, fontSize = 28.sp,color = Color.White)
        Image(painter = painterResource(id = R.drawable.logo2), contentDescription ="Logo",modifier=Modifier.size(120.dp))
       Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {


           var name by remember {
               mutableStateOf("")
           }
           var mail by remember {
               mutableStateOf("")
           }
           var password by remember {
               mutableStateOf("")
           }
           var confirm_password by remember {
               mutableStateOf("")
           }
           OutlinedTextField(
               value = name,
               onValueChange = { newValue -> name = newValue
               },
               leadingIcon = {
                   Icon(
                       imageVector = Icons.Default.Person,
                       contentDescription = "name",
                       tint=Color.White
                   )
               },
               label = { Text(text = "Name", color = Color.White)},
               placeholder = { Text(text = "Name", color = Color.White)},
               colors=TextFieldDefaults.textFieldColors(textColor = Color.White)
           )
           OutlinedTextField(
               value = mail,
               onValueChange = { newValue ->
                    mail = newValue
               },
               leadingIcon = {
                   Icon(
                       imageVector = Icons.Default.Email,
                       contentDescription = "name",
                       tint=Color.White
                   )
               },
               label = { Text(text = "Email",color = Color.White)},
               placeholder = { Text(text = "Email", color = Color.White)},
               colors=TextFieldDefaults.textFieldColors(textColor = Color.White)


           )
           OutlinedTextField(
               value = password,
               onValueChange = { newValue ->
                   password = newValue
               },
               leadingIcon = {
                   Icon(
                       imageVector = Icons.Default.Lock,
                       contentDescription = "name",
                       tint=Color.White
                   )
               },
               label = { Text(text = "Password",color = Color.White)},
               placeholder = { Text(text = "Password", color = Color.White)},
               colors=TextFieldDefaults.textFieldColors(textColor = Color.White),
               visualTransformation =PasswordVisualTransformation()

           )
           OutlinedTextField(
               value = confirm_password,
               onValueChange = { newValue ->
                   confirm_password = newValue
               },
               leadingIcon = {
                   Icon(
                       imageVector = Icons.Default.Lock,
                       contentDescription = "name",
                       tint=Color.White

                   )
               },
               label = { Text(text = "Retype Password",color = Color.White)},
               placeholder = { Text(text = "Retype Password", color = Color.White)},
               colors=TextFieldDefaults.textFieldColors(textColor = Color.White) ,
               visualTransformation =PasswordVisualTransformation()
           )
           
       }
        Spacer(modifier = Modifier.height(8.dp))
       Button(onClick = { /*TODO*/ }) {
           Text(text = "Sign Up")
       }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Gym_appTheme {
        Signup()
    }
}