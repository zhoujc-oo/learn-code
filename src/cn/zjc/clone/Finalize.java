package cn.zjc.clone;

    class Finalize {
        private int x;
        public Finalize(int x) {
            this.x = x;
        }
        public void finalize() {
            System.out.println("Finalizing " + this.x);
        }
    }
    class Main {
        public static void main(String[] args) {
            for (int i = 0; i < 20; i++) {
                Finalize f= new Finalize(i);
                f.finalize();// 可显示的调用
            }
        }
    }


