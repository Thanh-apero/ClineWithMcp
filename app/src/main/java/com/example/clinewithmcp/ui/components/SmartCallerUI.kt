package com.example.clinewithmcp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clinewithmcp.R

@Composable
fun SmartCallerUI() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column {
            StatusBar()
            MainContent()
        }
    }
}

@Composable
fun StatusBar() {
    Row(
        modifier = Modifier
            .alpha(0.64f)
            .background(Color.White)
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "12:30",
            style = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        )
        Row {
            Icon(
                imageVector = Icons.Filled.Wifi,
                contentDescription = "Network Wifi",
                tint = Color.Black
            )
            Icon(
                imageVector = Icons.Filled.SignalCellular4Bar,
                contentDescription = "Signal",
                tint = Color.Black
            )
            Icon(
                imageVector = Icons.Filled.BatteryFull,
                contentDescription = "Battery",
                tint = Color.Black
            )
        }
    }
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .background(Color(0xFFF8F8F8))
            .fillMaxWidth()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Smart caller",
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Image(
            painter = painterResource(id = R.drawable.ic_layer_1),
            contentDescription = "Profile Image",
            modifier = Modifier.size(166.dp)
        )
        Text(
            text = "Calling...",
            style = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        )
        Text(
            text = "Hailey Bieber",
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = "(+84) 32542585",
            style = TextStyle(
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        )
        CallingSection()
    }
}

@Composable
fun CallingSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        CallingActions()
        CallButtons()
    }
}

@Composable
fun CallingActions() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(imageVector = Icons.Default.Call, contentDescription = "Remind Me")
            Text(text = "Remind me", textAlign = TextAlign.Center)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(imageVector = Icons.Default.Call, contentDescription = "Message")
            Text(text = "Message", textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun CallButtons() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF3B3B).copy(alpha = 0.12f)),
            shape = RoundedCornerShape(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_call_active),
                contentDescription = "Decline"
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CD200).copy(alpha = 0.16f)),
            shape = RoundedCornerShape(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_mute_active),
                contentDescription = "Accept"
            )
        }
    }
}
