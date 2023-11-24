package no_patterns_practice;

public class FourtyPrograms {
	
	
	public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    
		    FourtyPrograms sh = new FourtyPrograms();
//		    sh.program_1();
//		    sh.program_2();
//		    sh.program_3();
//		    sh.program_4();
//		    sh.program_5();
//		    sh.program_6();
//		      sh.program_7();
//		    sh.program_8();
//		    sh.program_9();// have on eye
//		    sh.program_10();
//		    sh.program_11();// have on eye
//		    sh.program_12();
//		    sh.program_13();
//		    sh.program_14();
//		    sh.program_15();
//		    sh.program_16();
//		    sh.program_17();
//		    sh.program_18();
//		    sh.program_19();
//		    sh.program_20();
//		    sh.program_21();
//		      sh.program_22();//pascal numbers
//		    sh.program_23();//pascal alphabets
//		    sh.program_24();
//		    sh.program_25();
//		    sh.program_26();
//		    sh.program_27(); 
//		    sh.program_28();
//		    sh.program_29();
//		    sh.program_30();
//		    sh.program_31();
//		    sh.program_32();
//		    sh.program_33(); 
//		    sh.program_34();
//		    sh.program_35();
//		    sh.program_36();
//		    sh.program_37();
//		    sh.program_38();
//		    sh.interveiw_test_1();
//		    sh.program_39();
//		    sh.program_40();
//		    sh.complicate_1_Butterfly();
		    
		  }

		  
		  
		  private void complicate_1_Butterfly() {
		    // TODO Auto-generated method stub
		    
		    for(int A=1; A<=5; A++ )
		    {
		      for(int star=1; star<=A; star++ )
		      {
		        System.out.print("*");
		      }
		      
		      for(int b=5; b>A; b--)
		      {
		        System.out.print(" ");
		      }
		      
		      for(int c=5; c>A; c--)
		      {
		        System.out.print(" ");
		      }
		      
		      
		      
		      for(int bar=1; bar<=A; bar++ )
		      {
		        System.out.print("*");
		      }
		      
		      System.out.print("\n");
		      
		    }
		    
		    for(int D=1; D<=5; D++)
		    {
		      
		      for(int boll=5; boll>=D; boll-- )
		      {
		        System.out.print("*");
		      }
		      
		      
		      for(int E=1; E<D; E++ )
		      {
		        System.out.print(" ");
		      }
		      
		      
		      
		      for(int F=1; F<D; F++ )
		      {
		        System.out.print(" ");
		      }
		      
		      
		      
		      for(int tall=5; tall>=D; tall-- )
		      {
		        System.out.print("*");
		      }
		      
		      
		      
		      System.out.print("\n");
		      
		    }
		    
		    
		    
		  }



		  private void program_40() {
		    // TODO Auto-generated method stub
		    
		    for(int h =1; h<=5; h++)
		    {
		      
		    for(int star =5; star>h; star--)
		    
		    {
		      System.out.print(" ");
		    }
		    
		    for(int i=1; i<=h; i++)
		    {
		      System.out.print("*" + " ");
		    }
		    
		    
		    
		    
		    
		    System.out.print("\n");
		    
		    }
		  
		    
		    for(int y=1; y<=5; y++)
		    {
		      
		    
		    
		    
		    for(int x=1; x<=y; x++)
		    {
		      System.out.print(" ");
		    
		    }
		    
		    
		    for(int z=1; z<=5-y; z++)
		    {
		      System.out.print("*" + " ");
		    
		    }
		    
		    
		    
		     System.out.print("\n");
		    }
		    }
		    
		  



		  private void program_39() {
		    // TODO Auto-generated method stub
		    
		    for(char i='A'; i<='E';i++)
		    {
		      
		    for(char star ='E'; star>i; star--)
		    {
		      System.out.print(" ");
		    }
		    
		    for(char j='A'; j<=i; j++)
		    {
		      System.out.print(j+" ");
		    }
		    
		    
		    System.out.print("\n");
		       
		    }
		    

		     for(char y='D'; y>='A'; y--)
		     {
		       
		     for(char bar='D'; bar>=y; bar--)
		     {
		       System.out.print(" ");
		     } 
		     
		     for(char z='A'; z<=y; z++)
		       
		     {
		       System.out.print(z+" ");
		     }  
		     
		     System.out.print("\n");
		     
		    }
		  }
		     
		       
		     
		    
		  



		  private void interveiw_test_1() {
		    // TODO Auto-generated method stub
		    for(int i =1; i<=8; i++)
		    {  
		  for(int star=8; star>=i; star--)
		  {
		    System.out.print(" ");
		  }
		    
		  
		  
		  for(int j=4; j<=i; j++)
		  {
		    System.out.print(j+" ");
		  }
		    
		    
		  System.out.print("\n");  
		    
		      
		    }  
		    
		  }

		private void program_38() {
		    // TODO Auto-generated method stub
		  for(int h =1; h<=5; h++)
		    {
		      
		    for(int star =5; star>h; star--)
		    
		    {
		      System.out.print(" ");
		    }
		    
		    for(int i=1; i<=h; i++)
		    {
		      System.out.print(i + " ");
		    }
		    
		    
		    
		    
		    
		    System.out.print("\n");
		    
		    }
		  
		    
		    for(int y=1; y<=5; y++)
		    {
		      
		    
		    
		    
		    for(int x=1; x<=y; x++)
		    {
		      System.out.print(" ");
		    
		    }
		    
		    
		    for(int z=1; z<=5-y; z++)
		    {
		      System.out.print(z + " ");
		    
		    }
		    
		    
		    
		     System.out.print("\n");
		    }
		    }
		  

		  private void program_37() {
		    // TODO Auto-generated method stub
		    for(char j='A'; j<='E'; j++)
		    {
		      
		      for(char i ='E'; i>j; i--)
		      {
		        System.out.print("A");
		      }
		      
		      
		      
		      
		      for(char k='A'; k<=j; k++)
		      {
		        System.out.print(j);
		      }
		      
		      System.out.print("\n");
		      
		    }
		    
		    
		  }



		  private void program_36() {
		    // TODO Auto-generated method stub
		    
		    for(int i=1; i<=5; i++)
		    {
		    
		    for(int star=5; star>i;star--)
		    {
		      System.out.print(1);
		    }
		    
		    for(int j=1; j<=i; j++)
		    {
		      System.out.print(i);
		    }
		    
		    
		    System.out.print("\n");
		    
		    }
		    
		  }



		  private void program_35() {
		    // TODO Auto-generated method stub
		    
		    for(int j=1; j<=5; j++)
		    {
		    
		      for(int i=1; i<j; i++)
		      {
		        System.out.print("0");
		      
		      }
		      {
		        System.out.print(j);
		      }
		      
		      for(int y=5; y>j; y--)
		      {
		        System.out.print("0");
		      }
		      
		      System.out.print("\n");
		      
		    }
		    
		  }



		  private void program_34() {
		    // TODO Auto-generated method stub
		    
		    for(char j='A' ; j<='D'; j++)
		    {
		      
		    for(char star ='D'; star >=j; star--)
		    {
		      System.out.print("  ");
		    }
		      
		    
		    for(char k ='A'; k < j; k++)
		    {
		      System.out.print(k + " ");
		    }
		      
		    for(char y = j; y>='A'; y--)
		    {
		      System.out.print(y + " ");
		    }
		    
		    
		    System.out.print("\n");
		    
		    
		    
		    }
		    
		  }



		  private void program_33() {
		    // TODO Auto-generated method stub
		    
		    
		    for(int j=1; j<=4;j++)
		    {
		    
		    for(int star=4; star>=j;star--)
		    {
		      System.out.print("  ");
		    }
		    
		    
		    for(int y=1; y<j;y++)
		    {
		      System.out.print(y + " ");
		    }
		    
		    for(int i=j;i>=1;i--)
		    
		    {
		      System.out.print(i + " ");
		    }
		    
		    
		    System.out.print("\n");
		    
		    }
		    
		    
		  }



		  private void program_32() {
		    // TODO Auto-generated method stub
		    
		    for(int j=5; j>=1; j--)
		    {
		      
		    for(int i=1; i<=j; i++)  
		    {
		      
		      System.out.print("*");
		    }
		    
		    System.out.print("\n");
		    
		    }
		    
		    for(int z=2; z<=5; z++)
		    {
		      
		    for(int y=1; y<=z; y++)  
		    {
		      
		      System.out.print("*");
		    }
		    
		    System.out.print("\n");
		    
		    }
		    
		    
		  }



		  private void program_31() {
		    // TODO Auto-generated method stub
		    
		    for(char j='E'; j>='A';j--)
		    {
		      
		    for  (char i=j; i>='A';i--)
		    {
		      System.out.print(i);
		    }
		      
		    System.out.print("\n");  
		      
		    }
		    
		    
		    for(char z ='B'; z<='E'; z++)
		    {
		      
		    
		      for(char y=z; y>='A'; y--)
		      {
		        System.out.print(y);
		      }
		      
		      
		      System.out.print("\n");  
		      
		    }
		    
		  }



		  private void program_30() {
		    // TODO Auto-generated method stub
		    
		    for(char j='E';j>='A'; j--)
		    {
		    for(char i ='A'; i<=j; i++)
		    {
		      System.out.print(i);
		    }
		    
		    System.out.print("\n");
		    }
		    
		    
		    for(char z='B'; z<='E';z++)
		    {
		      
		    for(char y ='A'; y<=z ;y++)
		    {
		      System.out.print(y);
		    }
		      
		    System.out.print("\n");  
		      
		    }
		  }

		private void program_29() {
		    // TODO Auto-generated method stub
		    
		    for(int a=5; a>=1; a--)
		    {
		    for(int b=a; b>=1; b--)
		    {
		      System.out.print(b+" ");
		    }
		    
		    System.out.print("\n");
		    
		    }
		    
		  
		    
		  for(int y =1; y<=5; y++)
		    
		  {
		  
		    for(int x=y; x>=1; x--)
		    {
		    
		      System.out.print(x+" ");
		    
		    }
		    
		    System.out.print("\n");
		  }
		    
		      }



		  private void program_28() {
		    // TODO Auto-generated method stub
		    
		    for(int j=5; j>=1; j--)
		    {
		      
		      
		      for(int i=1; i<=j; i++)
		      {
		        System.out.print(i);
		      }
		      
		      System.out.print("\n");
		    }
		    
		    
		    for(int z =2; z<=5; z++)
		    {
		      
		      
		      for(int a = 1; a<=z; a++)
		      {
		        System.out.print(a);
		      }
		    
		    
		    System.out.print("\n");
		    
		    
		    
		    }
		    
		  }



		  private void program_27() {
		    // TODO Auto-generated method stub
		    for(int i= 1; i<=5; i++)
		     {
		      
		    for(int star=5; star>i; star--)  
		    {
		      System.out.print(" ");
		    }
		      
		      
		      for(int j=1; j<=i; j++)
		      {
		        System.out.print("*");
		      }
		      
		     
		      System.out.print("\n");
		      
		     }
		    
		    for(int A=1; A<=4; A++)
		    {
		      
		      for(int bar = 1; bar<=A; bar++)
		      {
		        System.out.print(" ");
		      }
		    
		      
		      for(int b=4; b>=A; b--)
		      
		      {
		        System.out.print("*");
		      }
		      
		      
		      System.out.print("\n");
		      
		    }
		    
		  }
		  

		  
		    
		    
		  



		  private void program_26() {
		    // TODO Auto-generated method stub
		    for(int j=1; j<=5; j++)
		    {
		    for(int i=1; i<=j; i++)  
		    {
		      System.out.print("*" +" ");
		    }
		    
		    
		      System.out.print("\n");
		    }
		      
		      for(int k = 5; k>=1; k--)
		      {
		        
		      for(int p=1;p<k;p++)  
		      {
		        System.out.print("*" + " ");
		      }
		      
		      System.out.print("\n");
		        
		      }
		      
		      }
		    
		  



		  private void program_25() {
		    // TODO Auto-generated method stub
		    for(char j='A'; j<='E'; j++)
		    {
		    for(char i='A'; i<=j; i++)  
		    {
		      System.out.print(i +" ");
		    }
		    
		    
		      System.out.print("\n");
		    }
		      
		      for(char k = 'E'; k>='A'; k--)
		      {
		        
		      for(char p='A';p<k; p++)  
		      {
		        System.out.print(p + " ");
		      }
		      
		      System.out.print("\n");
		        
		      }
		      
		      }
		    
		  



		  private void program_24() {
		    // TODO Auto-generated method stub
		    for(int j=1; j<=5; j++)
		    {
		    for(int i=1; i<=j; i++)  
		    {
		      System.out.print(i +" ");
		    }
		    
		    
		      System.out.print("\n");
		    }
		      
		      for(int k = 5; k>=1; k--)
		      {
		        
		      for(int p=1;p<k;p++)  
		      {
		        System.out.print(p + " ");
		      }
		      
		      System.out.print("\n");
		        
		      }
		      
		      }
		      
		    
		    
		    
		  
		  



		  private void program_23() {
		    // TODO Auto-generated method stub
		    for(char i='A'; i<='E';i++)
		    {
		    for(char s='E';  s>=i ;  s--)
		    {
		      System.out.print(" ");
		    }
		          char temp='A';
		          
		          for(char k='A';k<=i;k++)
		          {
		           System.out.print(temp + " ");
		            temp =  (char) (temp*(i-k)/k);
		          }
		    
		  }
		  }



		  private void program_22() {
		    // TODO Auto-generated method stub
		    
		    for(int i=1; i<=5;i++)
		    {
		    for(int s=5;  s>=i ;  s--)
		    {
		      System.out.print(" ");
		    }
		          int temp=1;
		          
		          for(int k=1;k<=i;k++)
		          {
		           System.out.print(temp + " ");
		           temp=temp*(i-k)/k;
		          }
		    
		    
		    System.out.print("\n");
		  }
		  }



		  private void program_21() {
		    // TODO Auto-generated method stub
		    char num = 'A';
		    for(char j='A'; j<='E'; j++)
		    {
		      
		      
		      for(char i='A'; i<=j; i++)
		      {
		        System.out.print(num +" ");
		        num++;
		      }
		      
		      
		      System.out.print("\n");
		      
		      
		    }
		    
		  }

		private void program_20() {
		    // TODO Auto-generated method stub
		    
		    for(char j = 'E'; j>='A'; j--)
		    {
		    
		    for(char i = 'E'; i>=j; i--)
		    {
		      System.out.print(i + " ");
		      
		    }
		    System.out.print("\n");
		    }
		    
		    }
		  
		  



		  private void program_19() {
		    // TODO Auto-generated method stub
		    for(char j='A'; j<='E' ; j++)
		    {
		    for(char i ='E'; i>=j; i--)  
		    {
		      System.out.print(i);
		    }
		      System.out.print("\n");
		      
		    }
		      
		  }



		  private void program_18() {
		    // TODO Auto-generated method stub
		    for(char A = 'E'; A>='A';A--)
		    {
		    for(char M = 'A'; M<=A; M++)  
		    {
		      System.out.print(M);
		    }
		      
		    System.out.print("\n");  
		      
		    }
		    
		  }



		  private void program_17() {
		    // TODO Auto-generated method stub
		    int num =1;
		    for(int j =1 ; j<=5; j++)
		    {
		      
		      for(int i= 1; i<=j; i++)
		      {
		        System.out.print(num+" ");
		        num++;
		      }
		      
		      System.out.print("\n");
		      
		    }
		    
		    
		  }



		  private void program_16() {
		    // TODO Auto-generated method stub
		    for(int j=5; j>=1 ; j--)
		    {
		    
		      for(int i=5; i>=j; i--)
		      {
		        System.out.print(i);
		      }
		      
		      System.out.print("\n");
		      
		      
		    }
		    
		  }



		  private void program_15() {
		    // TODO Auto-generated method stub
		    for(int j=1; j<=5; j++)
		    {
		      for(int i=5; i>=j; i--)
		      {
		        System.out.print(i);
		      }
		      
		      System.out.print("\n");
		      
		    }
		  }



		  private void program_14() {
		    // TODO Auto-generated method stub
		    
		    for(int count =5; count>=1; count--)
		    {
		      for(int i=1; i<=count; i++)
		      {
		        System.out.print(i);
		      }
		      
		      System.out.print("\n");
		      
		    }
		    
		  }



		  private void program_13() {
		    // TODO Auto-generated method stub
		    
		    for(char count ='A'; count<='E'; count++)
		    {
		      
		      for(char star = 'E'; star>count; star--)
		      {
		        System.out.print(" ");
		      }
		      
		      for(char N ='A'; N<=count; N++)
		      {
		        System.out.print(count+" ");
		      }
		      
		      
		      System.out.print("\n");
		      
		    }
		    
		  }



		  private void program_12() {
		    // TODO Auto-generated method stub
		    for(int count=1; count<=5; count++)
		    {
		      
		      for(int star=5; star>=count; star--)
		        
		      {
		        System.out.print(" ");
		      }
		      
		    for(int N=1; N<= count; N++)
		    {
		      System.out.print(count+" ");
		    }
		      
		    System.out.print("\n");
		    }
		    
		  }



		  private void program_11() {
		    // TODO Auto-generated method stub
		    
		    for(int count = 1; count<=5; count++)
		    {
		      
		    for(int star=5; star >=count;  star--)  
		    {
		      System.out.print(" ");
		    }
		      
		    for(int n = 1; n<=(count*2)-1; n++)  
		    {
		      System.out.print("*");
		    }
		      
		    System.out.print("\n");
		    
		    
		    
		    }
		    
		    
		    
		  }

		void program_10() {
		    
		    for(char i= 'E'; i>='A'; i--)
		    {
		      for(char j= 'A'; j<i; j++)
		      {
		        System.out.print(" ");
		      }
		      
		      
		      for(char k=i; k<='E'; k++)
		      {
		        System.out.print(k+" ");
		      }
		      
		      System.out.print("\n");
		    }
		    
		    
		    
		    
		    
		  }
		  
		  
		  
		  
		  void program_9() {
		    
		  for(char count = 'A'; count<='E'; count++)
		  {
		    
		    for(char star = 'E' ; star>=count ; star--)
		    {
		      System.out.print(" ");
		    }
		    
		    for(char N = 'A' ; N<=count; N++)
		    {
		      System.out.print(N+" ");
		    }
		    
		    System.out.print("\n");
		    
		  }
		  }
		  
		  
		  
		  
		  
		  
		  private void program_8() {
		    // TODO Auto-generated method stub
		    for(int i= 5; i>=1; i--)
		    {
		      for(int j= 1; j<i; j++)
		      {
		        System.out.print(" ");
		      }
		      
		      
		      for(int k=i; k<=5; k++)
		      {
		        System.out.print(k+" ");
		      }
		      
		      System.out.print("\n");
		    }
		    
		    }
		    
		  
		  private void program_7() {
		    // TODO Auto-generated method stub
		    
		    for(int j =5; j>=1; j--)
		    {
		      
		      for(int star=1; star<j; star++)
		      {
		        System.out.print(" ");
		      }
		      
		      for(int k=1; k<=6-j; k++)
		      {
		        System.out.print(k+" ");
		      }
		      
		       System.out.print("\n");
		      
		    }
		  }

		  private void program_6() {
		    // TODO Auto-generated method stub
		    
		    for(int j =5; j>=1; j--)
		    {
		      
		      for(int star=1; star<j; star++)
		      {
		        System.out.print(" ");
		      }
		      
		      for(int k=1; k<=6-j; k++)
		      {
		        System.out.print("*");
		      }
		      
		       System.out.print("\n");
		      
		      
		    }
		    
		    
		    
		    
		  }

		  private void program_5() {
		    // TODO Auto-generated method stub
		    for(char j='A' ; j<='E'; j++)
		    {
		    for(char i = 'A'; i<=j; i++)
		    {
		      
		      System.out.print(j);
		      
		    }
		     System.out.print("\n");
		  }
		    
		  }

		  private void program_4() {
		    // TODO Auto-generated method stub
		    for(int j=1 ; j<=5; j++)
		    {
		    for(int i = 1; i<=j; i++)
		    {
		      
		      System.out.print(j);
		      
		    }
		     System.out.print("\n");
		  }
		    
		  }

		  private void program_3() {
		    // TODO Auto-generated method stub
		    for(int j=1 ; j<=5; j++)
		    {
		    for(int i = 1; i<=j; i++)
		    {
		      
		      System.out.print("*");
		      
		    }
		     System.out.print("\n");
		     
		    
		  }
		    
		  }
		  private void program_2() {
		    // TODO Auto-generated method stub
		    
		    for(char j='A' ; j<='E'; j++)
		    {
		    for(char i = 'A'; i<=j; i++)
		    {
		      
		      System.out.print(i);
		      
		    }
		     System.out.print("\n");
		  }
		    
		    
		  }

		  private void program_1() {
		    // TODO Auto-generated method stub
		     
		    for(int j=1 ; j<=5; j++)
		    {
		    for(int i = 1; i<=j; i++)
		    {
		      
		      System.out.print(i);
		      
		    }
		     System.out.print("\n");
		  }

		}
		}
		    



