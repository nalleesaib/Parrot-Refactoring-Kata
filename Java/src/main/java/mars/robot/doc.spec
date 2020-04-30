Modélisation du déplacement du véhicule
Pour se déplacer
    - direction
    - position



// liste des tests
1. Verifier que le position initiale du robot est (0,0) et direction N

2. Etant donné une position, si je déplace le robot alors j'attends d'avoir une position donnée
    Test 1 : (move Forward)
        position initiale :   (0,0,N)
        action : F
        Attendu (1,0,N)

    Test 2 : (rotate to R)
        position initiale :   (0,0,N)
        action : R
        Attendu (0,0,E)

    Test 3 : (move Backward  and rotate to L)
            position initiale :   (3,3,N)
            action : BL
            Attendu (2,3,W)

    Test 4 : (move Backward  + rotate R + move forward twice )
                position initiale :   (-5,8,N)
                action : BRFF
                Attendu (-3,7,E)


    Test 5 : (move Forward  )
                    position initiale :   (-10,0,W)
                    action : F
                    Attendu (10,0,W)


