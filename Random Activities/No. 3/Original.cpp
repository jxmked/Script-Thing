#include<iostream>
#include<ctime>

#include<unistd.h>


using namespace std;



void clrscr(void){
    system("CLS");
}

int main()
{
    int random,score1;
    string ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    int life = 5; 
    int score = 0;
    srand(time(NULL));
    random = (rand()%10);
  
    while ( life != 0)
    {
    if (random== 0)
    
    { 	
    
    cout<<"Which month comes next ? \n";
    cout<<"August September, October, November, ________ \?\n";
    cout<<"Answer : ";
    cin>>ans1;
    
              if ( ans1 == "December" || ans1 == "december")  
              {
              
              
    //loading dot animation
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\n" <<flush;
clrscr();

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
              cout<<"                 Your answer is correct ! \n\n";
            score =  (score + 133);
            cout<<"+ 133 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
            cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;	
              
              random = (rand()%8);
              }
              
              else
              
              {
   //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();          
    cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
              	 	
              cout<<"                 Sorry, your answer is wrong! \n\n";
              cout<<"- 1 life \n\n";
              cout<<"New score : "<<score<<endl;
              cout<<"Your remaining life : "<<life<<endl;
             
              life--;
 cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
              
              random = (rand()%7);
              }
              
    }
    
    else if (random == 1)
    
    {
      	
      	cout<<"Which month would you expect to be coldest? \n";
        cout<<"Answer :";
        cin>>ans2;
             if ( ans2 == "December" || ans2 == "december")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr(); 
    
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n\n";
            score =  (score + 135);
            cout<<"+ 135 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
            
             cout<<"                 Sorry, your answer is wrong ! \n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
             cout<<"Your remaining life : "<<life<<endl;
        
             life--;
             
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%6);
            
        
             }
             
    }
    else if (random == 2)
    
    {
      	cout<<"How many months begin with the letter 'J'? \n";
        cout<<"Answer :";
        cin>>ans3;
             if ( ans3 == "3" || ans3 == "Three" || ans3 == "three")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 128);
            cout<<"+ 128 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%9);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }   
    
     else if (random == 3)
    
    {
      	cout<<"Which of the below option is an odd number? \n";
      	cout<<"1   ,     4    ,   12   ,     22  , \n";
        cout<<"Answer :";
        cin>>ans3;
             if ( ans4 == "1" || ans4 == "One" || ans4 == "one")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 118);
            cout<<"+ 118 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%8);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }  
    
    else if (random == 5)
    
    {
      	cout<<"3/4 is an example of which of these? \n";
      	cout<<" (a). decimal (b). fraction (c). odd number  (d). rational number. \n";
        cout<<"Answer :";
        cin>>ans5;
             if ( ans5 == "b" || ans5 == "Fraction" || ans5 == "B" || ans5 == "fraction")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 131);
            cout<<"+ 131 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%5);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%9);
            
        
             }
             
    } 
    else if (random == 6)
    
    {
      	cout<<"The planet closest to the sun is ... ? \n";
        cout<<"Answer :";
        cin>>ans6;
             if ( ans6 == "Mercury" || ans6  == "mercury" || ans6 == "MERCURY")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 126);
            cout<<"+ 126 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }
    
    else if (random == 7)
    
    {
      	cout<<"Which of the world's oceans is the largest? \n";
      	cout<<"(a). atlantic (b). pacific (c). indian (d). southern \n";
        cout<<"Answer :";
        cin>>ans7;
             if ( ans7  == "b" || ans7 == "(b)" || ans7 == "Pacific" || ans7 == "pacific")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 139);
            cout<<"+ 139 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }
    
    else if (random == 8)
    
    {
      	cout<<"The earth has a crust, a mantle, and what else?  \n";
      	cout<<"(a).basin (b).sink (c).range (d).core \n";
        cout<<"Answer :";
        cin>>ans8;
             if ( ans8 == "d" || ans8 == "D" || ans8 == "core" || ans8 == "Core" || ans8 == "Core")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 137);
            cout<<"+ 137 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }
    else if (random == 9)
    
    {
      	cout<<"Which of these words means \"to set up\"?\n";
      	cout<<"(a). correct (b). establish (c). dissemble (d).articulate \n";
        cout<<"Answer :";
        cin>>ans9;
             if ( ans9 == "b" || ans9 == "B" || ans9 == "Establish" || ans9 == "establish")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 148);
            cout<<"+ 148 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%10);
            
        
             }
             
    }
    else if (random == 10)
    
    {
      	cout<<"When written as a percent, 4/5 is which of these? \n";
      	cout<<"(a). 5% (b). 45% (c).80% (d). 55% \n";
        cout<<"Answer :";
        cin>>ans10;
             if ( ans10 == "80" || ans10 == "80%" || ans10 == "80 %" || ans10 == "(c)")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 141);
            cout<<"+ 141 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%10);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%4);
            
        
             }
             
    }
    
    else if (random == 4)
    
    {
      	cout<<"Which of these is a conjunction? \n";
      	cout<<"(a).  A (b).But (c). Hardly (d). with \n";
        cout<<"Answer :";
        cin>>ans4;
             if ( ans4 == "b" || ans4 == "But" || ans4 == "but")
             {
                  
                  //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();  
   
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;

               cout<<"                 Your answer is correct ! \n";
            score =  (score + 140);
            cout<<"+ 140 points \n\n";
            cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;
           
            
               random = (rand()%8);
               
cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
               
               
             }
             else
             {
    //loading dot animation          	
cout<<"• Checking Answer"<<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;

cout<<"."<<flush;

cout<<"."<<flush;

cout<<"."<<flush;
cout << "\b\b\b" <<flush;
clrscr();   

cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;   
           
             cout<<"                 Sorry, your answer is wrong ! \n\n";
             cout<<"- 1 life \n\n";
             cout<<"New score : "<<score<<endl;
            cout<<"Your remaining life : "<<life<<endl;            
             life--;
             cout<<"••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••"<<endl;
             
             random = (rand()%5);
            
        
             }
             
    }
    
 }
}
