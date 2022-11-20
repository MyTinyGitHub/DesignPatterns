package stateAndProxyPattern.protectionProxy

import stateAndProxyPattern.protectionProxy.person.Person
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class OwnerInvocationHandler(private val person: Person) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        if (method != null) {
            if(method.name.startsWith("get")) {
                return if (args == null) {
                    method.invoke(person)
                } else {
                    method.invoke(person, *args);
                }
            } else if(method.name.equals("setGeekRating")) {
                throw IllegalAccessError();
            } else if(method.name.startsWith("set")) {
                return if(args == null) {
                    method.invoke(person)
                } else {
                    method.invoke(person, *args)
                }
            }
        }
        return null;
    }
}