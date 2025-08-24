class Worker {
    private String name;
    private int id;
    private double salary;
    Worker(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Worker(Worker other){
        this.name = other.name;
        this.id = other.id;
        this.salary = other.salary;
    }
    @Override
    public String toString(){
        return "name: "+this.name+" id: "+this.id+" salary: "+this.salary;
    }
}
