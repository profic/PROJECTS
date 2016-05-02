#include <bits/stdc++.h>

using namespace std;

const int N = 1000010;
int arr[N];
int n;
int res = 0;

int main() {
	freopen("candies.in", "r", stdin);
	freopen("candies.out", "w", stdout);
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	for (int i = 0; i < n; i++) {
		int c1 = arr[i];
		int j = i + 1;
		while (j < n && arr[j] == c1) j++;
		if (j == n) break;
		int c2 = arr[j];
		j++;
		while (j < n && (arr[j] == c1 || arr[j] == c2)) {
			j++;
		}
		res = max(res, j - i);
	}
	cout << res << endl;
	
}