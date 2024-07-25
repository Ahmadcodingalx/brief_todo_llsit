package com.example.to_do_kotlin.data.room.repositories

import com.example.to_do_kotlin.data.room.daos.OTPCodeDao
import com.example.to_do_kotlin.data.room.models.OTPCode
import kotlinx.coroutines.flow.Flow


class OTPCodeRepository(
    private val otpCodeDao: OTPCodeDao
) {

    suspend fun insert(otpCode: OTPCode) { otpCodeDao.insert(otpCode) }
    fun checkOtpCode(email: String, code: String): Flow<List<OTPCode>> = otpCodeDao.checkOtpCode(email, code)
}