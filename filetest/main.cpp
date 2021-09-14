#include <iostream>
#include <fstream>

using namespace std;

string h1,h2,h3;

int main() {
    fstream file;
    file.open("../Student.txt",ios::in);

    if (!file) {
        cout<<"error";
    }

    file>>h1>>h2>>h3;
//    cout<<h1<<" "<<h2<<" "<<h3<<endl;
    while(!file.eof()){
        file>>h1>>h2>>h3;
        cout<<h1<<" "<<h2<<" "<<h3<<endl;
    }

    file.close();
    return 0;
}
