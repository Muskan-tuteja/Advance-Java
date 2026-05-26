package com.jsp.spring.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController1 {
    private UseService useService = new UseService();


    public UserController1(UseService useService) {
        this.useService = useService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
            User createUser = useService.createUser(user);

        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
    User updated = useService.updated(user);
    if(updated == null){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
        return ResponseEntity.ok(updated);


    }
    @DeleteMapping("/{id}")//dynamic url
    public ResponseEntity<String> deleteUser(@PathVariable int id){
       boolean isDeleted = useService.deleteUser(id);
       if(!isDeleted)
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
           return ResponseEntity.notFound().build();


       }

    @GetMapping
    public List<User> getUsers(){
        return useService.getAllUser();


    }
    // /user/100, /user/400
    @GetMapping("/{userid}")
    public ResponseEntity<User> getUser(
            @PathVariable(value = "userid",required = false) int id){
        User user = useService.getUserById(id);
        if(user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }
    // multiple path access---> yes multiple path access
    @GetMapping("/{userid}/order/{orderId}")
    public ResponseEntity<User> getUser(
            @PathVariable("userid") int id,
            @PathVariable int orderId){
        User user = useService.getUserById(id);
        if(user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }

    // / search?name=muskan
//    @RequestParam
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(
            @RequestParam (required = false,defaultValue = "mahi") String name,
            @RequestParam (required = false,defaultValue = "ef@sdsfw") String email
    ){


        return ResponseEntity.ok(useService.searchUsers(name,email));
    }

    //RequestHeader
    @GetMapping("/info/{id}")
    public String getInfo(
            @PathVariable int id,
            @RequestParam String name,
            @RequestHeader ("User-Agent") String userAgent){
        return  "UserAgent : " + userAgent
                + " : " + id
                + " : " + name;

    }


}
