package edu.iesam.examaad1eval.features.data

import edu.iesam.examaad1eval.features.data.local.LocalEx1DataRepository
import edu.iesam.examaad1eval.features.data.remote.RemoteEx1DataRepository
import edu.iesam.examaad1eval.features.ex1.Item
import edu.iesam.examaad1eval.features.ex1.Services
import edu.iesam.examaad1eval.features.ex1.User

class Ex1DataRepository(
    private val localEx1DataRepository: LocalEx1DataRepository,
    private val remoteEx1DataRepository: RemoteEx1DataRepository

) {

    fun getUser(): List<User> {
        val users = localEx1DataRepository.getUsers()
        if (users.isEmpty()) {
            remoteEx1DataRepository.getUsers()
            addUser(users)
            return users
        } else {
            localEx1DataRepository.getUsers()
            return users

        }
    }

    fun getItems(): List<Item> {
        val items = localEx1DataRepository.getItems()
        if (items.isEmpty()) {
            remoteEx1DataRepository.getItems()
            addItem(items)
            return items
        } else {
            localEx1DataRepository.getItems()
            return items

        }
    }

    fun getServices(): List<Services> {
        val services = localEx1DataRepository.getServices()
        if (services.isEmpty()) {
            remoteEx1DataRepository.getServices()
            addServices(services)
            return services
        } else {
            localEx1DataRepository.getServices()
            return services
        }
    }

    fun addItem(item: List<Item>) {
        localEx1DataRepository.addItem(item)

    }
    fun addServices(services: List<Services>) {
        localEx1DataRepository.addServices(services)
    }
    fun addUser(user: List<User>) {
        localEx1DataRepository.addUser(user)
    }
}


