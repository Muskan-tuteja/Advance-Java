package com.jsp.spring.app;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
private Map<Integer,User> userDb=new HashMap<Integer, User>();


@PostMapping
public ResponseEntity<User> createUser(@RequestBody User user){
    System.out.println(user.getName());
    userDb.putIfAbsent(user.getId(),user);
//    return ResponseEntity.status(HttpStatus.CREATED)
//            .body(user);
//           OR
    return new ResponseEntity<>(user,HttpStatus.CREATED);
}
@PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
   if (!userDb.containsKey(user.getId()))
//   return ResponseEntity.notFound().build();
       return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
   userDb.put(user.getId(),user);
//   return ResponseEntity.status(HttpStatus.OK).body(user);
    return ResponseEntity.ok(user);


}
@DeleteMapping("/{id}")//dynamic url
    public ResponseEntity<String> deleteUser(@PathVariable int id){
    if (!userDb.containsKey(id))
        return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
    userDb.remove(id);
//    return ResponseEntity.ok("User Deleted");
    return ResponseEntity.noContent().build();
}
@GetMapping
    public List<User> getUsers(){
    return new ArrayList<>(userDb.values());


}
// /user/100, /user/400
@GetMapping("/{userid}")
    public ResponseEntity<User> getUser(
            @PathVariable(value = "userid",required = false) int id){
    if(!userDb.containsKey(id))
        return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
    return  ResponseEntity.ok(userDb.get(id));
}
// multiple path access---> yes multiple path access
    @GetMapping("/{userid}/order/{orderId}")
    public ResponseEntity<User> getUser(
            @PathVariable("userid") int id,
            @PathVariable int orderId){
        System.out.println("Order id "+orderId);
        if(!userDb.containsKey(id))
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        return  ResponseEntity.ok(userDb.get(id));
    }

// / search?name=muskan
//    @RequestParam
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(
            @RequestParam (required = false,defaultValue = "mahi") String name,
            @RequestParam (required = false,defaultValue = "ef@sdsfw") String email
    ){
        System.out.println(name);
        List<User> users= userDb.values().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .toList();

        return ResponseEntity.ok(users);
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
