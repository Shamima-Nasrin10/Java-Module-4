package taskthreaddemo30;

class PrintChar implements Runnable {

    private char charToPrint;
    private int times;

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 1; i < times; i++) {
            System.out.print(charToPrint);
        }
    }

}

class PrintNum implements Runnable {

    public int lastNum;

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i < lastNum; i++) {
            System.out.print(" " + i);
        }

    }

}
