def remove_duplicates(nums):
    i=0
    for j in range(len(nums)):
        if nums[i]!=nums[j]:
            i+=1
            nums[i]=nums[j]
    return i+1

nums = [1,1,2,2,3,4,4]
k = remove_duplicates(nums)
print(k)
print(nums[:k])
