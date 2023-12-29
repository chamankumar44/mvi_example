package com.gaur.mviexampleyt.ui.main.viewmodel

import com.gaur.mviexampleyt.data.model.FakeDTO
import com.gaur.mviexampleyt.data.repository.GetUserRepository
import com.gaur.mviexampleyt.ui.main.intent.MainIntent
import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class MainViewModelTest {


    private lateinit var repository: GetUserRepository

    private lateinit var viewModel: MainViewModel
    @Before
     fun setUp() {
//        Mockito.`when`(repository.getPosts()).thenReturn(Single.just(listOf<FakeDTO>()))

    }

    suspend fun getData(){
        val async = GlobalScope.async {
            viewModel.mainIntent.send(MainIntent.GetPosts)
        }
        async.await()

    }


    @Test
    fun fetchPosts() {

        runBlocking {
            val toString = getData().toString()
            Assert.assertEquals(false,toString.isBlank())
        }

    }
}