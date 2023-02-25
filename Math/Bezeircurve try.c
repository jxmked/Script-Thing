#include <stdio.h>

typedef struct {
    double x;
    double y;
} Point;

Point bezier(Point P0, Point P1, Point P2, double t) {
    // Compute intermediate control points
    Point Q0 = { P0.x + t * (P1.x - P0.x), P0.y + t * (P1.y - P0.y) };
    Point Q1 = { P1.x + t * (P2.x - P1.x), P1.y + t * (P2.y - P1.y) };
    // Compute final point on curve
    Point R = { Q0.x + t * (Q1.x - Q0.x), Q0.y + t * (Q1.y - Q0.y) };
    return R;
}

int main() {
    // Define control points and parameter t
    Point P0 = { 0, 0 };
    Point P1 = { 1, 2 };
    Point P2 = { 2, 0 };
    double t = 0.2;
    
    // Compute point on curve corresponding to t
    Point R = bezier(P0, P1, P2, t);
    
    printf("Point on curve at t=%g: (%g, %g)\n", t, R.x, R.y);
    return 0;
}
