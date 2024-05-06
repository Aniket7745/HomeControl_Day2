import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homecontrol.ui.theme.surfaceColorLight

@Composable
fun WelcomeSection(modifier: Modifier = Modifier) {

    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp, top = 40.dp, end = 16.dp),
        Arrangement.SpaceBetween
    ){

        Column {
            Text(text = "Hello Aniket", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Welcome to your smart home,", fontSize = 16.sp, )
        }
       Icon(Icons.Rounded.AccountCircle, contentDescription = "",
           modifier = Modifier.size(60.dp))

    }


}

@Preview
@Composable
private fun WelcomeSectionPrev() {
    WelcomeSection()
}