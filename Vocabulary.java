package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "vocabularies")
    public class Vocabulary{


    @PrimaryKey (autoGenerate = true)
    @NonNull
    @ColumnInfo (name = "VocabularyId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "VocabularyWord")
    private String mWord;

    private String mMeaning;

    private int mLevel;

    private String mCreationDate;

    public Vocabulary(@Nullable String mWord, String mMeaning, int mLevel, String mCreationDate) {
        this.mWord = mWord;
        this.mMeaning = mMeaning;
        this.mLevel = mLevel;
        this.mCreationDate = mCreationDate;
    }



    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmWord() {
        return mWord;
    }

    public void setmWord(String mWord) {
        this.mWord = mWord;
    }

    public String getmMeaning() {
        return mMeaning;
    }

    public void setmMeaning(String mMeaning) {
        this.mMeaning = mMeaning;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    public String getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(String mCreationDate) {
        this.mCreationDate = mCreationDate;
    }



}
