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
	ran=rand()%1000 +1;
	if(ran>=1&&ran<=140) {
		re=rand()%5 +1 + (rand()%3)*20;
	}
	if(ran>140&&ran<=540) {
		re=rand()%5 +6 + (rand()%3)*20;
	}
	if(ran>540&&ran<=840) {
		re=rand()%5 +11 + (rand()%3)*20;
	}
	if(ran>840&&ran<=998) {
		re=rand()%3 +16 + (rand()%3)*20;
	}
	if(ran>998&&ran<=1000) {
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

