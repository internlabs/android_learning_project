package com.example.gym_app.UI_Screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gym_app.R
import com.example.gym_app.Signup
import com.example.gym_app.ui.theme.Gym_appTheme

class CourseDetails : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gym_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CourseDetail()
                }
            }
        }
    }
}

@Composable
fun CourseDetail(){
    Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Card(modifier = Modifier
          .align(CenterHorizontally)
          .padding(10.dp)
          .fillMaxWidth(),
           shape = RoundedCornerShape(10.dp)
          , elevation = 10.dp) {
          Column(modifier = Modifier
              .padding(10.dp)
              .fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally) {
              Image(painter = painterResource(id = R.drawable.gym_trainer),
                  contentScale = ContentScale.Crop,
                  contentDescription = "gym trainer profile photo",
              modifier = Modifier
                  .clip(CircleShape)
                  .border(1.dp, Color.Black, CircleShape))
              Spacer(modifier = Modifier.padding(top = 10.dp))
              Text(text = "Certified Gym Trainer", fontWeight = FontWeight.Bold, fontSize = 20.sp)
              Spacer(modifier = Modifier.padding(top = 10.dp))
              Text(text = "Certified by Makarand Kalburgee on 18 July 2022")
              Spacer(modifier = Modifier.padding(top = 10.dp))
              Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                  Box(modifier = Modifier.border(2.dp, Color.Black, RectangleShape)) {
                      Column(modifier = Modifier
                          .padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                          Text(text = "Level")
                          Spacer(modifier = Modifier.padding(top=10.dp))
                          Text(text = "Beginner", color = Color.Blue)
                      }

                  }
                  Spacer(modifier = Modifier.padding(20.dp))
                  Box(modifier = Modifier.border(2.dp, Color.Black, RectangleShape)
                  ) {
                      Column(modifier = Modifier
                          .padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                          Text(text = "Category")
                          Spacer(modifier = Modifier.padding(top=10.dp))
                          Text(text = "Weight Training", color = Color.Blue)
                      }
                  }
              }
          }
      }
        Spacer(modifier = Modifier.padding(5.dp))
        Card(modifier = Modifier
            .align(CenterHorizontally)
            .padding(10.dp)
            .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
            , elevation = 10.dp) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(10.dp)) {
                Box() {
                    Column(modifier = Modifier
                        .padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Price")
                        Spacer(modifier = Modifier.padding(top=10.dp))
                        Text(text = "₹20000", color = Color.Blue)
                    }

                }
                Spacer(modifier = Modifier.padding(10.dp))
                Box() {
                    Column(modifier = Modifier
                        .padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Validity")
                        Spacer(modifier = Modifier.padding(top=10.dp))
                        Text(text = "Valid till 365 days", color = Color.Blue)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Card(modifier = Modifier
            .align(CenterHorizontally)
            .padding(10.dp)
            .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
            , elevation = 10.dp) {
            Column(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
                Text(text = "Description", color = Color.Blue, fontSize = 20.sp)
                Text(text = "We have specially designed this course to help an individual have " +
                        "their niche in the field of nutrition this course gives you an insight into the field of nutrition " +
                        "and the research that happens behind it.")
                Text(text = "After the completion of the course, you gain expertise in the field of nutrition and" +
                        "are capable of handling client ranging from sportsperson,active individuals and anyone who is seeking to follow a healthy lifestyle.")
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "Terms and Conditions", color = Color.Blue, fontSize = 20.sp)
                Text(text = "Amount once paid will not be refunded")
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(0.9f), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White)) {
            Text(text = "Buy Now")
        }
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview(){
    CourseDetail()
}