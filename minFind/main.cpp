#include <iostream>

using namespace std;

struct Array {
    int *elem;
    int length;
};

void input(Array &in){
    cout<<"input";
    int value;
        while(1) {
            cin>>value;
            if (getchar() == '\n'){
                break;
            }
            if (!in.elem[value]){
                in.length++;
                in.elem[value] = value;
            }
        }
}

int find(Array L) {
    cout<<"find";
    for (int i = 0; i < L.length; ++i) {
        if (!L.elem[i]){
            return i;
        }
    }
    return L.length;
}

void init(Array & L) {

    for (int i = 0; i < 20; ++i) {
        L.elem[i] = NULL;
    }

    L.length = 0;
}

int main() {
    int choose ;

    //初始化列表
    Array L;
    L.elem = new int[1e6];
    L.length = 0;
    while (1) {
        cin>>choose;
        switch (choose) {
            case 0: {
                input(L);
                break;
            }

            case 1: {
                cout<<find(L);
                break;
            }
        }
    }

    return 0;
}

