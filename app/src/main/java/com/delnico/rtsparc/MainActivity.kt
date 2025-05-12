package com.delnico.rtsparc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.delnico.rtsparc.ui.LoginForm
import com.delnico.rtsparc.ui.theme.RTSPARCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RTSPARCTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    LoginForm(
                        modifier = Modifier.padding(it),
                        onLoginClick = { username, password ->
                            // Handle login click
                            println("Username: $username, Password: $password")
                        }
                    )
                }
            }
        }
    }
}
