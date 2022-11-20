package com.example.gym_app

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.text.LoginFilter
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.gym_app.ui.theme.Gym_appTheme
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout.RESIZE_MODE_ZOOM
import com.google.android.exoplayer2.ui.StyledPlayerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gym_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Login(getUri())
                }
            }
        }
    }
    public fun getUri(): Uri {
        val rawId:Int = resources.getIdentifier("vidz","raw",packageName)
        val VideoUri ="android.resource://$packageName/$rawId"
        return Uri.parse(VideoUri)
    }
}
 private fun Context.buildExoPlayer(uri:Uri) =
     ExoPlayer.Builder(this).build().apply{
         setMediaItem(MediaItem.fromUri(uri))
         repeatMode= Player.REPEAT_MODE_ALL
         playWhenReady=true
         prepare()
     }

private fun Context.buildplayerview(exoPlayer: ExoPlayer)=
    StyledPlayerView(this).apply{
        player=exoPlayer
        layoutParams=FrameLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        useController=false
        resizeMode=RESIZE_MODE_ZOOM
    }
@Composable
fun Login(uri:Uri) {
    val context = LocalContext.current
    var Username by remember {
        mutableStateOf("Username")
    }
    var Password by remember {
        mutableStateOf("Password")
    }
    val exoPlayer = remember { context.buildExoPlayer(uri) }


    Box() {


        DisposableEffect(
            AndroidView(
                factory = { it.buildplayerview(exoPlayer) },
                modifier = Modifier.fillMaxSize()
            )
        ) {
            onDispose {
                exoPlayer.release()
            }
        }
  Box(modifier = Modifier
      .fillMaxSize()
      .padding(top = 105.dp, bottom = 95.dp, start = 12.dp, end = 12.dp)
      .alpha(0.2f)
      .clip(RoundedCornerShape(24.dp))
      .background(color = Color.White)){}


        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(top = 150.dp)
                ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)

        ) {

            /* Image(painter = painterResource(id = R.drawable._4012019_26), contentDescription ="Gym_icon", modifier = Modifier
                    .size(220.dp)
                    .clip(shape = CircleShape), contentScale = ContentScale.Crop )*/
            Text(text = "Welcome to BodyWizard", fontWeight = FontWeight.Bold, style = TextStyle(fontFamily = FontFamily.Serif), fontSize = 30.sp, color = Color.White)
            Text(text = "Sign in to continue", fontWeight = FontWeight.SemiBold,color= Color.White)
            Image(painter = painterResource(id = R.drawable.logo2), contentDescription ="Logo" ,modifier=Modifier.size(120.dp))
            TextField(
                value = Username,
                onValueChange = { newValue -> Username = newValue },
                modifier=Modifier.fillMaxWidth(0.85f),
                shape = CircleShape,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Username"
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                )
            )

            TextField(
                value = Password,
                onValueChange = { Password = it },
                modifier=Modifier.fillMaxWidth(0.85f),
                shape = CircleShape,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Password"
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                )
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(0.5f),
                shape = RoundedCornerShape(7.dp)
            ) {
                Text(text = "SIGN IN", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            }

            Divider(
                color=Color.White.copy(alpha = 0.3f),
                thickness=3.dp,
                modifier=Modifier.padding(horizontal = 25.dp)

            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Don't have an account", color = Color.White)
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Sign Up")
                }
            }

        }


    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Gym_appTheme {
       // Login()
    }
}