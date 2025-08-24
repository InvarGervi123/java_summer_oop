class Manager extends Worker {
    

    Manager(String name,int id,double salary){
        super(name,id,salary);
    }
    Manager(Manager other){
        super(other);
    }
    String getWorkers(Worker[] worker){
        String s = "";
        for (int i =0; i<worker.length;i++){
            s += super.toString();
        }
        return s;
    }
    //Worker[] addWorker(Worker worker){

    //}
}
