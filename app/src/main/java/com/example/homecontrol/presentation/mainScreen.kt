import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column {

        WelcomeSection()
        Spacer(modifier = Modifier.size(30.dp))
        Rooms()
        Spacer(modifier = Modifier.size(20.dp))
        Devices()
        //BottomNavigation()

    }


}

@Preview(showBackground = true,
    )
@Composable
private fun MainScreenPrev() {
    MainScreen()
}