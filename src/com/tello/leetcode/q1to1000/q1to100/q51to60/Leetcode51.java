package com.tello.leetcode.q1to1000.q1to100.q51to60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // ���������е�ռλ��
    public char[] value;
    // ���N�ʺ��������Ҫ����
    public List<List<String>> solveNQueens(int n) {
        // ���ڴ洢���ս���Ķ�ά�б�
        List<List<String>> result = new ArrayList<>();
        // ��ʼ��ռλ������
        value = new char[n];
        Arrays.fill(value,'.');
        // ��ʼ��ÿ���Ƿ�ռ�õ�����
        int[] nums = new int[n];
        // ��ʼ����б�������Ƿ�ռ�õ�����
        int[] leftNums = new int[2*n-1];
        // ��ʼ����б�������Ƿ�ռ�õ�����
        int[] rightNums = new int[2*n-1];
        // ���õݹ麯�����
        intoQueen(result,new ArrayList<>(),nums,leftNums,rightNums,n);
        // ���ؽ��
        return result;
    }

    // �ݹ麯��������ö��ÿ��λ�����Ƿ���ûʺ�
    public void intoQueen(List<List<String>> result,List<String> temp,int[] nums,int[] leftNums,int[] rightNums,int n){
        int y = temp.size();
        //���y����n����ʾ�Ѿ�������n���ʺ�
        if(y==n){
            //�����ְڷ�����������
            result.add(new ArrayList<>(temp));
            //������һ��ݹ�
            return;
        }
        //����ÿһ��
        for (int x = 0; x < nums.length; x++) {
            //���㵱ǰ����(x,y)����б�����ϵı��
            int leftNum = x+y;
            //���㵱ǰ����(x,y)����б�����ϵı��
            int rightNum = -x+y+(n-1);
            //������λ���ϣ��ں��ݷ����Լ�����б�����϶�û�з��ù��ʺ�
            if(nums[x]==0&&leftNums[leftNum]==0&&rightNums[rightNum]==0) {
                //���Ƶ�ǰ�ַ����飬�ڵ�ǰλ���Ϸ��ûʺ�
                char[] val = value.clone();
                val[x] = 'Q';
                //�����úûʺ�����ַ��������temp�б�
                temp.add(new String(val));
                //��¼��ǰλ���Ѿ����ù��ʺ�
                nums[x] = 1;
                leftNums[leftNum] = 1;
                rightNums[rightNum] = 1;
                //�ݹ�ڷ���һ���ʺ�
                intoQueen(result, temp, nums,leftNums,rightNums, n);
                //����
                temp.remove(temp.size() - 1);
                nums[x] = 0;
                leftNums[leftNum] = 0;
                rightNums[rightNum] = 0;
            }
        }
    }
}
