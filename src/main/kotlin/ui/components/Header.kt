package ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 0.dp,
        modifier = Modifier.fillMaxWidth().height(32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = {},
                contentPadding = PaddingValues(
                    horizontal = 8.dp,
                    vertical = 0.dp
                )
            ) {
                Text(
                    text = "Novo",
                    style = MaterialTheme.typography.body2.copy(
                        fontSize = 12.sp
                    ),
                    color = MaterialTheme.colors.onBackground
                )
            }

            TextButton(
                onClick = {},
                contentPadding = PaddingValues(
                    horizontal = 8.dp,
                    vertical = 0.dp
                )
            ) {
                Text(
                    text = "Abrir",
                    style = MaterialTheme.typography.body2.copy(
                        fontSize = 12.sp
                    ),
                    color = MaterialTheme.colors.onBackground
                )
            }
            TextButton(
                onClick = {},
                contentPadding = PaddingValues(
                    horizontal = 8.dp,
                    vertical = 0.dp
                )
            ) {
                Text(
                    text = "Salvar",
                    style = MaterialTheme.typography.body2.copy(
                        fontSize = 12.sp
                    ),
                    color = MaterialTheme.colors.onBackground
                )
            }
            TextButton(
                onClick = {},
                contentPadding = PaddingValues(
                    horizontal = 8.dp,
                    vertical = 0.dp
                )
            ) {
                Text(
                    text = "Sair",
                    style = MaterialTheme.typography.body2.copy(
                        fontSize = 12.sp
                    ),
                    color = MaterialTheme.colors.onBackground
                )
            }
        }
    }
}