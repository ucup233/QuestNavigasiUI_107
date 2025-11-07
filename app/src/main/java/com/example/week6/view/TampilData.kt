package com.example.week6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.week6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
) {
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = stringResource(id = R.string.alamat), second = "Yogyakarta")
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.tampil),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ){
        items.forEach { item ->
            Column {
                Text(
                    text = item.first.uppercase(),
                    fontSize = 16.sp 
                )
                Text(
                    text = item.second,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 22.sp
                )
            }
            HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
        }
}