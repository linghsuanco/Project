import java.io.*;
import java.util.Scanner;

class data{
	
	int[] number = new int[10]; 
	String[] name = new String[20];
	String[] id = new String[20];
	String[] email = new String[20];
	String[] phone_number = new String[20];

	void addfile(File fp) throws Exception //把file裡的資料加入到變數中
	{
		BufferedReader file = new BufferedReader(new FileReader(fp));
		// 使用BufferedReader讀取檔案，file是變數
		String ste;
		int i=0;
		
		while ((ste = file.readLine()) != null ) //如果一行沒有資料才停止迴圈
		{
			if(this.name[i] == null)
			{
				this.name[i] = ste;
			}
			else if(this.name[i]!=null && this.id[i]==null )
			{
				 this.id[i]=ste;
			}
			else if(this.id[i]!=null && this.email[i]==null)
			{
				this.email[i]=ste;
			}
			else if(this.email[i]!=null && phone_number[i]==null)
			{
				this.phone_number[i]=ste;
				i++;
			}
		}
		file.close();

		for( i=0; i<8; i++)
		{
			this.number[i] = i;
		}
		
		for(int n=0; n<8; n++)
		{
			this.name[n+10] = this.name[n];
			this.id[n+10] = this.id[n];
			this.email[n+10] = this.email[n];
			this.phone_number[n+10] = this.phone_number[n];
		}
	}
	void name_sort()
	{
		String tmp;
		for(int i =0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if( (this.name[j].compareTo(this.name[j+1]) > 0 ) )
				{
					tmp=this.name[j];
					this.name[j]=this.name[j+1];
					this.name[j+1]=tmp;
					
					tmp=Integer.toString(this.number[j]);
					this.number[j]=this.number[j+1];
					this.number[j+1]=Integer.valueOf(tmp);
				}
			}
		}
		for(int current=0; current<8; current++)
		{
			int s=0;
			s = this.number[current];
			this.id[current] = this.id[10+s];
			this.email[current] = this.email[10+s];
			this.phone_number[current] = this.phone_number[10+s];
		}
	}
	
	void id_sort()
	{
		for(int i=0;i<7;i++)
		{
			String tmp = null;

			for(int j=0;j<7;j++)
			{

				if( (this.id[j].compareTo(this.id[j+1]) > 0 ) )
				{
					tmp=this.id[j];
					this.id[j]=this.id[j+1];
					this.id[j+1]=tmp;
					
					tmp=Integer.toString(this.number[j]);
					this.number[j]=this.number[j+1];
					this.number[j+1]=Integer.valueOf(tmp);
				}
			}
		}
		for(int current=0; current<8; current++)
		{
			int s=0;
			s = this.number[current];
			this.name[current] = this.name[10+s];
			this.email[current] = this.email[10+s];
			this.phone_number[current] = this.phone_number[10+s];
		}
	}
}
public class Project3 {

	public static void main(String[] args) throws Exception 
	{
		
		File fp = new File("student_list.txt");
		data doc = new data();
		doc.addfile(fp);
		System.out.println("name sort or id ?");
		Scanner choice = new Scanner(System.in);
		String sort = choice.next();

		if(sort.compareTo("id") == 0)
		{
			doc.id_sort();
		}
		else if(sort.compareTo("name") == 0)
		{
			doc.name_sort();
		}
		
		for(int i=0;i<8;i++) {
			System.out.println(doc.name[i]);
			System.out.println(doc.id[i]);
			System.out.println(doc.email[i]);
			System.out.println(doc.phone_number[i]);
		}
		choice.close();
	}
}

