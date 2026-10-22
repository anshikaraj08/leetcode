/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */

//  var inner = outer(); // Gets the inner function
// inner();              // Calls the inner function


// Simply: The outer function gives you a function, and you call that returned function separately.
// Summary
// - Outer function: Returns another function.
// - Inner function: Does the actual work when called.
// - ...args in JavaScript: Collects all passed arguments into an array.
// - return: Sends a value back to the caller.
// - Without return: Python returns None; JavaScript returns undefined.
// - return inner: Returns the function itself.
// - return inner(): Calls the function and returns its result.