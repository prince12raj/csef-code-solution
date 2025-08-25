#include <bits/stdc++.h>
using namespace std;

int fact(int n) {
    int res = 1;
    for (int i = 2; i <= n; i++)   
        res *= i;                 
    return res;
}

int main() {
    int n;
    int cnt = 0;
    cin >> n;

    int res = fact(n);
    while (res % 10 == 0) {
        cnt++;
        res /= 10;
    }

    cout << cnt;
    return 0;
}

