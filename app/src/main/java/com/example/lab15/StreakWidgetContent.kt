package com.example.lab15

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text
import androidx.glance.action.actionStartActivity

class StreakWidgetContent : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                StreakWidgetUI()
            }
        }
    }

    @Composable
    private fun StreakWidgetUI() {
        val diasDeRacha = 3 // Simulación de racha actual
        val entroHoy = true // Simulación de si abrió la app hoy

        val mensaje = if (entroHoy) "🔥 ¡Racha activa!" else "🚫 Aún no entras hoy"

        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(GlanceTheme.colors.background)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = mensaje)
            Text(text = "$diasDeRacha días seguidos")
            Button(
                text = "Abrir Agenda",
                onClick = actionStartActivity<AgendarActivity>()
            )
        }
    }
}