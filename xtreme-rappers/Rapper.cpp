#include<iostream>

using namespace std;

/*
long fact(long n) {
   if (n == 0 || n == 1)
      return 1;
   else
      return n * fact(n - 1);
}
 
long com(long n, long r) {
	return fact(n) / (fact(r) * fact(n-r));
}
*/

int main(void){
	long k, j;
	long t = 0;
	
	cin >> k >> j;
	
	if(k == 0 || j == 0){
		cout << "0" << endl;
		return 0;
	}
	
	if(j < k){
		long dk = k/2;
	
		if(dk/2 <= j)
			t += dk/2;
	
		if(j%2 == 0)
			t += j/2;
		else
			t += (j - 1) / 2;	
	} else if (j > k){
		long dk = j/2;
	
		if(dk/2 <= k)
			t += dk/2;
	
		if(k%2 == 0)
			t += k/2;
		else
			t += (k - 1) / 2;
	} else {
		t = j/4;
	}
		
	cout << t << endl;
	 
	return 0;
}
