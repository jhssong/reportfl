{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/IteratorIterable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e"
      ],
      "begin_line": 63,
      "end_line": 129,
      "comment": "\n * Adapter to make an {@link Iterator Iterator} instance appear to be an\n * {@link Iterable Iterable} instance.  The iterable can be constructed in one\n * of two variants:  single use, multiple use.\n *\n * \u003cp\u003e\n * In the single use iterable case, the iterable is only usable for one\n * iterative operation over the source iterator.  Subsequent iterative\n * operations use the same, exhausted source iterator.  To create a single use\n * iterable, construct a new {@link IteratorIterable} using a {@link Iterator}\n * that is NOT a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * In the multiple use iterable case, the iterable is usable for any number of\n * iterative operations over the source iterator.  Of special note, even though\n * the iterable supports multiple iterations, it does not support concurrent\n * iterations. To implicitly create a multiple use iterable, construct a new\n * {@link IteratorIterable} using a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Integer[] array \u003d {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)};\n *   Iterator\u003cInteger\u003e iterator \u003d IteratorUtils.arrayIterator(array); // a resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * A multiple use iterable can also be explicitly constructed using any\n * {@link Iterator} and specifying \u003ccode\u003etrue\u003c/code\u003e for the\n * \u003ccode\u003emultipleUse\u003c/code\u003e flag:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator, true);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.createTypesafeIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 69,
      "end_line": 83,
      "comment": "\n     * Factory method to create an {@link Iterator Iterator} from another\n     * iterator over objects of a different subtype.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 82,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-936326d2-903d-4b82-8f0d-81f181be1a1a.hasNext()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 17)-(line 72,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-63e846a0-7b14-4569-9408-8181affaeaed.next()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 17)-(line 76,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-f8fc1a2c-dde6-4465-b8ee-5039a03e9db1.remove()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 17)-(line 80,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " the iterator being adapted into an iterable. "
    },
    {
      "type": "field",
      "varNames": [
        "typeSafeIterator"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " the iterator parameterized as the {@link #iterator()} return type. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e, boolean)",
      "begin_line": 108,
      "end_line": 116,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     * @param multipleUse \u003ccode\u003etrue\u003c/code\u003e if the new iterable can be used in multiple iterations\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.iterator()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Gets the iterator wrapped by this iterable.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 32)"
      ]
    }
  ]
}