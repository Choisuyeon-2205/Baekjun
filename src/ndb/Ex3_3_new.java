package ndb;

import java.util.*;
import java.io.*;
/*
 * 2차원 배열을 굳이 저장할 필요가 없다.(공간 복잡도 줄어듬!!!)
 * 짧고 더 좋은 코드 같음
 * bufferedReader를 쓰도록 노력해야겠다.
 */

public class Ex3_3_new
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        String[] minArr = new String[row];

        for(int i = 0; i < row; i++)
        {
            String s = br.readLine();
            String[] arr = s.split(" ");

            Arrays.sort(arr);

            minArr[i] = arr[0];
        }

        Arrays.sort(minArr);
        System.out.println(minArr[row-1]);
    }
}