package model;

public class Kotik {
        private int feedTheCat;
        private static int instanceOfClass = 0;

        public static void eat() {

        }

        public static void play() {

        }

        public static void sleep() {

        }

        public static void chaseMouse() {

        }

        public static void walk() {

        }

        public static void lookInWindow() {

        }

        public static int countClass() {
            instanceOfClass++;
            return instanceOfClass;
        }

        public static void liveAnotherDay() {
            for (int i = 0; i < 24; i++) {
                int num = (int) (Math.random()*6+1);
                switch(num) {
                    case 1:
                        System.out.println(play());
                        break;
                    case 2:
                       System.out.println(sleep());
                        break;
                    case 3:
                        System.out.println(chaseMouse());
                        break;
                    case 4:
                        System.out.println(walk());
                        break;
                    case 5:
                        System.out.println(lookInWindow());
                        break;
                    case 6:
                        System.out.println(eat());
                        break;
                }
            }
        }
}
