package com.adapter.phone.impl;

import com.adapter.phone.LightningPhone;

public class Iphone implements LightningPhone {

    private boolean connector;

    @Override
    public void recharge() {
        // TODO Auto-generated method stub
        connector = true ;
        System.out.println("Lightning connected");
    }
 
    @Override
    public void useLightning() {
        // TODO Auto-generated method stub
         if(connector) {
              System.out.println("Recharge started ");
              System.out.println("Recharge finished");
          }else {
              System.out.println("Connect Lightning first ");
          }
        }
    }
 