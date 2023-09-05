package com.example.radiotest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.radiotest.ui.theme.RadiotestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadiotestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun PlayerView(isplaying:Boolean)
{
    Column(
        modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ) {
     Spacer(modifier = Modifier.height(40.dp))
      AsyncImage(
         modifier = Modifier
             .size(200.dp)
             .clip(CircleShape),
          model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSB_PnViJs0mw3rZEqJLPmd5v2pRqEHP-zIXQ&usqp=CAU",
          contentDescription = "image player"
      )

       Row(
           modifier = Modifier.fillMaxWidth(),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.Center
       ) {
           Spacer(modifier = Modifier.height(30.dp))
           IconButton(modifier = Modifier.size(45.dp),
                onClick = { /*TODO*/ }) {

                Icon(imageVector = ImageVector.vectorResource( if(isplaying) R.drawable.pause else R.drawable.play),
                    contentDescription = "play/pause",
                    tint = Color.Blue,
                    modifier = Modifier.size(70.dp)
                )
            }

       }
    }
}
