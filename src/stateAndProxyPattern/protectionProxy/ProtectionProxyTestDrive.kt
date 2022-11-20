package stateAndProxyPattern.protectionProxy

import stateAndProxyPattern.protectionProxy.person.Person
import stateAndProxyPattern.protectionProxy.person.PersonImpl
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
    var personJoe = PersonImpl("Joe", "Male", "Programming");

    var proxyNonOwnerJoe = getProxy(personJoe, NonOwnerInvocationHandler(personJoe))
    var proxyOwnerJoe = getProxy(personJoe, OwnerInvocationHandler(personJoe))

    println("Name is ${proxyOwnerJoe.getName()}")

    proxyOwnerJoe.setInterests("Bowling, Go")
    println("Interests set from owner proxy")

    try {
        proxyOwnerJoe.setGeekRating(10);
    } catch (e : IllegalAccessError) {
        println("Cannot set the Geek Rating from owner Proxy")
    }

    println("Rating is ${proxyOwnerJoe.getGeekRating()}")

    println("\nName is ${proxyNonOwnerJoe.getName()}")

    try {
        proxyNonOwnerJoe.setInterests("Cars")
    } catch (e : IllegalAccessError) {
        println("Cannot set interests from nonOwner proxy")
    }

    proxyNonOwnerJoe.setGeekRating(10);
    println("Rating set from non owner proxy")
    println("Rating is ${proxyNonOwnerJoe.getGeekRating()}")
}

fun getProxy(person: Person, invocationHandler: InvocationHandler) : Person {
    return Proxy.newProxyInstance(person.javaClass.classLoader,person.javaClass.interfaces, invocationHandler) as Person;
}