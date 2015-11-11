package service.impl;

//        Storage.getInstance().putToStorage(AVAILABLE_TRANSITS_KEY, Arrays.asList(
//                //from 1 to 2
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(3), getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(0), getByPostCode(6), getByPostCode(7), getByPostCode(1)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(7), getByPostCode(1)), random.nextInt(100) + 20),
//                //from 1 to 3
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(4), getByPostCode(2),getByPostCode(5),getByPostCode(3)), random.nextInt(100) + 20),
//                //from 1 to 4
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(3), getByPostCode(2),getByPostCode(5),getByPostCode(4)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(4)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(3)), random.nextInt(100) + 20),
//                //from 1 to 5
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(4), getByPostCode(2),getByPostCode(5)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(0), getByPostCode(6), getByPostCode(4)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(0), getByPostCode(5), getByPostCode(3), getByPostCode(4)), random.nextInt(100) + 20),
//                //from 0 to 5
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(7), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(7), getByPostCode(4), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
//                //from 0 to 6
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(1), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
//                //from 0 to 7
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(7)), random.nextInt(100) + 20),
//
//                //from 2 to 1
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(5), getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(0), getByPostCode(2)), random.nextInt(100) + 20),
//                //from 2 to 3
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(4), getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4), getByPostCode(3)), random.nextInt(100) + 20),
//                //from 2 to 4
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(5), getByPostCode(3),getByPostCode(1),getByPostCode(4)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(4)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4)), random.nextInt(100) + 20),
//                //from 2 to 5
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(4), getByPostCode(1),getByPostCode(3),getByPostCode(5)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(5)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(1), getByPostCode(7), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
//                //from 1 to 6
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
//                //from 1 to 7
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(1), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
//
//                //from 3 to 1
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(2), getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
//                //from 3 to 2
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(1), getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(4)), random.nextInt(100) + 20),
//                //from 3 to 4
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5), getByPostCode(2),getByPostCode(4)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(1), getByPostCode(4)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(2), getByPostCode(0), getByPostCode(6), getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
//                //from 3 to 5
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(1), getByPostCode(4),getByPostCode(2),getByPostCode(5)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(2), getByPostCode(0), getByPostCode(5), getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
//                //from 2 to 7
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(1), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(2), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
//
//                //from 4 to 1
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(1)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(2), getByPostCode(5),getByPostCode(3), getByPostCode(1)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(7), getByPostCode(4)), random.nextInt(100) + 20),
//                //from 4 to 2
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(1),getByPostCode(3),getByPostCode(5),getByPostCode(2)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(2)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(3), getByPostCode(4), getByPostCode(7), getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
//                //from 4 to 3
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(1), getByPostCode(3)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(2), getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
//                //from 4 to 5
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(2), getByPostCode(5)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(1), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(3), getByPostCode(5), getByPostCode(0), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
//
//                //from 4 to 5
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(3), getByPostCode(5)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(7), getByPostCode(0), getByPostCode(5)), random.nextInt(100) + 20),
//                //from 4 to 6
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(5), getByPostCode(0), getByPostCode(6)), random.nextInt(100) + 20),
//                //from 4 to 7
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(6), getByPostCode(7)), random.nextInt(100) + 20),
//                new com.logistic.impl.model.transport.Transit(Arrays.asList(
//                        getByPostCode(4), getByPostCode(5), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
//
//                //from 5 to 1
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(3),getByPostCode(1)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(2), getByPostCode(4),getByPostCode(1)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(5), getByPostCode(5), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20),
//                //from 5 to 2
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(3), getByPostCode(1),getByPostCode(4),getByPostCode(2)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(2)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(5), getByPostCode(0), getByPostCode(7), getByPostCode(6)), random.nextInt(100) + 20),
//
//                //from 5 to 3
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(2),getByPostCode(4),getByPostCode(1),getByPostCode(3)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(3)), random.nextInt(100) + 20),
////                new com.logistic.impl.model.transport.Transit(Arrays.asList(
////                        getByPostCode(6), getByPostCode(0), getByPostCode(7)), random.nextInt(100) + 20)
//
//                 //from 5 to 4
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(2),getByPostCode(4)), random.nextInt(100) + 20),
//                new model.transport.Transit(Arrays.asList(
//                        getByPostCode(5), getByPostCode(3),getByPostCode(1),getByPostCode(4)), random.nextInt(100) + 20),
//        ));
