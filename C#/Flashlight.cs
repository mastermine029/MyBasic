using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Flashlight : MonoBehaviour
{

    [SerializeField] GameObject FlashlightLight;
    private bool FlashlightActive = true;

    // Start is called before the first frame update
    void Start()
    {
        FlashlightLight.gameObject.SetActive(true);
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.T))
        {
            if (FlashlightActive == true)
            {
                FlashlightLight.gameObject.SetActive(false);
                FlashlightActive = false;
            }
            else
            {
                FlashlightLight.gameObject.SetActive(true);
                FlashlightActive = true;
            }
        }
    }
}
