{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/IteratorIterable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e"
      ],
      "begin_line": 63,
      "end_line": 130,
      "comment": "\n * Adapter to make an {@link Iterator Iterator} instance appear to be an\n * {@link Iterable Iterable} instance.  The iterable can be constructed in one\n * of two variants:  single use, multiple use.\n *\n * \u003cp\u003e\n * In the single use iterable case, the iterable is only usable for one\n * iterative operation over the source iterator.  Subsequent iterative\n * operations use the same, exhausted source iterator.  To create a single use\n * iterable, construct a new {@link IteratorIterable} using a {@link Iterator}\n * that is NOT a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * In the multiple use iterable case, the iterable is usable for any number of\n * iterative operations over the source iterator.  Of special note, even though\n * the iterable supports multiple iterations, it does not support concurrent\n * iterations. To implicitly create a multiple use iterable, construct a new\n * {@link IteratorIterable} using a {@link ResettableIterator} iterator:\n * \u003cpre\u003e\n *   Integer[] array \u003d {Integer.valueOf(1),Integer.valueOf(2),Integer.valueOf(3)};\n *   Iterator\u003cInteger\u003e iterator \u003d IteratorUtils.arrayIterator(array); // a resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * A multiple use iterable can also be explicitly constructed using any\n * {@link Iterator} and specifying \u003ccode\u003etrue\u003c/code\u003e for the\n * \u003ccode\u003emultipleUse\u003c/code\u003e flag:\n * \u003cpre\u003e\n *   Iterator\u003cInteger\u003e iterator \u003d // some non-resettable iterator\n *   Iterable\u003cInteger\u003e iterable \u003d new IteratorIterable\u003cInteger\u003e(iterator, true);\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.createTypesafeIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 69,
      "end_line": 84,
      "comment": "\n     * Factory method to create an {@link Iterator Iterator} from another\n     * iterator over objects of a different subtype.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 83,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-9e3d6f49-9ea6-4e3a-b632-a17bd5a95119.hasNext()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 17)-(line 73,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-4dbe4db8-9e41-4e1f-bcbe-7097bcc52ea8.next()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 17)-(line 77,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.Anonymous-96c4bd44-c62b-432c-b1bf-a8c3ece90f38.remove()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 17)-(line 81,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " the iterator being adapted into an iterable. "
    },
    {
      "type": "field",
      "varNames": [
        "typeSafeIterator"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " the iterator parameterized as the {@link #iterator()} return type. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.IteratorIterable(java.util.Iterator\u003c? extends E\u003e, boolean)",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorIterable\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use.\n     * @param multipleUse \u003ccode\u003etrue\u003c/code\u003e if the new iterable can be used in multiple iterations\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorIterable.iterator()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Gets the iterator wrapped by this iterable.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 32)"
      ]
    }
  ]
}