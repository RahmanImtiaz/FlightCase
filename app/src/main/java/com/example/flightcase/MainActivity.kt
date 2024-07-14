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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.flightcase.ui.theme.FlightCaseTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.card.BpkCardCorner
import net.skyscanner.backpack.compose.card.BpkCardElevation
import net.skyscanner.backpack.compose.card.BpkCardPadding
import net.skyscanner.backpack.compose.theme.BpkTheme


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
    BpkTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FlightCard(flightNumber = "ABC123")
            DepartureCard(airportCode = "JFK", departureTime = "12:00 PM")
            ArrivalCard(airportCode = "LAX", arrivalTime = "03:00 PM")
        }
    }
}

@Composable
fun FlightCard(flightNumber: String) {
    BpkCard(
        modifier = Modifier.padding(vertical = 8.dp),
        corner = BpkCardCorner.Small,
        elevation = BpkCardElevation.None,
        padding = BpkCardPadding.Small
    ) {
        Text(
            text = "Flight Number: $flightNumber",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.Blue
        )
    }
}

@Composable
fun DepartureCard(airportCode: String, departureTime: String) {
    BpkCard(
        modifier = Modifier.padding(vertical = 8.dp),
        corner = BpkCardCorner.Small,
        elevation = BpkCardElevation.None,
        padding = BpkCardPadding.Small
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Departure",
                style = MaterialTheme.typography.labelMedium,
                color = Color.Red
            )
            Text(
                text = "Airport Code: $airportCode",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Red
            )
            Text(
                text = "Departure Time: $departureTime",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Red
            )
        }
    }
}

@Composable
fun ArrivalCard(airportCode: String, arrivalTime: String) {
    BpkCard(
        modifier = Modifier.padding(vertical = 8.dp),
        corner = BpkCardCorner.Small,
        elevation = BpkCardElevation.None,
        padding = BpkCardPadding.Small
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Arrival",
                style = MaterialTheme.typography.labelMedium,
                color = Color.Green
            )
            Text(
                text = "Airport Code: $airportCode",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Green
            )
            Text(
                text = "Arrival Time: $arrivalTime",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Green
            )
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
