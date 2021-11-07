package com.meta.socialnetwork.service.notification;

import com.meta.socialnetwork.model.Comment;
import com.meta.socialnetwork.model.Notification;
import com.meta.socialnetwork.model.User;
import com.meta.socialnetwork.repository.INotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    INotificationRepo notificationRepo;
    @Override
    public Iterable<Notification> findAll() {
        return notificationRepo.findAll();
    }

    @Override
    public Optional<Notification> findById(Long id) {
        return notificationRepo.findById(id);
    }

    @Override
    public void save(Notification notification) {


    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Notification saves(Notification notification) {
        return notificationRepo.save(notification);
    }

    @Override
    public Iterable<Notification> findAllByComment_Post_User(User user) {
        return notificationRepo.findAllByComment_Post_User(user);
    }

    @Override
    public Iterable<Notification> findByComment_Post_User(User user) {
        return notificationRepo.findByComment_Post_User(user);
    }

    @Override
    public Notification findByComment(Comment comment) {
        return notificationRepo.findByComment(comment);
    }


}
