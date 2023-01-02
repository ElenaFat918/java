package Lesson06;

//worker.java

public class Worker {
    int id;		//унив идент.
	int salary;	//зп
	String firstName;// имя
	String lastName;//фамилия

    @Override 
	public String toString(){	//переолпределили базовое поведение метода toString для вывода в консоль
		return String.format("id:%d fn:%s ln:%s s:%d",id, firstName, lastName, salary); //заведем переменную String res, определим шаблон(идентиф, имя, фамилия,  з.п.);
	}

	public int hashCode() {
		return id;
	}

    @Override 
	public boolean equals(Object o) {	//в метод приходит Object o
		Worker t = (Worker) o;		// кастовать Object o в Worker и сохранять в переменную
		return id == t.id && firstName == t.firstName;	
		/*
		если идентиф Worker совпадает с тем который нам дали и  
		firstName текущего Worker совпадает с firstName входящего Worker (t.firstName),
		 то эти сотрудники равны (экземпляры одинаковые)
		*/
	}
}
