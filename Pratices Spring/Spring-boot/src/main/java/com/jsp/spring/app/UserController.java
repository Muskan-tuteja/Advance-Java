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
@GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
    if(!userDb.containsKey(id))
        return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
    return  ResponseEntity.ok(userDb.get(id));
}

}
