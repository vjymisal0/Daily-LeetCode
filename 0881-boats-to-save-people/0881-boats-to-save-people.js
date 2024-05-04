/**
 * @param {number[]} people
 * @param {number} limit
 * @return {number}
 */
var numRescueBoats = function(people, limit) {
    let numOfBoats = 0;
    people.sort((a,b) => a-b)// 3, 3,4, 5 
    while(people.length !==0){
        const mostHeavy  = people[people.length -1] ;
        const mostLight = people[0]
        if(mostHeavy + mostLight <= limit){
            numOfBoats++
            people.pop();
            people.shift();
        }else{
            numOfBoats++
            people.pop();
        }
    }
    return numOfBoats
};