//package Thrd;
//
//public class TestLock {
//    public class Counter{
//        private int count = 0;
//        public int inc(){
//            synchronized (this);
//            return ++count;
//        }
//    }
//    public class Counter2{
//        private Lock lock = new Lock();
//        private int count = 0;
//        private int inc2(){
//            lock.lock();
//            int newCount = ++count;
//            lock.unlock();
//            return newCount;
//        }
//
//    }
//}
