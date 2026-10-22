/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    obj = {
        // let val2;
        toBe(val2){
            if(val2===val){
                return true;
            }else{
                throw new Error("Not Equal");
            }
        }, // comma separates methods

        notToBe(val3){
            if(val3!==val){
                return true;
            }else{
                throw new Error("Equal");
            }
        }
    }
    return obj;

};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */