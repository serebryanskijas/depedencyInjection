package com.example.depedencyinjection.dt;

    public class DiCar {
        public static void main(String[] args) {
            IEngine engine = new Engine();
        Car car = new Car(engine);
        car.start();
        }
    }
    interface IEngine{
        void start();
    }

    class Engine implements IEngine{

        @Override
        public void start() {
            System.out.println("Engine is start");
        }
    }


    class Car{
        //Самый неудачный вариант
        //private Engine engine = new Engine();
        private IEngine engine;

        public Car(IEngine engine){
            this.engine=engine;
        }

        public void start(){
            engine.start();
        }

    }
