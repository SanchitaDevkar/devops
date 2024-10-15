//to print a string is palindrome or not by using reverse
class pali1{
public static void main(String args[])
{
String s1="madam";
String rev="";
for(int i=s1.length()-1;i>=0;i--)
{
char ch=s1.charAt(i);
rev=rev+ch;
}
if(s1.equals(rev))
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
