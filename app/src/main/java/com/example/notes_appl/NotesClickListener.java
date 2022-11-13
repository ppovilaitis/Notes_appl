package com.example.notes_appl;

import androidx.cardview.widget.CardView;

import com.example.notes_appl.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
