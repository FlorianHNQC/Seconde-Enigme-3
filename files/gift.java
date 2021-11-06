label bday_gift:
    stop music fadeout 2
    #This is important for the chapter selection
    scene black
    with Dissolve(1.5)
    pause 1.0
    ##################
    show gift_txt zorder 50
    with Dissolve(1.5)
    pause 3.0
    scene black
    with Dissolve(1.5)
    pause 2.0

    play music c1
    scene bg nishi_room with fade
    "Today is ordinary as ever."
    "I spent most of my time reading some Manga and playing some games today since there's nothing to do today."
    "I'm getting hungry."
    "Maybe I'll go and get something to eat from the kitchen."
    "I head down stairs and opened the refrigerator."
    ##Kitchen
    scene bg kitchen with dissolve
    "While looking for something to eat"
    "I suddenly have a feeling that I'm missing something..."
    "Like there must be something important today."
    "..."
    "Come to think of it..."
    "I just realized today is {b}Takagi's Birthday{/b}!"
    "What should I do?!"
    "I have no gift for Takagi-san!"
    na "While I'm panicking of what to give to Takagi-san, Mom called me."
    mom "[n], sweety! come over here."
    n "Yes, Mom?"
    mom "Do you already have gift to give for Takagi-chan?"
    n "No, I don't."
    n "I don't know what to get for her..."
    mom "Why don't you give her your new Set-top Box?"
    n "What?? b-but you bought it for me!"
    mom "Come on now, don't be greedy!"
    mom "Don't you want her to be happy?"
    "Do I really have to give it to her?? Mom just recently bought it for me."
    "But I still don't have a gift for Takagi-san."
    "..."
    n "You're right mom, I'm gonna pack it."
    na "'Mom smiled at me and said'"
    mom "Good boy, now go hurry up or you'll be late!"
    "I head back upstairs and go to my room."
    scene bg nishi_room with dissolve
    "I started to wrap up the set-up box and put it into a nice giftwrap, and I decided to write a short birthday greetings for her."
    "While I am wrapping up the gift, I heard my phone ringing."
    n "Who might that be?"
    "I checked the phone for who might be calling me."
    "I checked my phone and answered the call."
    "..."
    t "Hello, [n]."
    "eh?"
    n "Takagi-san? W-why are you calling me?"
    t "No reason in particular, just checking in if you remember something {i}important{/i} today."
    n "Eh~ is that so?"
    n "I think I'm not forgetting anything today."
    t "Hmm~ I see. I'll be seeing you, I will be waiting for you and your funny reactions." # Consider rework.
    "*beep*"
    "Grrr... I know it's her birthday today, I bet she's full of pranks ready for me."
    "I need to stay calm."
    "I finished wrapping the gift up and head out."
    n "I'll be going now."
    mom "Yeah, Take care!"
    ##########################
    ##street
    scene bg streets_day with sds
    "Man, this is embarrassing!"
    "I do not want to go to Takagi-san's birthday party."
    "It might be only all-girls-birthday celebration and I might the only guy showing up to her birthday!"
    "That would be super embarrassing and super awkward!"
    "What should I do? I must come up with a plan to get out of the party as soon as possible."
    na "While walking and thinking of ways to go out of the sticky situation I'm in, I encountered Kimura, Sumire, Mano-Chan and Nakai on the way."
    nka "Oh- Hey, Nishikta!"
    "Nakai waved his hand over me and I waved back."
    n "Hey guys, Where are you guys going to?" #Are you going to Takagi's birthday too
    nka "We're going to Takagi-san's birthday"
    na "Kimura, Sumire, Mano-Chan nodded in agreement to what Nakai said."
    "huh?"
    nka "She invited more people!"
    n "More people??"
    smr "She invited everyone to her birthday!"
    n "eh?!"
    "This is bad, now I'm more embarrassed than ever!"
    mano "Is everything alright? [n]?"
    n "Ah- yeah, I'm okay"
    "Kimura laugh out loud and that caught everyone's attention."
    #na "'With a smirk in his face, he said'"
    k "It looks like someone's embarrassed going to Takagi-san's birthday."
    ev "Who?"
    k "Obviously it's [n]."
    n "WHAT?!"
    n "NO!"
    na "Everyone burst to laughter after hearing that"
    smr "Oh I get it! Hahaha, You're nervous because there will be lot of guys coming to her birthday!"
    n "No!! I-… What?"
    nka "Oh, I get it too! He’s jealous! Hahaha-"
    n "NO!!!! I AM NOT!!!!!"
    na "Everyone burst to laughter again."
    "Ugh, this is embarrassing."
    ##########################
    ## Takagi house
    scene bg tk_house with sds
    "After some time walking, we finally arrived to Takagi-san's house."
    "We rang the bell and Takagi's Mom opened up and welcomed us."
    ev "Good day Mrs. Takagi."
    tkmom "Hello, everyone, Glad you could come! She’s waiting for you, Come inside!"
    na "Takagi's mom let us in, after leaving our shoes at the entrance she guided us to the living room."
    ## Living room
    scene bg living_room with sds
    "There we saw a lot of people in the living room, It looks like most of our classmates really came to takagi's birthday!"
    "And I saw a lot of guys come as well! this put me at ease knowing that this is not an All-girls-only birthday celebration."
    "Man! my heart is racing all this time!"
    "But my heart still beating so fast, I can't keep this up."
    "I'll just give her my gift and go home, I might die from heart attack if this continue."
    "Though leaving without a reason is really rude, And I promised to her."
    "I don't know what to do."
    na "The birthday celebration has started and they congratulate Takagi-san."
    na "And I'm a bit unease to approach her and congratulate her too."
    na "While thinking of ways to approach her and give her my gift, Mano-san interrupted me."
    mano "[n]! What are you waiting for?! Let's go!"
    na "Mano-san pulled my hand and get me close to Takagi-san"
    na "She gave her gift first and a little chit-chat happened."
    "And now's my turn."
    t "Hi, [n], I thought that you wouldn't make it."
    n "Oh- uh, Hello Takagi-san"
    n "T-This is for you, Happy Birthday Takagi-san."
    "Takagi-san smiled and she seems really happy recieving my gift."
    "I hope she's happy what's inside it."
    t "Thanks [n]! "
    na "Takagi-san comes closer to me and whispered-"
    t "{i}I'm glad that you could come.{/i}"
    "!!!"
    ## play something magical here
    n "I- I need a drink! I'll be back!"
    "I retreated to their kitchen and calm myself and also look for something to drink."

    "And it looks like her mother was preparing something."
    tkmom "Oh! Hello, [n]."
    n "Hello-- wait! How did you know my name??"
    tkmom "My daughter tells me many things about you. Even, how do you look. "
    na "*She smiles*"
    n "O-Oh… I see…"
    tkmom "Did something happened?"
    n "N-no, nothing happened."
    tkmom "Are you sure?"
    n "..."
    n "The truth is, this is my first time coming to someone's birthday."
    na "And it's a girl's birthday..."
    tkmom "Ahh, I understand now."
    tkmom "You know, you don't have to be embarrassed about coming to her birthday."
    tkmom "She invited you to celebrate this special day with you and her friends because she knows it will be fun and memorable."
    tkmom "She decided that she will spend this special day with you and with her friends"
    tkmom "So you shouldn't worry too much or you might get old early!"
    tkmom "So forget what you're worried about right now and just have fun!"
    "..."
    "She's right, I came here to celebrate her birthday, screw what I'm worried about right now."
    "I went into the living room and and tried to blend in, I saw most of my classmates and friends chatting and having a good time."
    "In the sofa I see Takao listening to music in his earphones."
    "Ah, He's calling me."
    takao "[n]"
    n "Hey Takao, What's up?"
    takao "Oh nothing much, I'm just listening to some music."
    k "Guys! do you know where the kitchen is??"
    n "Ah I do, Just go straight down and turn left!"
    k "Thanks!"
    takao "I know this sounds so sudden and out of no where, but what do you think of Takagi-san?"
    "Wha-"
    n "I told you already! We're just friends!!"
    #"Takao is not convinced of my answer and "
    takao "Yeah, yeah I get it. But I want to hear your opinion about her. You two are really close friends. So I'm curious of what you think about her."
    "How should I answer that?"
    "I could go honest and tell him what I think of her, but he might mis-interpret it for  me liking her.."
    menu:
        "What should i do?"

        "I think she's a good friend.":
            $ answer = "tkg_friend"
        "I think she's fine.":
            $ answer = "tkg_okay"
        "She likes to tease people.":
            $ answer = "tkg_bad"

    if answer == "tk_friend":
        n "I think she’s cool girl."
        n "She’s nice. She’s smart."
        n "She’s very kind."
        n "She always there to support people, when they need it."
        n "Yeah, her teasing is really annoying, but I have to say."
        n "I enjoy hanging out with her.."
        takao "Sounds like you really like her huh?"
        takao "Does that mean you like her now?"
        "Realizing my poor word choices, I'm going to retreat to kitchen once again."
        n "I'm going to get something to drink. haha...."
        #takao "You enjoy being with her huh? Do you like her too?"

    elif answer == "tkg_okay":
        n "I think she’s fine."
        n "She’s smart."
        n "She’s fast and strong."
        n "You could say that we're good friends and close friends, but..."
        takao "Her teasing?"
        n "Yeah!"
        n"Her teasing are really annoying!"
        n"And sometimes, they really harsh!"
        n"She’s an okay friend, but sometimes her teasing are out of bounds and are hurtful!"
        takao "Hmmm..."
        takao "I see."


    elif answer == "tkg_bad":
        n "What do I think about her?"
        n "I think that she’s the most annoying girl that I ever know!"
        n "Seriously!!!"
        n "This is insane!"
        n "I’m always trying to figure out how beat her, by making plans; and she just laugh at me and making me look like an idiot!"
        n "I wish that I can understand her and read her mind so I will know what she's planning and what she's up to"

        takao "Mind Reading, huh?"
        #"She?!"
        takao "You know [n] I think I understand why you can’t beat her."
        n "Really? why? "
        takao "It's because..."
        "Takao paused for a second and looks like he realized something."
        takao "You know, I think it's best that you figure this out by yourself."
        n "What?! Are you kidding?!"

    "Without a word, Takao left. It's really strange of him asking me stuff like that."
    "Without anything else to do, I stood up and check in the kitchen if there's something to do."

    
    $ renpy.end_replay()
    python:
        persistent.ep3_progress = True
        renpy.save_persistent()



    # else:
        # jump end_game

    return
