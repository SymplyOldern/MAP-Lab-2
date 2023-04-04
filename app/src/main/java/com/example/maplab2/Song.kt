package com.example.maplab2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Song(
    val name: String,
    val lyrics: String,
    val imageId: Int,
) : Parcelable

fun createSongs(): List<Song> {
    return listOf(
        Song(
            "Depeche Mode - Halo",
            "You wear guilt\n" +
                    "Like shackles on your feet\n" +
                    "Like a halo in reverse\n" +
                    "I can feel\n" +
                    "The discomfort in your seat\n" +
                    "And in your head, it's worse\n" +
                    "\n" +
                    "There's a pain\n" +
                    "A famine in your heart\n" +
                    "An aching to be free\n" +
                    "Can't you see?\n" +
                    "All love's luxuries\n" +
                    "Are here for you and me\n" +
                    "\n" +
                    "And when our worlds they fall apart\n" +
                    "When the walls come tumbling in\n" +
                    "Though we may deserve it\n" +
                    "It will be worth it\n" +
                    "\n" +
                    "Bring your chains\n" +
                    "Your lips of tragedy\n" +
                    "And fall into my arms\n" +
                    "\n" +
                    "And when our worlds they fall apart\n" +
                    "When the walls come tumbling in\n" +
                    "Though we may deserve it\n" +
                    "It will be worth it\n" +
                    "\n" +
                    "And when our worlds they fall apart\n" +
                    "When the walls come tumbling in\n" +
                    "Though we may deserve it\n" +
                    "It will be worth it\n" +
                    "\n" +
                    "And when our worlds they fall apart\n" +
                    "When the walls come tumbling in\n" +
                    "Though we may deserve it\n" +
                    "It will be worth it\n" +
                    "\n" +
                    "And when our worlds they fall apart\n" +
                    "When the walls come tumbling in\n" +
                    "Though we may deserve it\n" +
                    "It will be worth it",
            R.drawable.depeche_mode__violator
        ),
        Song(
            "Один в каное - Демони",
            "Де вони, де вони\n" +
                    "Тихі добрі слуги світлої моєї сторони?\n" +
                    "Де ви, де ви?\n" +
                    "Знаєте, мене обсіли леви\n" +
                    "Знаєте, тут\n" +
                    "Де я замітала — виступив бруд!\n" +
                    "\n" +
                    "Де мої слуги? Де мої факіри?\n" +
                    "Де мої змії? Де мої шкіри?\n" +
                    "Демони-кати, демони-звірі\n" +
                    "Де вони, де вони засіли?\n" +
                    "Де вони засіли?\n" +
                    "\n" +
                    "Де я, де я?\n" +
                    "І куди пішла моя остання фея?\n" +
                    "Хто тут, хто тут?\n" +
                    "Вір або не вір\n" +
                    "В моїй голові віддає накази звір!\n" +
                    "\n" +
                    "Де мої слуги? Де мої факіри?\n" +
                    "Де мої змії? Де мої шкіри?\n" +
                    "Демони-кати, демони-звірі\n" +
                    "Де вони, де вони засіли?\n" +
                    "Де вони засіли?\n" +
                    "\n" +
                    "Де мої слуги? Де мої факіри?\n" +
                    "Де мої змії? Де мої шкіри?\n" +
                    "Демони-кати, демони-звірі\n" +
                    "Де вони, де вони?\n" +
                    "\n" +
                    "Де мої слуги? Де мої факіри?\n" +
                    "Де мої змії? Де мої шкіри?\n" +
                    "Демони-кати, демони-звірі\n" +
                    "Де вони, де?\n" +
                    "\n" +
                    "Де мої слуги? Де мої факіри?\n" +
                    "Де мої змії? Де мої шкіри?\n" +
                    "Демони-кати, демони-звірі\n" +
                    "Де вони, де вони засіли?\n" +
                    "Де вони засіли?\n" +
                    "Де вони?",
            R.drawable.odyn_v_kanoe__odyn_v_kanoe
        ),
        Song(
            "Metallica - Wherever I May Roam",
            "And the road becomes my bride\n" +
                    "I have stripped of all but pride\n" +
                    "So in her I do confide\n" +
                    "And she keeps me satisfied\n" +
                    "Gives me all I need\n" +
                    "And with dust in throat I crave\n" +
                    "Only knowledge will I save\n" +
                    "To this game you stay a slave\n" +
                    "\n" +
                    "Rover, wanderer\n" +
                    "Nomad, vagabond\n" +
                    "Call me what you will\n" +
                    "\n" +
                    "But I'll take my time anywhere\n" +
                    "Free to speak my mind anywhere\n" +
                    "Never find anywhere\n" +
                    "Anywhere I may roam\n" +
                    "Where I lay my head is home\n" +
                    "\n" +
                    "And the earth becomes my throne\n" +
                    "I adapt to the unknown\n" +
                    "Under wandering stars I've grown\n" +
                    "By myself but not alone\n" +
                    "I ask no one\n" +
                    "And my ties are severed clean\n" +
                    "The less I have the more I gain\n" +
                    "Off the beaten path I reign\n" +
                    "\n" +
                    "Rover wanderer\n" +
                    "Nomad vagabond\n" +
                    "Call me what you will\n" +
                    "\n" +
                    "But I'll take my time anywhere\n" +
                    "I'm free to speak my mind anywhere\n" +
                    "Nevermind anywhere\n" +
                    "Anywhere I may roam\n" +
                    "Where I lay my head is home\n" +
                    "\n" +
                    "But I'll take my time anywhere\n" +
                    "Free to speak my mind\n" +
                    "Nevemind anywhere\n" +
                    "Anywhere I may roam\n" +
                    "Where I lay my head is home (fuck yeah)\n" +
                    "\n" +
                    "But I'll take my time anywhere\n" +
                    "Free to speak my mind anywhere\n" +
                    "Nevemind anywhere\n" +
                    "Anywhere I may roam\n" +
                    "Where I lay my head is home\n" +
                    "\n" +
                    "Carved upon my stone\n" +
                    "My body lie, but still I roam yeah yeah\n" +
                    "\n" +
                    "Wherever I may roam\n" +
                    "Wherever I may roam\n" +
                    "Wherever I may roam\n" +
                    "Wherever I may wander\n" +
                    "(Wander, wander)\n" +
                    "Wherever I may roam (yeah yeah yeah)",
            R.drawable.metallica__metallica
        ),
        Song(
            "Depeche Mode - Wrong",
            "Wrong\n" +
                    "Wrong\n" +
                    "Wrong\n" +
                    "Wrong\n" +
                    "\n" +
                    "I was born with the wrong sign\n" +
                    "In the wrong house\n" +
                    "With the wrong ascendancy\n" +
                    "I took the wrong road\n" +
                    "That led to the wrong tendencies\n" +
                    "I was in the wrong place at the wrong time\n" +
                    "For the wrong reason and the wrong rhyme\n" +
                    "On the wrong day of the wrong week\n" +
                    "I used the wrong method with the wrong technique\n" +
                    "\n" +
                    "Wrong\n" +
                    "Wrong\n" +
                    "\n" +
                    "There's something wrong with me chemically\n" +
                    "Something wrong with me inherently\n" +
                    "The wrong mix in the wrong genes\n" +
                    "I reached the wrong ends by the wrong means\n" +
                    "It was the wrong plan\n" +
                    "In the wrong hands\n" +
                    "With the wrong theory for the wrong man\n" +
                    "The wrong lies, on the wrong vibes\n" +
                    "The wrong questions with the wrong replies\n" +
                    "\n" +
                    "Wrong\n" +
                    "Wrong\n" +
                    "\n" +
                    "I was marching to the wrong drum\n" +
                    "With the wrong scum\n" +
                    "Pissing out the wrong energy\n" +
                    "Using all the wrong lines\n" +
                    "And the wrong signs\n" +
                    "With the wrong intensity\n" +
                    "I was on the wrong page of the wrong book\n" +
                    "With the wrong rendition of the wrong hook\n" +
                    "Made the wrong move, every wrong night\n" +
                    "With the wrong tune played 'til it sounded right, yeah\n" +
                    "\n" +
                    "Wrong\n" +
                    "Wrong\n" +
                    "Too long\n" +
                    "Wrong\n" +
                    "Too long\n" +
                    "Wrong\n" +
                    "Too long\n" +
                    "Wrong\n" +
                    "Too long\n" +
                    "Wrong\n" +
                    "Too long\n" +
                    "\n" +
                    "I was born with the wrong sign (wrong)\n" +
                    "In the wrong house\n" +
                    "With the wrong ascendancy (too long)\n" +
                    "I took the wrong road (wrong)\n" +
                    "That led to the wrong tendencies (too long)\n" +
                    "I was in the wrong place at the wrong time (wrong)\n" +
                    "For the wrong reason and the wrong rhyme (too long)\n" +
                    "On the wrong day of the wrong week (wrong)\n" +
                    "I used the wrong method with the wrong technique\n" +
                    "Wrong",
            R.drawable.depeche_mode__sounds_of_the_universe
        ),
        Song(
            "Gnarls Barkley - Crazy",
            "I remember when\n" +
                    "I remember, I remember when I lost my mind\n" +
                    "There was something so pleasant about that place\n" +
                    "Even your emotions have an echo in so much space\n" +
                    "\n" +
                    "And when you're out there without care\n" +
                    "Yeah, I was out of touch\n" +
                    "But it wasn't because I didn't know enough\n" +
                    "I just knew too much\n" +
                    "\n" +
                    "Does that make me crazy?\n" +
                    "Does that make me crazy?\n" +
                    "Does that make me crazy?\n" +
                    "Possibly\n" +
                    "\n" +
                    "And I hope that you are having the time of your life\n" +
                    "But think twice, that's my only advice\n" +
                    "Come on now, who do you, who do you, who do you\n" +
                    "Who do you think you are\n" +
                    "Ha ha ha, bless your soul\n" +
                    "You really think you're in control\n" +
                    "\n" +
                    "I think you're crazy\n" +
                    "I think you're crazy\n" +
                    "I think you're crazy\n" +
                    "Just like me\n" +
                    "\n" +
                    "My heroes had the heart to lose their lives out on the limb\n" +
                    "And all I remember is thinking I want to be like them\n" +
                    "\n" +
                    "Ever since I was little\n" +
                    "Ever since I was little it looked like fun\n" +
                    "And it's no coincidence I've come\n" +
                    "And I can die when I'm done\n" +
                    "\n" +
                    "But maybe I'm crazy\n" +
                    "Maybe you're crazy\n" +
                    "Maybe we're crazy\n" +
                    "Probably",
            R.drawable.gnarls_barkley__st_elsewhere
        )
    )
}