package com.example.to_do_kotlin.data.room.repositories

import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.to_do_kotlin.data.room.daos.UserDao
import com.example.to_do_kotlin.data.room.models.OTPCode
import com.example.to_do_kotlin.data.room.models.User
import kotlinx.coroutines.flow.Flow

class UserRepository(
    private val userDao: UserDao
) {
    val usersList = userDao.userList()

    suspend fun register(user: User) { userDao.register(user) }

    fun getUserByEmail(email: String): Flow<List<User>> = userDao.getUserByEmail(email)
    fun activateUserByEmail(email: String) = userDao.activateUserByEmail(email)
}