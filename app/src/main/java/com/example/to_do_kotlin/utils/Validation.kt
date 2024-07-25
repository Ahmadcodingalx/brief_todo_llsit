package com.example.to_do_kotlin.utils

fun fullNameLengthValidation(fullName: String): Boolean{
    return fullName.length >= NumberConstants.MinFullNameLength.value && fullName.length <= NumberConstants.MaxFullNameLength.value
}
fun emailLengthValidation(email: String): Boolean{
    return  email.length >= NumberConstants.MinEmailLength.value && email.length <= NumberConstants.MaxEmailLength.value
}
fun passwordLenthValidation(password: String): Boolean{
    return  password.length >= NumberConstants.MinPasswordLenght.value && password.length <= NumberConstants.MaxPasswordLenght.value
}

