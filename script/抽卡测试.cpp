#include<bits/stdc++.h>

using namespace std;

/*
����˳��1-60  ����ˮľ������ԣ�ÿ�����Դ�1�ŵ�20(��ֵԽ��Խϡ��)

����

1-5 С����   14%

6-10  �������   40%

11-15 �и���     30%

16-18 С����    14%

19-20 ���͸���  2%

*/

int result() {
	int re;
	int ran;
	ran=rand()%100 +1;
	if(ran>=1&&ran<=14) {
		re=rand()%5 +1 + (rand()%3)*20;
	}
	if(ran>14&&ran<=54) {
		re=rand()%5 +6 + (rand()%3)*20;
	}
	if(ran>54&&ran<=84) {
		re=rand()%5 +11 + (rand()%3)*20;
	}
	if(ran>84&&ran<=98) {
		re=rand()%3 +16 + (rand()%3)*20;
	}
	if(ran>98&&ran<=100) {
		re=rand()%2 +19 + (rand()%3)*20;
	}
	return re;
}


int main() {
	srand((unsigned)time(NULL));
	freopen("result.txt","w",stdout);
	int n=10000;
	while(n--) {
		int a=result();
		cout<<a<<endl;
	}
	return 0;
}

