label ep1:
    if _in_replay:
        $ quick_menu = False
        stop music fadeout 2
        #This is important for the chapter selection
        scene black
        with Dissolve(1.5)
        pause 1.0
        ##################
        show prologue_txt zorder 50
        with Dissolve(1.0)
        pause 2.5
        scene black
        with Dissolve(1.0)
        pause 2.5
        play music c1
        pause 1.0
        $ quick_menu = True

    else:
        $ quick_menu = False
        stop music fadeout 2
        #This is important for the chapter selection
        scene black with Dissolve(1.5)
        pause 3.0
        play music c1
        pause 1.0
        $ quick_menu = True


    ############################################################################
    #Debug
    #menu:
    #    "DEBUG: go to credit screen?"
    #    "Yes":
    #        jump credits_screen
    #    "No":
    #        #continue
    #        "Ok"

        #///////////////////////////////////////////////////////////////////////////

    #    python:
    #        try: sys.modules['renpy.error'].report_exception("\nCreated with love by the Takagi VN Development Team.\nhttps://github.com/Takagi-san-VN-Development-Team\nIf you need help with the game or if you want to chat with us, Join us on Discord!\nDiscord link here.")
    #        except: pass

        #///////////////////////////////////////////////////////////////////////////

    ############################################################################


    "bzzzt bzzzzt"

    "I've awakened to my alarm that is screaming so loudly. It screeches on, not caring that I'd rather be asleep, But I suppose today is the day isn't it?"
    "bzzzzt bzzzzzt"
    n "Oh Shut up Already!"
    "I stand up and turn off my loud alarm clock"
    scene bg nishi_room with fade
    "After that I opened the window and a very bright sunrise welcomes me"
    n "So bright!"
    "I tidy up my bed and ready myself  for school"
    "I changed  into my new uniform. It's a little loose but my mom wanted to buy one that I'd have room to grow into."
    "I briefly check the mirror to see that things are in order and then head downstairs."
    "After quickly eating a bowl of Lucky Charms, I head out of the door to go to my new school."

    scene bg streets_day with dissolve

    "My new school is about a 15 minute walk from my house, not very far at all."

    "The Spring sun is slowly warming the world back up and the salty sea breeze greets me."

    "With a confident stride, I start on my way to school, I see a couple students along the way and I recognize a few from my old elementary school but some don't."


    "But up ahead a bit, I spot Kimura, I quicken my pace to catch up to him."

    n "Hey Kimura."

    show kim t1 with ds01

    k "Oh hey [n]. What's up?"

    "This is my friend, Kimura."

    "Kimura has been a friend of mine since around the 3rd grade."

    "We've been around each other for a while and although we aren't as good friends as we could be, I've always known him to be a reliable guy."

    "Right now, Kimura is eating a toast."

    n "Not much, I guess I'm just surprised we're here."

    k "What do you mean?"

    n "Well it feels like just yesterday we were in elementary school"

    "Kimura chuckles" ##

    k "Ehh it's not that weird, Middle school is just the next step you know?"

    n "I guess you're right.."

    "Kimura finished his toast without a second thought."

    "Even though it's our first day at a new school, he seems perfectly relaxed."

    "But I guess that's Kimura for you. He's not one to be easily fazed."

    k "Hmmm..."

    k "I wonder if we'll be in the same class."

    n "Yeah me too."
    "after that we silently continue to walk to our new school"
    scene bg school_gate with dissolve


    "Some time later we finally approached  the school."

    "It's a lot larger than my elementary school and I wonder if more students go here."

    "It's surrounded by a regal-looking stone wall that looks a little too fancy for what it is."


    show handkerchief_g with ds02

    "As I pass through the gate, something on the ground catches my eye."

    n "Huh?"
    hide handkerchief_g with ds01
    "I reach down to pick it up, It's a piece of fabric."

    show handkerchief_on_hand_blank with ds01

    "It's nicely hemmed and given its size, I'd guess it to be a handkerchief."

    hide handkerchief_on_hand_blank with ds01

    "I look around to see if anyone has noticed that it was dropped but most of the students have already passed the gate."

    "I consider shouting to see if I can get the attention of the person who dropped it."

    "But I decided to turn down the idea as it would be a bad first impression to other students."

    "Just thinking about shouting here in front gate making my body shivers out of shame"

    "Turning the handkerchief over, I realize there's a name written on it."

    #show handkerchief_close with ds01
    scene handkerchief_scene with dissolve

    pause 2
    #n "Takagi?"
    "Takagi, huh."
    "Well I guess this handkerchief belongs to someone named Takagi, This school probably has a lost and found so I'll just take it there."
    scene bg school_gate with dissolve


    "But if I bring it right now, I might get late on the first class."

################################################################################

    menu:
        "What should I do?"
        "Deliver to Lost and Found.":
            $ answer = "handkerchief_a"
        "Pick it up and hold into it.":
            $ answer = "handkerchief_b"

################################################################################
    if answer == "handkerchief_a":

        "I decided to pick up the handkerchief and bring it to the lost and found, but I don't know where it is."

        "Well, I would eventually figured out where the lost and found was Once I entered the school"

        "after pondering on what to do, I find my shoe locker and swap to my indoor shoes."


        scene bg corridor with dissolve


        "Searching for the front office was a little difficult but I eventually was able to make my way there."

        n "Uh, excuse me?"

        "An older lady sat at the desk, typing away at the computer. She turned to me after I spoke with a light smile."

        ol "Hello, how can I help you?"

        n "Ah. I uhh… I found this handkerchief."

        ol "Oh is it lost? you can give it to me so I can add it to our lost and found bin."

        "I handed her the handkerchief and she took it to a box a few steps behind her desk"

        ol "Are you a new student as well?"

        n "Yes ma'am."

        ol "Oh then, do you know where your classroom is?"

        "I realized that in my search for the office, I've forgotten to check the board for classroom assignments."

        n "No,  I didn't look at it. I went looking for the office once I found the handkerchief."

        ol "That's fine. Let me look it up for you. What's your name?"

        "I gave her my name and a few seconds later she gave me the room number and some directions on how to get there."

        ol "Good luck with your class! And thanks for bringing the handkerchief here, hopefully we'll find it's owner!"

        n "Thank you for your help as well."

        "I left the office and headed down the hall. Up a flight of stairs and down another hall, I finally came to my homeroom class, 204. I opened the door..."


        scene bg classroom_morning with dissolve


        "Opening the door, there I find everyone already seated properly and the teacher is already in the room explaining something."

        "Everyone got distracted and looked at me. Suddenly, I became the center of attention."

        "This is bad, It looks like I'm the only person coming late on the first day of class. This would leave a bad impression on everyone."

        "And our home room teacher is a scary looking guy, this is really bad..."

        show tnb t1 with ds01
        utchr "You've got some guts showing up late for the first day of class, I'd give you that."

        n "No, I uh--"

        utchr "What's your name?"

        n "I am [n], sir."

        utchr "Very well, Go sit down, [n]."
        hide tnb t1 with ds01

        "I turned around and looked for a vacant seat."

        "I found one and it's in the front seat near the teacher."

        "I sit there quickly trying not to create anymore attention. But everyone's attention is still on me and they started mumbling now."

        "I have to clear up my name somehow before everyone remembers me as the late guy."

        na "The teacher stood up and continued where he left off."
        # TODO MARK AS STARTING POINT
        show tnb t1 with ds01
        utchr "Good morning Everyone, I am Mr. Tanabe, you will refer to me as Tanabe-Sensei, and I will be your Adviser and your Home room teacher as well. Is that Clear?"
        hide tnb t1 with ds01
        ev "Yes, sir."
        show tnb t1 with ds01
        tchr "Well, I don't want to start the year with a long speech, I will try to make it short, so let's get this over with."

        tchr "First of all, I won't force you all to get along, but try to get things work and try not to create any misunderstandings."

        tchr "And if you need help with something don't hesitate to ask for help, either to me or your classmates, whichever you're comfortable with."

        tchr "Do I make myself clear?"
        hide tnb t1 with ds01
        ev "Yes, sir."
        show tnb t1 with ds01
        tchr "Very well, We're heading to gymnasium now for your ceremony, lets-"
        #Before the teacher finished his sentence,
        hide tnb t1 with ds01
        "Someone knocks on the sliding door, cutting the speech of Tanabe-Sensei."

        "It was an old man, he looks like a part of the faculty."

        "It must be something important but I can't hear what they're saying."

        pause 1

        "The old man left and closed the door. Tanabe-sensei proceeds to announce something."
        show tnb t1 with ds01
        tchr "Alright everyone change of plans, Looks like the ceremony is behind the schedule."

        tchr "While waiting for the Principal's Announcement, We're going to figure out your seating arrangements."

        tchr "That being said, pick a paper inside the box and sit according to the number you picked."

        tchr "The number arrangement is in the black board use it as your guide, sit according to it."
        hide tnb t1 with ds01
        ev "Yes, sir." ## Is actually a student

        "Everyone picked a paper inside the box, and sat according to the guide on the blackboard."

        "I picked one up too, but I ended up at the very back..."

        "It sucks I ended up here, I'm far from the blackboard."


        "While my classmates are still looking for their respective seats, Tanabe Sensei interrupted us stating that It's time to go to the gymnasium and we can continue later what we left off."

        "We left our bags in the room and made our way to the gymnasium."

        scene bg school_gymnasium with dissolve


        "We've arrived at the Gymnasium."

        "I have to be honest, It's bigger than I thought!"

        #"The gymnasium is so big it kind of makes me want to have fun."

        #"..."

        #"When it's P.E. at least."

        "There's a lot of other students from different classrooms as well, and inside the gymnasium there's folding chairs arranged facing the stage."

        "We sat there and waited for the principal to start the speech."

        #"And when the principal arrived he made a very long speech."

        "The speech was very long and there's nothing really interesting to point out about the speech."

        "It's just talking about {i}congratulating us for making it in middle school{/i}, that it's a {i}step up{/i} and our parents should be proud. Stuff like that."

        "And it seems like it's not going to end anytime soon, this is going to take a while."
        pause 1
        scene black with dissolve
        $ quick_menu = False
        stop music fadeout 1
        pause 3
        $ quick_menu = True
        scene bg school_gymnasium with dissolve

        play music c1_2

        "The speech lasted for hours, I saw some of my classmates look drowsy and almost fell asleep listening to the principal."

        "But the speech has finally ended with the principal's final remarks."

        "After the long ceremony, we head back again to our classrooms and continue where we left off."

        scene bg classroom_morning with dissolve


        "We finished the seating arrangements and the teacher dismissed us early."

        "And now, I think it's lunch break."

        "I opened my bag and got my bento and opened it."

        "And I'm having a burger today! this is going to be delicious!"

        "I dig in to my lunch, some of the guys came and talked to me about what happened earlier."

        utchr "Man, you've got some guts coming late in the first day of class."

        n "No you've misunderstood, I didn't mean to come late, I wa--"

        utchr "I'm Nakai, and This is Takao, It's nice to meet you."

        n "Oh I'm [n], It's nice to meet you as well."

        nka "Do you mind eating together with Takao?"

        n "Sure..."

        "We ate our lunch together and talked, got to know each other."

        "I tried to clear things up, but I didn't get the chance to."

        "But at least I made some friends, that lessens my problem with my already bad impression."


        nka "Ah~ I'm stuffed, that was a good meal! We'll see you later [n]!"

        "I wave them goodbye, thinking that it's a waste that I didn't have the chance to explain what really happened."

        "With a sigh, I stared outside the window to merely pass time."

        "Also because I don't have a phone yet."

        "while having a glance around the room, I accidentally meet eyes with my seatmate"

        show tk spksmile with ds01

        "She gave me a light smile and started talking to me."

        show tk crs1 with ds02

        pchar "Hey, why were you late today?"

        pchar "Is it because you sleep in?"

        n "No! it's not that..."

        n "It's nothing interesting really, It's just because of that {i}Takagi{/i} person."

        pchar "eh?"

        hide tk crs1 with ds01

        "The door slides open and Tanabe-sensei is here, it seems our lunch break is over."
        show tnb t1 with ds01
        tchr "Alright everyone, Today's subject is English. Get your English notebook and English Textbook."
        hide tnb t1 with ds01
        "We go back to our seats and get the notebook and textbook."

        "But before Tanabe-sensei started the class, my seatmate stood up and raised her hand."

        pchar "Sensei, may I go out?"

        show tnb t1 with ds01

        tchr "Yes you may, Hurry up and don't get left behind of the lesson."

        hide tnb t1 with ds01

        pchar "Yes, sir."

        "She slid the door open and closed it in a hurry..."

        show tnb t1 with ds01

        tchr "Open your textbooks to Page 5, and you [n], please read the first paragraph."

        hide tnb t1 with ds01

        n "Ah, yes sir."

        "I opened the textbook and read the 1st paragraph of page 5."

        "The lesson continued on and Tanabe-sensei made us do a couple more recitations."

        "But it seems my seatmate hasn't come back yet."

        #"I wonder what's taking her so long?"

        pause 1

        "She took a while but she has finally returned."

        #"We're already in the middle of the lesson, she have so many to catch up on."

        #"I'm going to ask her what took her so long in low voice so it doesn't distract anyone."

        n "Hey, what took you so long? You have so much to catch up on."

        show tk crs1 with ds01

        pchar "Hmm?"

        show tk spk with ds01

        pchar "Oh it's nothing. I just have to get something."

        show tk spksmile with ds01

        pchar "..."

        show tk spk with ds01

        pchar "Hey, do you want to play a game right now? A guessing game?"

        show tk spksmile with ds01

        "...?"

        n "I mean I'm fine with games, but we're in the middle of the class..."

        "After pondering a bit, I finally gave in."

        n "So, What are you going to guess about?"

        show tk lean_speak with ds01

        pchar "I'm going to guess why you were late today, If I guessed it right I win."

        show tk lean_smile with ds01

        "Hmm... That's interesting."

        n "Fine then, What's your guess?"

        show tk spk with ds01

        pchar "You found a lost item and you picked it up and delivered it to the lost and found."
        #The reason why you're late is that, you found a handkerchief in the ground and you pick it up and delivered it to the lost and found, but you got lost as well looking for it

        show tk spksmile with ds01

        n "EH?!"

        hide tk spksmile with ds01

        show tnb t1 with ds01

        tchr "Oi, [n] keep your voice down."

        hide tnb t1 with ds01

        n "I-I'm sorry!"

        #"She bursts into laughter and hides her face in the desk."

        #na "Embarrassed again from my actions, I'm going to lower my voice from now on."

        #"I'm still taken by surprise on how she flawlessly guessed why I'm late."

        pause 1

        "wait a second..."

        n "Wait, How did you know?"

        #n "Did you saw me picking it up in the gate?"

        ## Show scene from takagi san anime.
        #Takagi san holding her handkerchief and showing to the viewer / Player.
        # TODO 500 play something magically romantic here.

        show tk lean_speak with ds01

        pchar "ah."
        stop music fadeout 2
        pchar "I wonder how..."
        $ quick_menu = False
        show bg b_classroom with ds02
        play music c1_3
        show tk lean_smile with ds01
        show handkerchief_close_fadein
        pause 3

        $ quick_menu = True

        n "eh??"

        hide handkerchief_close_fadein with ds01

        n "Y-you're that Takagi person??"

        na "She nodded yes in response."


        hide tk lean smile with ds01
        scene bg classroom_morning with dissolve



        t "You weren't at the self-introduction."
        t "So that's probably the reason why you don't know my name."

        "..."

        "Wah, This is embarrassing!"

        "I didn't know she was the owner! and I think I explained my reason to her in an angry tone!"

        "I hope she doesn't hate me."

        n "waaah..."

        #na "I recoil from sudden realization and embarrassment."

        t "pft.."

        show tk lol with ds01

        t "Ahahaha!"

        t "What's with that reaction??"

        t "It's more than I expected, Hahaha!"

        hide tk lol with ds01

        show tnb t1 with ds01
        tchr "You there at the back, Keep it down you two."
        hide tnb t1 with ds01

        n "Sorry!"
        t "Sorry!"

        pause 2
        show tk lean_speak with ds01
        t "Thanks for picking it up."
        #show tk talking_closed_eyes with ds01
        t "I'm Takagi, owner of this handkerchief, It's nice to meet you."
        show tk lean_smile with ds01
        n "Nice to meet you... too."
        hide tk lean_smile with ds01
        "After talking with Takagi-san. I focused on Tanabe-sensei's lesson."
        "We have so much to catch up on."
        $ quick_menu = False

        # TODO 522 Change music here

        scene bg s_classroom with Dissolve(5)


        $ quick_menu = True
        tchr "That wraps up for today. Class dismissed."
        tchr "One last thing, don't get giddy up because you're in middle school now, don't take detours and head straight home."
        ev "Yes, sir."
        "Tanabe-sensei left the room, And I packed my things up and get ready to go home too."
        "Everyone also gets their stuff packed up and heads home."
        "But there's still some people left in the room having conversation."
        "Takagi-san is about to head out soon too."
        show tk spk with ds01
        t "Thanks again for picking up my handkerchief."
        t "See you Tomorrow, [n]."
        show tk spksmile with ds01
        n "Ah, see you Tomorrow too."
        stop music fadeout 3
        $ quick_menu = False
        scene black with Dissolve(3)



        ## working on
        #jump empty_cans
        #return


################################################################################

    elif answer == "handkerchief_b":
        "I guess I'll hang into it for now."
        "If I go to the lost and found right now I might get late on class."
        "I'll deliver it to the lost and found after class."
        "I picked up the handkerchief and put it in my bag."

        scene bg inside school_gate with dissolve

        "I walked inside the school, and took a look in the board listing of classroom assignments."
        "There are also a crowd of other students looking for their assigned classrooms as well."
        "So Looking for my assigned classroom was a bit challenging."
        "But I eventually found it."
        #"Once I entered the school, I had to find my shoe locker and swap to my indoor shoes."
        "I changed my shoes into the indoor ones, and look for my room, if my guess is right my room should be on the second floor."
        ## make scene here that mc bumped with takagi san / opened the door at the same time with takagi san
        scene bg corridor with dissolve

        "Up a flight of stairs and down another hall, I finally came to my homeroom class, 204."
        "As I was about to open the door, I almost touched hands with someone who was about to open the door as well."
        n "Ah- sorry!"
        show tk spk with ds01
        t "Ah- no it's fine."
        #n "Go ahead."
        hide tk spk with ds01

        #insert takagi san here opening the door too.
        #something like "oh hi" then she smiles.
        #then player recoils.

        "I opened the door, and let her in first."
        scene bg classroom_morning with dissolve

        "It seems the teacher is still not inside the room."

        "And there's still plenty of seats that are still vacant, I picked one in the middle left-most seat."

        "Some time later, everyone is in the room, and our teacher has come."

        utchr "Good morning Everyone, I am Mr. Tanabe, you will refer to me as Tanabe-sensei, and I will be your Adviser and your Home room teacher as well. Is that Clear?"

        ev "Yes, sir."

        tchr "Well, I don't want to start the year with a long speech, I will try to make it short, so let's get this over with."

        tchr "First of all, I won't force you all to get along, but try to get things work and try not to create any misunderstandings."

        tchr "And if you need help with something don't hesitate to ask for help, either with me or your classmates, whichever you're comfortable with."

        tchr "Do I make myself clear?"

        ev "Yes, sir."

        tchr "That being said, now it's your turn to introduce yourselves to me and your classmates."

        tchr "We'll start with you, at the far right corner."

        utchr "Yes sir."

        "Everyone gets to introduce themselves, I saw kimura standing up and introduced himself too. It's a relief that we're classmates."

        "Then the girl I met earlier gets her turn."

        show tk eyes_open_talking with ds01

        pchar "Hello, I'm Takagi, My name is spelled like \"Tall Tree\" and my hobby is reading books. It's nice to meet you all."

        hide tk eyes_open_talking with ds01

        "Wait..."

        "Her name is Takagi?"

        "Does that mean-"

        tchr "That's about all of you, We're heading to gymnasium now for your ceremony, let's go."

        "We left our bags in the room and headed to the gymnasium."

        scene bg school_gymnasium with dissolve


        "After some walk outside the school building, we reached the Gymnasium."

        "I have to be honest, It's bigger than I thought!"

        "There's a lot of other students from different classrooms as well, and inside the gymnasium there's folding chairs arranged facing the stage."

        "We sat there and waited for the principal to start the speech."

        "The speech was very long and there's nothing really interesting to point out about the speech."

        "It's just talking about \"congratulating us for making it in middle school\", and that it's a \"step up\". Stuff like that."

        "And it seems it's not going to end anytime soon, this is going to take a while."
        "..."
        scene black with dissolve
        $ quick_menu = False
        stop music fadeout 1
        pause 3
        $ quick_menu = True
        scene bg school_gymnasium with dissolve

        play music c1_2

        "The speech lasted for hours, I saw some of my classmates look drowsy and almost asleep listening to the principal."

        "But the speech has finally ended with the principal's final remarks."

        "After the long ceremony, we head back again to our classrooms."

        scene bg classroom_morning with dissolve

        pause 1
        tchr "Hmmm..."
        tchr "Since we still have plenty of time left before lunch break."

        tchr "Alright, we're going to figure out your seating arrangements."

        tchr "Everyone, pick a paper inside the box and sit according to the number you picked."

        tchr "The number arrangement is in the black board use it as your guide, sit according to it."

        ev "Yes, sir."

        #na "The rotation in picking up a paper started at the front right."

        "Everyone picked a paper inside the box, and sat according to the guide on the blackboard."
        "I picked one up too, but I ended up at the very back..."
        "Which doesn't benefit me at all."
        "It's far from the black board, and there's no one in the back of me."
        "And to make it worse... my seatmate is a girl."
        pause 1
        "wait..."
        "It's Takagi-san!"
        "Could she be the owner of this handkerchief?"
        "Should I ask her now? It's a bit embarrassing to ask her about the handkerchief, and it might not be hers in the first place."
        "Should I ask her right now or should I just bring it to the lost and found later after class?"

        menu:
            "What should I do?"
            "Ask her anyway.":
                $ answer = "Asking Takagi for handkerchief"

            "Just bring it to Lost and found.":
                $ answer = "Just bring it to Lost and found"

            "Just bring it to Lost and found. DEBUG(Encounter)":
                $ answer = "Just bring it to Lost and found DEBUG"

    if answer == "Asking Takagi for handkerchief":
        "Hmm... Asking her about the handkerchief won't hurt."
        "Plus if it's hers, it's going to save me trouble going to the lost and found."
        "I'll ask her about the handkerchief during lunch break."
        pause 1
        tchr "That's about it. Class dismissed, I'll see you all later."
        "Now's my chance."
        n "Um... Hey."
        #show takagi here
        pchar "?"
        pchar "Oh hello, Do you need something?"
        #TODO Line 687
        n "Ah-, I just wanted to ask if you happen to be the owner of this handkerchief."
        #takagi surprised / takagi pog
        #takagi checks her bag and her pocket
        "Oh thank you! where did you find it?"
        n "I found it lying on the ground at the front gate, I was planning to deliver it to the lost and found office."
        n "But when I learned your name, I assumed it is yours since the name written on the handkerchief is the same as yours."
        #takagi ehe, thanks for picking it up.
        #show takagi happy
        show tk lean_speak with ds01
        t "Thanks for picking it up."
        #show tk talking_closed_eyes with ds01
        t "I'm Takagi, the owner of this handkerchief, It's nice to meet you."
        show tk lean_smile with ds01
        n "Nice to meet you... too."
        hide tk lean_smile with ds01



    elif answer == "Just bring it to Lost and found":
        "No, I should just deliver it to Lost and found during lunch break ."
        "It might be rude to ask her out of nowhere too."
        "There's also the possibility that she is not the owner of this handkerchief"
        tchr"And I guess that's all for today, Alright it's almost lunch time, I'll dismiss the class early just this once. I'll see you all later."
        "Tanabe-sensei left the room."
        "Now's the time."
        "I grabbed the handkerchief from my bag and put it in my pocket."
        scene bg corridor with dissolve


        "Searching for the front office was a little difficult but I eventually was able to make my way there."

        n "Uh, excuse me?"

        "An older lady sat at the desk, typing away at the computer. She turned to me after I spoke with a light smile."

        ol "Hello, how can I help you?"

        n "Ah. I uhh… I found this handkerchief."

        ol "Oh is it lost? If you give it to me I can add it to our lost and found bin."

        "I handed her the handkerchief and she took it to a box a few steps behind her desk"

        "thanks for bringing the handkerchief here, hopefully we'll find it's owner!"

        n "Thank you for your help as well."

        "I left the office and returned to my classroom."

        scene bg classroom_morning with dissolve


        "I opened my bag and took out my bento."
        "Today I'm having a burger! It's one of my favorites."
        "I did a good deed and my lunch is delicious"
        "Today might be a good day....... I think.."


    elif answer == "Just bring it to Lost and found DEBUG":
        "placeholder for bringing lost and found DEBUG"

    python:
                persistent.ep4_progress = True
                renpy.save_persistent()

    if _in_replay:
        $ renpy.end_replay()
    else:
        jump glico
    return
$
