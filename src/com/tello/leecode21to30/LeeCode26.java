package com.tello.leecode21to30;

//26. ɾ�����������е��ظ���
public class LeeCode26 {
	public int removeDuplicates(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==nums[k-1]) {
				nums[i]=0;
			}else {
				k++;
				nums[k]=nums[i];
			}
		}
		return k;
    }
}
