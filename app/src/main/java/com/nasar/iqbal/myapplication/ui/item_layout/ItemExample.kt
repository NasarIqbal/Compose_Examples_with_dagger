package com.nasar.iqbal.myapplication.ui.item_layout

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.nasar.iqbal.myapplication.R
import com.nasar.iqbal.myapplication.model.ExampleItem
import com.skydoves.landscapist.CircularReveal
import com.skydoves.landscapist.glide.GlideImage

@Composable
private fun itemExample(item: ExampleItem, onUserClick: (ExampleItem) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { onUserClick(item) })
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        GlideImage(
            imageModel = item.image,
            // Crop, Fit, Inside, FillHeight, FillWidth, None
            contentScale = ContentScale.Crop,
            // shows an image with a circular revealed animation.
            circularReveal = CircularReveal(duration = 250),
            // shows a placeholder ImageBitmap when loading.
            placeHolder = ImageBitmap.imageResource(R.drawable.no_image_place_holder),
            // shows an error ImageBitmap when the request failed.
            error = ImageBitmap.imageResource(R.drawable.no_image_place_holder)
        )

        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = item.title,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h6
            )
            Text(text = item.description, style = MaterialTheme.typography.body2)

        }
    }
}

@Composable
fun UserList(userList: List<ExampleItem>) {
//    val context = ContextAmbient.current
//    LazyColumnFor(items = userList) { user ->
//        UserRow(user = user,onUserClick = {
//            showMessage(context,"You clicked ${user.name}")
//        })
//        Divider()
//    }
}