import android.hardware.lights.Light
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homecontrol.R

@Composable
fun Devices(modifier: Modifier = Modifier) {
    Text(text = "Devices", fontSize = 22.sp, fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(16.dp)
    )
    Spacer(modifier = Modifier.size(5.dp))


    LazyVerticalGrid(

        columns = GridCells.Fixed(2),

        contentPadding = PaddingValues(16.dp),

        content = {
            items(4) { index ->
                when (index) {
                    0 -> Light()
                    1 -> SmartTV()
                    2 -> CCtv()
                    3 -> HomePod()

                    else -> {}
                }
            }
        }
    )
    
    }


@Composable
fun Light(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(250.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )

    ) {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Box(modifier = Modifier
                .size(50.dp)
                .background(
                    MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(50.dp)
                )){
                Icon(painter = painterResource(id = R.drawable.lamp_on_svgrepo_com), contentDescription = "",
                    modifier= Modifier
                        .padding(16.dp)
                        .size(100.dp))
            }
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Lighting", fontSize = 20.sp)
            Text(text = "5 Lamps", fontSize = 14.sp)
            Spacer(modifier = Modifier.size(60.dp))
            Row(
                modifier= Modifier.fillMaxSize(),
                Arrangement.SpaceBetween
            ) {
                Text(text = "ON", fontWeight = FontWeight.Bold,modifier = Modifier.padding(5.dp))


                Icon(painter = painterResource(id = R.drawable.toggle_on_svgrepo_com), contentDescription ="",modifier = Modifier.size(40.dp) )

            }

        }



    }
}

@Composable
fun SmartTV(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(250.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )

    ) {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Box(modifier = Modifier
                .size(50.dp)
                .background(
                    MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(50.dp)
                )){
                Icon(painter = painterResource(id = R.drawable.tv_alt_svgrepo_com), contentDescription = "",
                    modifier= Modifier
                        .padding(16.dp)
                        .size(100.dp))
            }
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "SmartTV", fontSize = 20.sp)
            Text(text = "2 Device", fontSize = 14.sp)
            Spacer(modifier = Modifier.size(60.dp))
            Row(
                modifier= Modifier.fillMaxSize(),
                Arrangement.SpaceBetween
            ) {
                Text(text = "OFF", fontWeight = FontWeight.Bold,modifier = Modifier.padding(5.dp))


                Icon(painter = painterResource(id = R.drawable.toggle_off_svgrepo_com), contentDescription ="",modifier = Modifier.size(40.dp) )

            }

        }



    }
}

@Composable
fun CCtv(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(250.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )

    ) {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Box(modifier = Modifier
                .size(50.dp)
                .background(
                    MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(50.dp)
                )){
                Icon(painter = painterResource(id = R.drawable.cctv_svgrepo_com), contentDescription = "",
                    modifier= Modifier
                        .padding(16.dp)
                        .size(100.dp))
            }
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "CC TV", fontSize = 20.sp)
            Text(text = "6 Device", fontSize = 14.sp)
            Spacer(modifier = Modifier.size(60.dp))
            Row(
                modifier= Modifier.fillMaxSize(),
                Arrangement.SpaceBetween
            ) {
                Text(text = "ON", fontWeight = FontWeight.Bold,modifier = Modifier.padding(5.dp))


                Icon(painter = painterResource(id = R.drawable.toggle_on_svgrepo_com), contentDescription ="",modifier = Modifier.size(40.dp) )

            }

        }



    }
}

@Composable
fun HomePod(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(250.dp)
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )

    ) {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Box(modifier = Modifier
                .size(50.dp)
                .background(
                    MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(50.dp)
                )){
                Icon(painter = painterResource(id = R.drawable.speaker_svgrepo_com), contentDescription = "",
                    modifier= Modifier
                        .padding(16.dp)
                        .size(100.dp))
            }
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Home Pod", fontSize = 20.sp)
            Text(text = "3 Device", fontSize = 14.sp)
            Spacer(modifier = Modifier.size(60.dp))
            Row(
                modifier= Modifier.fillMaxSize(),
                Arrangement.SpaceBetween
            ) {
                Text(text = "ON", fontWeight = FontWeight.Bold,modifier = Modifier.padding(5.dp))


                Icon(painter = painterResource(id = R.drawable.toggle_on_svgrepo_com), contentDescription ="",modifier = Modifier.size(40.dp) )

            }

        }



    }
}

@Preview
@Composable
private fun DevicePRev() {
    Devices()

}