package com.gitium.core.room.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(tableName = "gitium_address", primaryKeys = {"seed", "address_index"})
public class GitiumAddress {
    @NonNull
    @ColumnInfo(name = "seed")
    private String seed;
    @NonNull
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "address_index")
    private int index;

    public GitiumAddress() {
    }

    public GitiumAddress(@NonNull String seed, @NonNull String address, int index) {
        this.seed = seed;
        this.address = address;
        this.index = index;
    }

    @NonNull
    public String getSeed() {
        return seed;
    }

    public void setSeed(@NonNull String seed) {
        this.seed = seed;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
