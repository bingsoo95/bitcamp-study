// package com.eomcs.mylist;
//
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
//
// @RestController
// public class BoardController {
//
//   @RequestMapping("/board/list")
//   public Object list() {
//     return ArrayList3.toArray();
//   }
//
//   @RequestMapping("/board/add")
//   public Object add(Board board) {
//
//     ArrayList3.add(board);
//     return ArrayList3.size;
//   }
//
//   @RequestMapping("/board/get")
//   public Object get(String title) {
//     int index = ArrayList3.indexOf(title);
//     if (index == -1) {
//       return "";
//     }
//
//     return ArrayList3.boards[index];
//   }
//
//   @RequestMapping("/board/update")
//   public Object update(Board board) {
//     int index = ArrayList3.indexOf(board.title);
//     if (index == -1) {
//       return 0;
//     }
//
//     return ArrayList3.set(index, board) == null ? 0 : 1;
//   }
//
//   @RequestMapping("/board/delete")
//   public Object delete(String title) {
//     int index = ArrayList3.indexOf(title);
//     if (index == -1) {
//       return 0;
//     }
//
//     ArrayList3.remove(index);
//     return 1;
//   }
// }
//
//