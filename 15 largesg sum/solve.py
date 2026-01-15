def max_subarray(nums):
    csum=nums[0]
    max=nums[0]
    for i in range(1,len(nums)):
        if csum<0:
            csum=nums[i]
        else:
            csum+=nums[i]
        if csum>max:
            max =csum
    return max

nums = [-2,1,-3,4,-1,2,1,-5,4]
print(max_subarray(nums))
