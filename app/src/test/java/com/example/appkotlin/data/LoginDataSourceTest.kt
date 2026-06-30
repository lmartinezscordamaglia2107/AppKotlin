package com.example.appkotlin.data

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class LoginDataSourceTest {

    private lateinit var loginDataSource: LoginDataSource

    @Before
    fun setUp() {
        loginDataSource = LoginDataSource()
    }

    @Test
    fun login_withValidCredentials_returnsSuccess() {
        val result = loginDataSource.login("test@example.com", "password")

        assertTrue(result is Result.Success)
        val successResult = result as Result.Success
        assertTrue(successResult.data.displayName == "Jane Doe")
    }

    @Test
    fun logout_doesNotThrowException() {
        loginDataSource.logout()
        // No assertion needed if we just want to ensure it doesn't crash, 
        // or we could check internal state if it had any.
    }
}
