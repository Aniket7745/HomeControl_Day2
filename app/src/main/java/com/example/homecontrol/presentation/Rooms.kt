import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homecontrol.R

@Composable
fun Rooms(modifier: Modifier = Modifier) {
    
    Text(text = "Rooms", fontSize = 22.sp, fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(16.dp)
        )
    Spacer(modifier = Modifier.size(5.dp))
    LazyRow {
        itemsIndexed(
            items = listOf(
                "Item 1",


            )
        ) { index, item ->
            Box1()
            Box2()
            Box3()
            Box4()
            Box5()




        }
    }
}

@Composable
fun Box1(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp),
            ),
    ) {

        Icon(painter = painterResource(id = R.drawable.bedroom_hotel_svgrepo_com),
            contentDescription ="" ,modifier =Modifier.padding(top = 20.dp, start = 16.dp))

    }
}

@Composable
fun Box2(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp),
            ),
    ) {

        Icon(painter = painterResource(id = R.drawable.dining_room_furniture_of_a_table_with_chairs_svgrepo_com),
            contentDescription ="" ,modifier =Modifier.padding(top = 20.dp, start = 16.dp))

    }
}
@Composable
fun Box3(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp),
            ),
    ) {

        Icon(painter = painterResource(id = R.drawable.bathroom_svgrepo_com),
            contentDescription ="" ,modifier =Modifier.padding(top = 16.dp, start = 16.dp, bottom = 10.dp))

    }
}
@Composable
fun Box4(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp),
            ),
    ) {

        Icon(painter = painterResource(id = R.drawable.gaming_svgrepo_com),
            contentDescription ="" ,modifier =Modifier.padding(10.dp))

    }
}

@Composable
fun Box5(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp),
            ),
    ) {

        Icon(painter = painterResource(id = R.drawable.car_side_svgrepo_com),
            contentDescription ="" ,modifier =Modifier.padding(16.dp).size(50.dp))

    }
}

@Preview
@Composable
private fun RoomPrev() {
Rooms()
}
