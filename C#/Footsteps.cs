using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Footsteps : MonoBehaviour
{
    public AudioSource footstepsSound;


    void Update()
    {
        if (Input.GetKey(KeyCode.W) || Input.GetKey(KeyCode.A) || Input.GetKey(KeyCode.S) || Input.GetKey(KeyCode.D))
        {
            if (Input.GetKey(KeyCode.LeftShift))
            {
                footstepsSound.volume = Random.Range(0.8f, 1f);
                footstepsSound.pitch = Random.Range(0.8f, 1f);
                footstepsSound.enabled = true;
            }
            else
            {
                footstepsSound.volume = Random.Range(0.5f, 0.6f);
                footstepsSound.pitch = Random.Range(0.5f, 0.6f);
                footstepsSound.enabled = true;
            }
        }

        else
        {
            footstepsSound.enabled = false;
        }
    }
}