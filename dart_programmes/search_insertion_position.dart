// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

void main(){
int result = searchInsert([1,3,5,6], 5);
  print('result: $result');
}

  int searchInsert(List<int> nums, int target) {
  int index = 0;
    
for(int i = 0; i < nums.length; i++){
    if(nums[i] == target){
        index = i;
        print('index 1: $index');
        break;
    } else if(i + 1 < nums.length  && nums[i] < target && nums[i + 1] > target){
        index = i + 1;
        print('index 2: $index');

        break;
    } else if(target > nums[nums.length - 1]){
        index = nums.length;
        print('index 3: $index');

        break;
    }
    
}
return index;
  }

