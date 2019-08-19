package com.gitium.core;

import androidx.room.Room;
import android.content.Context;
import android.text.TextUtils;

import com.gitium.core.room.GitiumAddressDatabase;
import com.gitium.core.room.dao.GitiumAddressDao;
import com.gitium.core.room.entity.GitiumAddress;

public class AndroidAddressDelegate implements AddressDelegate {

    private GitiumAddressDao dao;

    public AndroidAddressDelegate(Context context) {
        GitiumAddressDatabase db = Room.databaseBuilder(context, GitiumAddressDatabase.class, "gitium_addresses.db").allowMainThreadQueries().build();
        dao = db.gitiumAddressDao();
    }

    @Override
    public String getAddress(String seed, int index) {
        return dao.getGitiumAddressByIndex(seed, index);
    }

    @Override
    public void setAddress(String seed, String address, int index) {
        if (TextUtils.isEmpty(dao.getGitiumAddressByIndex(seed, index))) {
            dao.insert(new GitiumAddress(seed, address, index));
        }
    }
}
