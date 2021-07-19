fun main(args:Array<String>){
    val nums = intArrayOf(3,2,4)
    printArray(twoSum(nums, 6))
}

fun twoSum(nums: IntArray, target:Int):IntArray{
    val arrayResponse = IntArray(2)
    for (i in nums.indices){
        val diff = target - nums[i]
        if (nums.contains(diff) && nums.indexOf(diff) != i){
            arrayResponse[0] = i
            arrayResponse[1] = nums.indexOf(diff)
            return arrayResponse
        }
    }
    return  arrayResponse
}