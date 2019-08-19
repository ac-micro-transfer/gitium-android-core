package com.gitium.core.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

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
