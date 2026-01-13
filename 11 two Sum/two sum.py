def two_sum(nums,target):
    lookup={}
    for i in range(len(nums)-1):
        need=target-nums[i]
        if need in lookup:
            return [lookup[need],i]
        lookup[nums[i]]=i

def two_sum1(nums,target):
    left=0
    right=len(nums)-1
    while left<right:
        csum=nums[left]+nums[right]
        if csum==target:
           return [left,right]
        elif csum>target:
            right=right-1
        else:
            left=left+1

print(two_sum1([2,7,9,11],9))
