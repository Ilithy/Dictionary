package com.looker.dictionary.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.looker.dictionary.ui.theme.typography

@Composable
fun HeaderText(header: String?) {
	header?.let { Text(text = it, style = typography.titleSmall) }
}

@Composable
fun DefinitionText(pos: Int = 1, definition: String) {
	Text(
		text = AnnotatedString(
			text = "${pos}: ",
			spanStyle = SpanStyle(
				fontWeight = FontWeight.SemiBold,
				fontSize = 16.sp,
				letterSpacing = 0.1.sp
			)
		) + AnnotatedString(definition)
	)
}

@Composable
fun ExampleText(example: String?) {
	example?.let {
		Text(
			text = AnnotatedString(
				text = "Example: ",
				spanStyle = SpanStyle(
					fontWeight = FontWeight.SemiBold,
					fontSize = 16.sp,
					letterSpacing = 0.1.sp
				)
			) + AnnotatedString(it)
		)
	}
}