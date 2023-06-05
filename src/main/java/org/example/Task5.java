package org.example;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
            public static void main(String[] args) {
            Stream<Integer> first = Stream.of(0, 1);
            Stream<Integer> second = Stream.of(0, 1);

            Stream<Integer> zippedStream = zip(first, second);
            zippedStream.forEach(System.out::println);
        }

        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            Iterator<T> firstIterator = first.iterator();
            Iterator<T> secondIterator = second.iterator();

            Iterator<T> zippedIterator = new Iterator<T>() {
                @Override
                public boolean hasNext() {
                    return firstIterator.hasNext() || secondIterator.hasNext();
                }

                @Override
                public T next() {
                    if (firstIterator.hasNext()) {
                        return firstIterator.next();
                    } else {
                        return secondIterator.next();
                    }
                }
            };

            Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zippedIterator, 0);
            return StreamSupport.stream(spliterator, false);
        }
    }

