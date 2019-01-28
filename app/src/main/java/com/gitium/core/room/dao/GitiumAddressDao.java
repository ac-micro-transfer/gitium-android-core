package com.gitium.core.room.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.gitium.core.room.entity.GitiumAddress;

@Dao
public interface GitiumAddressDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(GitiumAddress address);

    @Query("SELECT address FROM gitium_address WHERE seed = :seed AND address_index = :index")
    String getGitiumAddressByIndex(String seed, int index);
}
