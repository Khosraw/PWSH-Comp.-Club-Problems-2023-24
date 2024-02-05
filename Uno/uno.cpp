#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;

    for (int i = 0; i < n; i++){
        string s; cin >> s; 
        vector<int> card = {5,5,5,5}; vector<int> temp; int pl = 10000; int rev = 1; int max = -1000;
        for (int j = 0; j < s.length(); j++){
             if (s[j] == '4'){
                card[pl%4] -= 1; pl += rev*1;
                card[pl%4] += 4; pl += rev*1;
             } else if (s[j] == '0'){
                card[pl%4] -= 1; pl += rev*2;
             } else if (s[j] == 'v'){
                rev = -rev;
                card[pl%4] -= 1; pl += rev*1;
             } else {
                card[pl%4] -= 1; pl += rev*1;
             }
        }
        //cout << card[0] << " " << card[1] << " " << card[2] << " " << card[3] << endl;
        for (int k = 0; k < card.size(); k++){
            if (card[k] >= max){
                max = card[k];
            } 
        }
        for (int l = 0; l < card.size(); l++){
            if (card[l] == max){
                temp.push_back(l);
            } 
        }

        if (temp.size() > 1) {
	    	cout << "tie" << endl;
	    } else {
	    	if (temp[0] == 0){
                cout << "A" << endl;
            } else if (temp[0] == 1) {
	    		cout << "B" << endl;
	    	} else if (temp[0] == 2) {
	    		cout << "C" << endl;
	    	} else {
	    		cout << "D" << endl;
	    	}
	    }
        
    }
}
