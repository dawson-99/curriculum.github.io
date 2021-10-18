#include <iostream>
using namespace std;

typedef struct {
    int *elem;

} *pointer,Node;

int main() {
    Node node;
    node.elem = new int [100];
    node.elem[0] = 1;
    node.elem[1] = 6;
    int * point = node.elem;
    cout<<*point<<endl;
    *point++;
    cout<<*point<<endl;
    return 0;
}
