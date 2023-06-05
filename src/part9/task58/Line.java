package part9.task58;

public class Line {
        private int head;
        private int line;
        private volatile int elementsCount;
        private final Integer[] myArrayLine;
        private Integer counter = 0;

        public Integer getCounter() {
            return counter;
        }
        public Line (int size) {
            myArrayLine = new Integer[size];
        }

        public void add(Integer element) {
            synchronized (this) {
                while (elementsCount >= 100) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                myArrayLine[head] = element;
                elementsCount++;

                if (head == myArrayLine.length - 1) {
                    head = 0;
                } else {
                    head++;
                }
                notifyAll();
            }
        }

        public void deletion() {
            synchronized (this) {
                while (getCount() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = myArrayLine[line];
                myArrayLine[line] = null;
                elementsCount--;

                if (line == myArrayLine.length - 1) {
                    line = 0;
                } else {
                    line++;
                }
                counter++;
                if (elementsCount <= 80) {
                    notifyAll();
                }
            }
        }

        public synchronized int getCount() {
            return elementsCount;
        }


    }
