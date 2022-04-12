#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct Node
{
    float data;
    Node *link;
};
struct stack
{
    Node *top;
};

void Init(stack &s)
{
    s.top = NULL;
}

int Empty(stack s)
{
    return s.top == NULL ? 1 : 0;
}
void Push(stack &s, float x)
{
    Node *p;
    p = new Node;
    if (p != NULL)
    {
        p->data = x;
        p->link = s.top;
        s.top = p;
    }
}
float Pop(stack &s)
{
    float x;
    if (!Empty(s))
    {
        Node *p = s.top;
        s.top = p->link;
        x = p->data;
        delete (p);
        return x;
    }
}

void DocTu(char s[], char tu[], int &vt)
{
    for (int i = 0; i < strlen(tu); i++)
        tu[i] = ' ';
    int i = 0;
    while (s[vt] != ' ' && s[vt]!= '\0')
    {
        tu[i] = s[vt];
        vt++;
        i++;
    }
}
int LaToanTu(char s[])
{
    char c = s[0];
    if ((c == '+') || (c == '-') || (c == '*') || (c == '/'))
        return 1;
    return 0;
}
float TinhToan(float toanHang1, float toanHang2, char toanTu)
{
    float kq;
    switch (toanTu)
    {
    case '+':
        kq = toanHang1 + toanHang2;
        break;
    case '-':
        kq = toanHang1 - toanHang2;
        break;
    case '*':
        kq = toanHang1 * toanHang2;
        break;
    case '/':
        kq = toanHang1 / toanHang2;
    }
    return kq;
}
float TinhBieuThuc(stack &s, char bieuThuc[])
{
    float kq;
    char t[10];
    int i = 0;
    do
    {
        DocTu(bieuThuc,t,i); 

        if (LaToanTu(t))
        {
            char toanTu = t[0];
            float toanHangl = Pop(s);
            float toanHang2 = Pop(s);
            kq = TinhToan(toanHang2, toanHangl, toanTu);

            Push(s, kq);
        }
        else 
        {
            float toanHang = atof(t);
            Push(s, toanHang);
        }
        i++;
    } while (bieuThuc[i] != '\0');
    return Pop(s);
}
int main()
{
	stack s;
	Init(s);
	char bieuThuc[100] =" ";
	cout<<"Nhap bieu thuc dang hau to\n";
	fflush(stdin);
	gets(bieuThuc);
	float kq;
	kq = TinhBieuThuc(s,bieuThuc);
	cout<<"\n Gia tri cua bieu thuc la: "<<kq;
	return 0;
}
