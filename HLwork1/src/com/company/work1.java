package com.company;
/*
java编程实现从控制台输入一串数字序列（不定长），程序对数组进行排序，
并且输出排序的结果。然后程序再请求用户输入一个待插入的不定长数字序列，
将这个序列和原来的序列合并到一起，变成新的有序序列输出。

如：

请输入一串数字：

5，6，2

排序后的结果：

2，5，6

请输入另一串数字：

1，8，9

合并后的结果：

1，2，5，6，8，9
*/
import java.util.Scanner;
        public class work1{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一串数字：");
                String str = sc.nextLine();
                String[] strR = str.split(",");
                int[] nums = new int[strR.length];
                for (int i = 0; i < strR.length; i++) {
                    nums[i] = Integer.parseInt(strR[i]);
                }
                System.out.println("排序之后的结果：");
                if (nums.length != 0) {
                    for (int i = 0; i < nums.length - 1; i++) {
                        for (int j = 0; j < nums.length - 1 - i; j++) {
                            if (nums[j] > nums[j + 1]) {
                                int temp = nums[j];
                                nums[j] = nums[j + 1];
                                nums[j + 1] = temp;
                            }
                        }
                    }
                    for (int n = 0; n < nums.length; n++) {
                        System.out.print(nums[n]);
                    }
                }
                System.out.println("请输入另一串数字：");
                String stra = sc.nextLine();
                String[] strRA = stra.split(",");
                int[] num = new int[strRA.length];
                int[] numa =new int [strRA.length+strR.length];
                for (int i = 0; i < strRA.length; i++) {
                    num[i] = Integer.parseInt(strRA[i]);
                }
                for (int m = 0; m < num.length; m++) {
                    numa[m]=nums[m];
                    numa[m + nums.length] = num[m];
                }

                for (int i = 0; i < numa.length - 1; i++) {
                    for (int j = 0; j < numa.length - 1 - i; j++) {
                        if (numa[j] > numa[j + 1]) {
                            int temp = numa[j];
                            numa[j] = numa[j + 1];
                            numa[j + 1] = temp;
                        }
                    }
                }
                for (int n = 0; n < numa.length; n++) {
                    System.out.print(numa[n]);
                }
            }
        }
