package com.interview.practice.SolidPrincipal.Liskov.solution;

import com.interview.practice.SolidPrincipal.Liskov.solution.mediaInterface.CallingMedia;
import com.interview.practice.SolidPrincipal.Liskov.solution.mediaInterface.SocialMedia;

public class Instagram implements SocialMedia, CallingMedia {

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }


    @Override
    public void groupCalling() {

    }
}
