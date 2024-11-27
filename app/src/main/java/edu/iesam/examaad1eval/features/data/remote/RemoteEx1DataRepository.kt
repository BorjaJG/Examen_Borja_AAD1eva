package edu.iesam.examaad1eval.features.data.remote

import edu.iesam.examaad1eval.features.ex1.Item
import edu.iesam.examaad1eval.features.ex1.MockEx1RemoteDataSource
import edu.iesam.examaad1eval.features.ex1.Services
import edu.iesam.examaad1eval.features.ex1.User

class RemoteEx1DataRepository {

    private val remoteDataSource = MockEx1RemoteDataSource()

    fun getUsers(): List<User> {
        return remoteDataSource.getUsers()
    }

    fun getItems(): List<Item> {
        return remoteDataSource.getItems()
    }

    fun getServices(): List<Services> {
        return remoteDataSource.getServices()
    }


}