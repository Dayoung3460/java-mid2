package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " found");
                break;
            }
        }

        // 배열에서 자료를 찾을 때 인덱스로 찾으면 아주 빠름.
        // 배열은 메모리상에 순서대로 붙어서 존재함.
        // int는 4byte. arr[2]를 찾으려면 arr[0] 시작하는 지점에서 4byte 두번을 건너뛰면 arr[2]를 바로 찾을 수 있음
        // arr[2]의 인덱스값 2를 가지고 바로 공식 때려서 자료를 찾을 수 있음.
        // 배열 요소를 하나 하나 조회 안하고.
        // 배열이 붙어있고 같은 크기의 메모리를 차지하는 특징 때문에 가능
        // 배열에 10억건이 있어도 10억건을 조회하는게 아니라 1번만에 찾을 수 있음.
        // 데이터의 크기와 상관없이 성능이 똑같음

        // 인덱스가 아닌 값으로 찾으려면 느림 -> 검색: 배열에 들어있는 데이터를 찾는 것.
        // 배열의 순차 검색은 배열에 들어있는 데이터 크기 만큼 연산이 필요.
        // 배열의 크기가 n이면 연산도 n만큼 필요
    }
}
