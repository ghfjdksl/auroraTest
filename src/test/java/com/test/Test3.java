package com.test;

public class Test3 {
//    public static void main(String[] args) throws Exception {
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        AtomicInteger counter = new AtomicInteger(0);
//        AsyncHttpClientConfig config = new DefaultAsyncHttpClientConfig.Builder()
//                .setMaxConnections(1)
//                .setKeepAlive(true)
//                .build();
//        AsyncHttpClient asyncHttpClient = new DefaultAsyncHttpClient(config);
//        for (int i = 0; i < 100; i++) {
//           final ListenableFuture<Response> f = asyncHttpClient.preparePost("https://b.proxy.aws.nevec.vip.tw1.yahoo.com/pigeon/api/pigeon/v1/messages/CQI.nevec.test/?expiry=10")
//                    .setBody("foobar" + i)
//                    .execute();
//           CompletableFuture<Response> completableFuture = f.toCompletableFuture();
//           completableFuture.thenRun(new Runnable() {
//            
//            @Override
//            public void run() {
//                System.out.println("okok");
//            }
//        });
////           executor.submit(new Callable<Void>() {
////                @Override
////                public Void call() throws Exception {
////                    Response response = f.get();
////                    System.out.println("aa" + response);
////                    //System.out.println(counter.incrementAndGet());
////                    return null;
////                }
////               
////           });
//        }
////        for (int i = 0; i < 100; i++) {
////            System.out.println("counter: " + counter.get());
////            Thread.sleep(100);
////        }
////        asyncHttpClient.close();
//        System.out.println("done");
//    }
}
