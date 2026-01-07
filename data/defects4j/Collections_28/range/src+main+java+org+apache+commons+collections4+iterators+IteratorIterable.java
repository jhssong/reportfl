{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/IteratorIterable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e"
      ],
      "begin_line": 63,
      "end_line": 133,
      "comment": "\n * Adapter to make an {@link Iterator Iterator} instance appear to be an\n * {@link Iterable Iterable} instance.  The iterable can be constructed in one\n * of two variants:  single use, multiple use.\n *\n * \u003cp\u003e\n * In the single use iterable case, the iterable is only usable for one\n * iterative operation over the source iterator.  Subsequent iterative\n * operations use the same, exhausted source iterator.  To create a single use\n * iterable, construct a new {@link IteratorIterable} using a {@link Iterator}\n * that is NOT a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * In the multiple use iterable case, the iterable is usable for any number of\n * iterative operations over the source iterator.  Of special note, even though\n * the iterable supports multiple iterations, it does not support concurrent\n * iterations. To implicitly create a multiple use iterable, construct a new\n * {@link IteratorIterable} using a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Integer[] array \u003d {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)};\n *   Iterator\u003cInteger\u003e iterator \u003d IteratorUtils.arrayIterator(array); // a resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * A multiple use iterable can also be explicitly constructed using any\n * {@link Iterator} and specifying \u003ccode\u003etrue\u003c/code\u003e for the\n * \u003ccode\u003emultipleUse\u003c/code\u003e flag:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator, true);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.createTypesafeIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 69,
      "end_line": 86,
      "comment": "\n     * Factory method to create an {@link Iterator Iterator} from another\n     * iterator over objects of a different subtype.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 85,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-a90b8fba-eb42-46e5-9625-acc608195dc9.hasNext()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 17)-(line 73,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-e2b948e0-8cf5-411e-afc1-486d7788d6eb.next()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 17)-(line 78,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-2f2181b3-1ef4-4ec5-a19b-03c71cb4d9ca.remove()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 17)-(line 83,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " the iterator being adapted into an iterable. "
    },
    {
      "type": "field",
      "varNames": [
        "typeSafeIterator"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " the iterator parameterized as the {@link #iterator()} return type. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e, boolean)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     * @param multipleUse \u003ccode\u003etrue\u003c/code\u003e if the new iterable can be used in multiple iterations\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.iterator()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Gets the iterator wrapped by this iterable.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 32)"
      ]
    }
  ]
}