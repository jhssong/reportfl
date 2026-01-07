{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/TransformIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cO\u003e"
      ],
      "begin_line": 29,
      "end_line": 144,
      "comment": "\n * Decorates an iterator such that each element returned is transformed.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The iterator being used "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The transformer being used "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.TransformIterator()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new \u003ccode\u003eTransformIterator\u003c/code\u003e that will not function\n     * until the {@link #setIterator(Iterator) setIterator} and\n     * {@link #setTransformer(Transformer)} methods are invoked.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.TransformIterator(java.util.Iterator\u003c? extends I\u003e)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new \u003ccode\u003eTransformIterator\u003c/code\u003e that won\u0027t transform\n     * elements from the given iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.TransformIterator(java.util.Iterator\u003c? extends I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Constructs a new \u003ccode\u003eTransformIterator\u003c/code\u003e that will use the\n     * given iterator and transformer.  If the given transformer is null,\n     * then objects will not be transformed.\n     *\n     * @param iterator  the iterator to use\n     * @param transformer  the transformer to use\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.hasNext()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.next()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets the next object from the iteration, transforming it using the\n     * current transformer. If the transformer is null, no transformation\n     * occurs and the object from the iterator is returned directly.\n     *\n     * @return the next object\n     * @throws java.util.NoSuchElementException if there are no more elements\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.remove()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.getIterator()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the iterator this iterator is using.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.setIterator(java.util.Iterator\u003c? extends I\u003e)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Sets the iterator for this iterator to use.\n     * If iteration has started, this effectively resets the iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.getTransformer()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Gets the transformer this iterator is using.\n     *\n     * @return the transformer.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.setTransformer(org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Sets the transformer this the iterator to use.\n     * A null transformer is a no-op transformer.\n     *\n     * @param transformer  the transformer to use\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.TransformIterator.transform(I)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Transforms the given object using the transformer.\n     * If the transformer is null, the original object is returned as-is.\n     *\n     * @param source  the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 45)"
      ]
    }
  ]
}