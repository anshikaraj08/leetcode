/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let val=fn(init,nums[0]);
    if(nums.length==0){
        return init;
    }
    let sum=0;
    sum=val;
    for(let i=1;i<nums.length;++i){
        sum=fn(sum,nums[i]);
    }
    return sum;
};