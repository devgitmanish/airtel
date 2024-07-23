package com.interview.practice.SolidPrincipal.Liskov.solution;

import com.interview.practice.SolidPrincipal.Liskov.solution.mediaInterface.CallingMedia;
import com.interview.practice.SolidPrincipal.Liskov.solution.mediaInterface.PostMedia;
import com.interview.practice.SolidPrincipal.Liskov.solution.mediaInterface.SocialMedia;

public class Facebook implements SocialMedia, CallingMedia, PostMedia {

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupCalling() {

    }

    @Override
    public void publishPost() {

    }
}
