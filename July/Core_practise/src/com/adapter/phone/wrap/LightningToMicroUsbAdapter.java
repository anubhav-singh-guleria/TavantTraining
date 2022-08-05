package com.adapter.phone.wrap;

import com.adapter.phone.LightningPhone;
import com.adapter.phone.MicroUsbPhone;
import com.adapter.phone.impl.Iphone;
 
public class LightningToMicroUsbAdapter implements MicroUsbPhone {
 
      private final LightningPhone lightningPhone;
 
        public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
            this.lightningPhone = lightningPhone;
        }
 
        @Override
        public void useMicroUsb() {
            System.out.println("MicroUsb connected");
            lightningPhone.useLightning();
        }
 
        @Override
        public void recharge() {
            lightningPhone.recharge();
        }
}