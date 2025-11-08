package com.pluxai.jetpackcourse.composables.dialog

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.pluxai.jetpackcourse.R


@Composable
fun DialogWithImage() {
    val context = LocalContext.current
    Dialog(
        onDismissRequest = { showToast(mContext = context, "On Dismiss called") },
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.skeleton),
                contentDescription = stringResource(R.string.skeleton),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Text(
                text = "Sample content",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            //buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                TextButton(
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "on confirm called"
                        )
                    }
                ) {
                    Text("Confirm")
                }

                TextButton(
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "on cancel clicked"
                        )
                    }
                ) {
                    Text("Cancel")
                }
            }
        }
    }
}

fun showToast(mContext: Context, text: String) {
    Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show()
}
//
//@Preview(showSystemUi = true)
//@Composable
//fun ShowDialogPreview() {
//    DialogWithImage()
//}