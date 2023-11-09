package day14_1

import java.util.UUID

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType):Entity {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 1f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id:String, val name:String):Entity()
    data class Medium(val id:String, val name:String):Entity()
    data class Hard(val id:String, val name:String, val multiplier:Float):Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class: $id")
}

val Entity.Medium.info: String
    get() = "some info"

fun test() {
    val thing:Entity = Entity.Easy("id", "name")
    val thing2:Entity = Entity.Easy("id", "name")
    val msg = when (thing) {
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "hard class"
        Entity.Help -> "help class"
        is Entity.Medium -> "medium class"
    }
    println(msg)

    val thing3 = EntityFactory.create(EntityType.MEDIUM)
    if (thing3 is Entity.Medium) {
        thing3.printInfo()
        println(thing3.info)
    }

    if (thing == thing2) {
        println("They are equal!")
    } else {
        println("They are not equal!")
    }
}