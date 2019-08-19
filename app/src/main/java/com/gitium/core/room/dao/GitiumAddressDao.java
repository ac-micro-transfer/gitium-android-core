package com.gitium.core.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.gitium.core.room.entity.GitiumAddress;

import java.util.List;

@Dao
public interface GitiumAddressDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(GitiumAddress address);

    @Query("SELECT address FROM gitium_address WHERE seed = :seed AND address_index = :index")
    String getGitiumAddressByIndex(String seed, int index);

    @Query("SELECT * FROM gitium_address WHERE seed = :seed AND address_index <= :endIndex")
    List<GitiumAddress> getGitiumAddresses(String seed, int endIndex);
}
