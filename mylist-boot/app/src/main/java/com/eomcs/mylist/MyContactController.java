/*
package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MyContactController {

  String[] ramyuns = new String[6];
  int size = 0;

  @RequestMapping("/my1/list")
  public Object list() {
    String[] arr = new String[size]; 
    for (int i = 0; i < size; i++) { 
      arr[i] = ramyuns[i]; 
    }
    return arr;
  }

  @RequestMapping("/my1/add")
  public Object add(String name, String gram, String kcal, String brand, String price) {
    String ramyun = name + "," + gram + "," + kcal + "," + brand + "," + price;
    ramyuns[size++] = ramyun;
    return size;
  }
  @RequestMapping("/my1/get")
  public Object get(String name) {
    for (int i = 0; i < size; i++) {

      if (ramyuns[i].split(",")[0].equals(name)) { 
        return ramyuns[i];
      }
    }
    return "";
  }

  @RequestMapping("/my1/update")
  public Object update(String name, String gram, String kcal, String brand, String price) {
    String ramyun = name + "," + gram + "," + kcal + "," + brand + "," + price;
    for (int i = 0; i < size; i++) {
      if (ramyuns[i].split(",")[1].equals(name)) { 
        ramyuns[i] = ramyun;
        return 1;
      }
    }
    return 0;
  }

  @RequestMapping("/my1/delete")
  public Object delete(String name) {
    for (int i = 0; i < size; i++) {
      if (ramyuns[i].split(",")[0].equals(name)) { 
        for (int j = i + 1; j < size; j++) {
          ramyuns[j - 1] = ramyuns[j];          
        }
        size--;
        return 1;
      }
    }
    return 0;
  }
}
 */