/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let newa=[];
    let idx=0;
    for(let i=0;i<arr.length;++i){
        if(fn(arr[i],i)){
            newa[idx]=arr[i];
            idx++;
        }else{
            continue;
        }
    }
    return newa;
    
};