package com.example.flightcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flightcase.ui.theme.FlightCaseTheme
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlightCaseTheme {
                FlightInfoScreen()
            }
        }
    }
}

@Composable
fun FlightInfoScreen() {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FlightCard(flightNumber = "ABC123")
        DepartureCard(airportCode = "JFK", departureTime = "12:00 PM")
        ArrivalCard(airportCode = "LAX", arrivalTime = "03:00 PM")
    }
}

@Composable
fun FlightCard(flightNumber: String) {
    Card(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = "Flight Number: $flightNumber", style = MaterialTheme.typography.headlineMedium)
    }
}

@Composable
fun DepartureCard(airportCode: String, departureTime: String) {
    Card(modifier = Modifier.padding(vertical = 8.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Departure", style = MaterialTheme.typography.labelLarge)
            Text(text = "Airport Code: $airportCode", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Departure Time: $departureTime", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
fun ArrivalCard(airportCode: String, arrivalTime: String) {
    Card(modifier = Modifier.padding(vertical = 8.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Arrival", style = MaterialTheme.typography.labelLarge)
            Text(text = "Airport Code: $airportCode", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Arrival Time: $arrivalTime", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFlightInfoScreen() {
    FlightCaseTheme {
        FlightInfoScreen()
    }
}
