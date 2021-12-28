package com.eomcs.mylist;

public class ArrayList3 {

  static Board[] boards = new Board[5];
  static int size = 0;

  // 기능:
  // - 이메일로 연락처 정보를 찾는다.
  // - 찾은 연락처의 배열 인덱스를 리턴한다.
  //
  static int indexOf(String title) {
    for (int i = 0; i < size; i++) {
      Board board = boards[i];
      if (board.title.equals(title)) { 
        return i;
      }
    }
    return -1;
  }

  // 기능:
  // - 배열에서 지정한 항목을 삭제한다.
  //
  static Board remove(int index) {
    Board old = boards[index];
    for (int i = index + 1; i < size; i++) {
      boards[i - 1] = boards[i];
    }
    size--;
    return old;
  }

  // 기능:
  // - 배열의 크기를 늘린다.
  // - 기존 배열의 값을 복사해온다.
  //
  static Board[] grow() {
    Board[] arr = new Board[newLength()];
    copy(boards, arr);
    return arr;
  }

  // 기능:
  // - 주어진 배열에 대해 50% 증가시킨 새 배열의 길이를 알려준다.
  //
  static int newLength() {
    return boards.length + (boards.length >> 1);
  }

  // 기능: 
  // - 배열을 복사한다.
  // 
  static void copy(Board[] source, Board[] target) {
    int length = source.length;
    if (target.length < source.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = source[i];
    }
  }

  // 기능:
  // - 배열에 저장된 목록만 꺼내 새 배열에 담아 리턴한다.
  //
  static Board[] toArray() {
    Board[] arr = new Board[size]; 
    for (int i = 0; i < size; i++) { 
      arr[i] = boards[i]; 
    }
    return arr; 
  }

  // 기능:
  // - 배열에 항목을 추가한다.
  // - 배열이 꽉찼으면 배열의 크기를 늘린다.
  //
  static void add(Board board) {
    if (size == boards.length) { 
      boards = grow();
    }
    boards[size++] = board;
  }

  // 기능:
  // - 배열의 특정 위치에 값을 변경한다.
  // - 리턴 값: 
  //   - 변경하기 전에 저장되어 있던 값
  //
  static Board set(int index, Board board) {
    if (index < 0 || index >= size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Board old = boards[index];
    boards[index] = board;
    return old;
  }
}










