package com.gitium.core.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.gitium.core.room.dao.GitiumAddressDao;
import com.gitium.core.room.entity.GitiumAddress;

@Database(
        entities = {
                GitiumAddress.class
        },
        version = 1,
        exportSchema = false
)
public abstract class GitiumAddressDatabase extends RoomDatabase {
    public abstract GitiumAddressDao gitiumAddressDao();
}
