using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AIFootsteps : MonoBehaviour
{
    public AudioSource AIfootstepsSound;

    void Update()
    {
        AIfootstepsSound.enabled = true;
    }
}