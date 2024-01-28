#include <iostream>
#include <map>
#include <vector>
#include <sstream>
#include <algorithm>
using namespace std;

int main(){
    int x; cin >> x; cin.ignore();
    vector<string> a; vector<string> b; 
    map<string, string> dict { {"0", "A"}, {"1", "B"}, {"10", "C"}, {"11", "D"}, {"100", "E"}, {"101", "F"}, 
    {"110", "G"}, {"111", "H"}, {"1000", "I"}, {"1001", "J"}, {"1010", "K"}, {"1011", "L"}, {"1100", "M"},
    {"1101", "N"}, {"1110", "O"}, {"1111", "P"}, {"10000", "Q"}, {"10001", "R"}, {"10010", "S"}, {"10011", "T"},
    {"10100", "U"}, {"10101", "V"}, {"10110", "W"}, {"10111", "X"}, {"11000", "Y"}, {"11001", "Z"}}; 
    
    for (int i = 0; i < x; i++){
        string e; cin >> e;
        a.push_back(e);
        cin >> e;
        b.push_back(e);
    }
    
    for (int j = 0; j < x; j++){
        string s = ""; int num; int pl; string name; vector<string> c; string unscr;
        cin >> num; cin.ignore(); getline(cin, s); stringstream ss(s);
        while (ss >> name){
            c.push_back(name);
        }
        for (string k : c){
            auto it = dict.find(k);
            unscr+= it->second;
        }
        for (string l : b){
            if (l.compare(unscr) == 0) replace(b.begin(), b.end(), l, to_string(num)); 
        }
    }
    
    for (int g = 0; g < x; g++){
        if (g == x-1) cout << a[g] << " " << b[g];
        else cout << a[g] << " " << b[g] << endl;
    }
}

