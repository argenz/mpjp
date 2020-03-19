package s054;

interface BarkAndWag extends Barker { //extends: has methods in Barker + methods defined here. 
    int AVG_WAGGING_SPEED = 12;

    int tailWaggingSpeed();
}