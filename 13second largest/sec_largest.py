def second_largest(nums):
    large=nums[0]
    sec_large=nums[0]
    for i in range(len(nums)):
        if large<nums[i]:
            sec_large=large
            large=nums[i]
        elif sec_large<nums[i] and nums[i]<large:
            sec_large=nums[i]
    if large == sec_large:
        return None
    return sec_large


nums = [12, 35, 1, 10, 34, 1]
print(second_largest(nums))
