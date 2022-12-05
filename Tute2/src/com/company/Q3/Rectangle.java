package com.company.Q3;
public class Rectangle {
    int _x1;
    int _y1;
    int _x2;
    int _y2;
    public Rectangle(int x1,int y1,int x2,int y2){
        _x1 = x1;
        _y1 = y1 ;
        _x2 = x2;
        _y2 = y2;
    }
    public Rectangle(Rectangle r){
        _x1 = r._x1;
        _y1 = r._y1;
        _x2 = r._x2;
        _y2 = r._y2;
    }
    public void grow(int x, int y){
        //Grow Method Body Implementation
        this._x1 = _x1+x;
        this._y1 = _y1+y;
        this._x2 = _x2+x;
        this._y2 = _y2+y;
    }





    }

