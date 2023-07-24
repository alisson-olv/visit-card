package com.example.visitcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visitcard.ui.theme.VisitCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // THE MAIN FUNCTION GOES HERE
                    NameAndCompany("Alisson", "Alguma empresa")
                }
            }
        }
    }
}

@Composable
fun NameAndCompany(
    name: String,
    companyName: String,
    modifier: Modifier = Modifier
) {
    Column() {
        Column() {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
            Text(
                text = name
            )
            Text(
                text = companyName
            )
        }
        InfoVisitCardDefault("123", "@fulano", "teste@teste")
    }

}

@Composable
fun InfoVisitCardDefault(
    textTel: String,
    textSocial: String,
    textEmail: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(start = 50.dp)) {
        Row {
            Image(
                painter = painterResource(R.drawable.baseline_phone_24),
                contentDescription = null
            )
            Text(
                text = textTel,
                modifier = modifier.padding(start = 10.dp)
            )
        }
        Row (
            modifier = modifier.padding(top = 20.dp, bottom = 20.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.baseline_person_outline_24),
                contentDescription = null
            )
            Text(
                text = textSocial,
                modifier = modifier.padding(start = 10.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.baseline_email_24),
                contentDescription = null
            )
            Text(
                text = textEmail,
                modifier = modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VisitCardPreview() {
    VisitCardTheme {
        // THE MAIN FUNCTION GOES HERE FOR SPLIT
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // THE MAIN FUNCTION GOES HERE
            NameAndCompany("Alisson", "Alguma empresa")
        }
    }
}