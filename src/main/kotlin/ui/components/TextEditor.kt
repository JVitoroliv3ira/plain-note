package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextEditor() {
    var text by remember { mutableStateOf("") }
    val lines = text.split("\n").size
    val scrollState = rememberScrollState()

    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colors.surface)
                .padding(16.dp)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.Top,
        ) {
            for (i in 1..lines) {
                Text(
                    text = "$i",
                    style = MaterialTheme.typography.body2.copy(
                        fontSize = 18.sp,
                        color = MaterialTheme.colors.onSurface
                    )
                )
            }
        }

        BasicTextField(
            value = text.replace("\t", "    "),
            onValueChange = { text = it },
            textStyle = TextStyle(
                fontSize = 18.sp,
                color = MaterialTheme.colors.onBackground
            ),
            cursorBrush = SolidColor(MaterialTheme.colors.onBackground),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(MaterialTheme.colors.background)
                .verticalScroll(scrollState)
        )
    }
}