package com.example.affirmations2.data

import com.example.affirmations2.R
import com.example.affirmations2.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.hulck),
            Affirmation(R.string.affirmation2, R.drawable.coisa),
            Affirmation(R.string.affirmation3, R.drawable.capitao_america),
            Affirmation(R.string.affirmation4, R.drawable.spiderman),
            Affirmation(R.string.affirmation5, R.drawable.fantastico),
            Affirmation(R.string.affirmation6, R.drawable.shazam),
            Affirmation(R.string.affirmation7, R.drawable.lanterna_verde),
            Affirmation(R.string.affirmation8, R.drawable.charada),
            Affirmation(R.string.affirmation9, R.drawable.batman),
            Affirmation(R.string.affirmation10, R.drawable.groot)
        )
    }
}