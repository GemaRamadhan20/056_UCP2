package com.example.ucp2_pam

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    pilihanDosen: List<String>,
    onSelectionChanged: (String) -> Unit,
    onConfirmButtonClicked: (Int) -> Unit,
    onNextButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    var DosenygDipilih by rememberSaveable { mutableStateOf("") }
Column (
    modifier = modifier,
    verticalArrangement = Arrangement.SpaceBetween
){
Column (
    modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
){
    pilihanDosen.forEach{ item ->
        Row (
            modifier = Modifier.selectable(
                selected = DosenygDipilih == item,
                onClick =
                    DosenygDipilih = item
                    onSelectetionChanged(item)
            )
        )


}
}
}