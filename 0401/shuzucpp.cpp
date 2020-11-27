#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv)
{	int list[10];
	int flag,j;
	cout<<"enter ten numbers"<<endl;
	for(int i=0;i<10;i++)
	{
	
	
	cin>>list[i];
	
	 
	}
	for(int i=0;i<10;i++)
	{flag=0;
		for(j=0;j<i;j++)
		{	if(list[i]==list[j]) flag=1;

		}
	if(flag==0)
	cout<<list[i];


}
	
	
	
	
	
	return 0;
}
