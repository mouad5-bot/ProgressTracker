package com.youcode.service;

import com.youcode.entities.Objectif;
import com.youcode.entities.User;

public class ServiceProgressTracker {
    private User user;
    private Objectif objectif;

  public ServiceProgressTracker(User user, Objectif objectif){
      this.user = user;
      this.objectif = objectif;
  }

    public void showData() {
        System.out.println("this is data .. !" + user + "\n" + objectif);
    }
}
