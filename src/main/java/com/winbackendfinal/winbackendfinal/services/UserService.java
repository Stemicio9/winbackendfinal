package com.winbackendfinal.winbackendfinal.services;

import com.winbackendfinal.winbackendfinal.model.User;
import com.winbackendfinal.winbackendfinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findall(){

        return userRepository.findAll();
    }

    public String saveuser(User user){

        try{
            userRepository.save(user);
            return "Salvato con successo";
        }catch (Exception e ){
            //@todo
            e.printStackTrace();
            return "Non Salvato";
        }
    }


    public void deleteUser(User user){

        try{
            userRepository.delete(user);
        }catch (Exception e ){
            //@todo
            e.printStackTrace();
        }
    }

    public void deleteUser(String uid){

        User user = userRepository.findByUid(uid);
        deleteUser(user);

    }
}
