package codes.pack;

public class Example {
	
	public static void main(String[]args){
		char forest [][]=new char[5][5];
		int a;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				a=(int) ((Math.random()*10)/5);
				//System.out.println(a);
				if(a==1)
					forest[i][j]='t';
				else
					forest[i][j]='w';
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(forest[i][j]+"  ");
			}
		System.out.println("");
		}
		
		int b,c;
		
		b=(int) ((Math.random()*10)/2);
		c=(int) ((Math.random()*10)/2);
		System.out.println(b+","+c);
		System.out.println("");
		System.out.println("");
		
	//	if(b==0||c==0){
			if(forest[b][c]=='t'){
				forest[b][c]='F';
				int x=b;
				int y=c;
				int e=0;
				int f=0;
				int g=0;
				int h=0;
				while(x<4&&x>0||y<4&&y>0){
					if(forest[x+1][y]=='t'){
						forest[x+1][y]='F';
					}if(forest[x-1][y]=='t'){
						forest[x-1][y]='F';
					}if(forest[x][y+1]=='t'){
						forest[x][y+1]='F';
					}if(forest[x][y-1]=='t'){
						forest[x][y-1]='F';
					}
					
					
					else{
						break;
					}
					
				}
				
			}else{
				System.out.println("fire fell on water");
			}
	System.out.println("if ended");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(forest[i][j]+"  ");
			}
		System.out.println("");
		}
		
	}

}
