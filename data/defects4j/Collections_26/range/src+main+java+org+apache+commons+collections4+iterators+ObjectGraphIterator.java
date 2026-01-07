{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/ObjectGraphIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectGraphIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 77,
      "end_line": 252,
      "comment": "\n * An Iterator that can traverse multiple iterators down an object graph.\n * \u003cp\u003e\n * This iterator can extract multiple objects from a complex tree-like object graph.\n * The iteration starts from a single root object.\n * It uses a \u003ccode\u003eTransformer\u003c/code\u003e to extract the iterators and elements.\n * Its main benefit is that no intermediate \u003ccode\u003eList\u003c/code\u003e is created.\n * \u003cp\u003e\n * For example, consider an object graph:\n * \u003cpre\u003e\n *                 |- Branch -- Leaf\n *                 |         \\- Leaf\n *         |- Tree |         /- Leaf\n *         |       |- Branch -- Leaf\n *  Forest |                 \\- Leaf\n *         |       |- Branch -- Leaf\n *         |       |         \\- Leaf\n *         |- Tree |         /- Leaf\n *                 |- Branch -- Leaf\n *                 |- Branch -- Leaf\u003c/pre\u003e\n * The following \u003ccode\u003eTransformer\u003c/code\u003e, used in this class, will extract all\n * the Leaf objects without creating a combined intermediate list:\n * \u003cpre\u003e\n * public Object transform(Object input) {\n *   if (input instanceof Forest) {\n *     return ((Forest) input).treeIterator();\n *   }\n *   if (input instanceof Tree) {\n *     return ((Tree) input).branchIterator();\n *   }\n *   if (input instanceof Branch) {\n *     return ((Branch) input).leafIterator();\n *   }\n *   if (input instanceof Leaf) {\n *     return input;\n *   }\n *   throw new ClassCastException();\n * }\u003c/pre\u003e\n * \u003cp\u003e\n * Internally, iteration starts from the root object. When next is called,\n * the transformer is called to examine the object. The transformer will return\n * either an iterator or an object. If the object is an Iterator, the next element\n * from that iterator is obtained and the process repeats. If the element is an object\n * it is returned.\n * \u003cp\u003e\n * Under many circumstances, linking Iterators together in this manner is\n * more efficient (and convenient) than using nested for loops to extract a list.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The stack of iterators "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The root object in the tree "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The transformer to use "
    },
    {
      "type": "field",
      "varNames": [
        "hasNext"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Whether there is another element in the iteration "
    },
    {
      "type": "field",
      "varNames": [
        "currentIterator"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The current iterator "
    },
    {
      "type": "field",
      "varNames": [
        "currentValue"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The current value "
    },
    {
      "type": "field",
      "varNames": [
        "lastUsedIterator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The last used iterator, needed for remove() "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.ObjectGraphIterator(E, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * Constructs an ObjectGraphIterator using a root object and transformer.\n     * \u003cp\u003e\n     * The root object can be an iterator, in which case it will be immediately\n     * looped around.\n     *\n     * @param root  the root object, null will result in an empty iterator\n     * @param transformer  the transformer to use, null will use a no effect transformer\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.ObjectGraphIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Constructs a ObjectGraphIterator that will handle an iterator of iterators.\n     * \u003cp\u003e\n     * This constructor exists for convenience to emphasise that this class can\n     * be used to iterate over nested iterators. That is to say that the iterator\n     * passed in here contains other iterators, which may in turn contain further\n     * iterators.\n     *\n     * @param rootIterator  the root iterator, null will result in an empty iterator\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 16)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 129,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.updateCurrentIterator()",
      "begin_line": 136,
      "end_line": 154,
      "comment": "\n     * Loops around the iterators to find the next value to return.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.findNext(E)",
      "begin_line": 161,
      "end_line": 171,
      "comment": "\n     * Finds the next object in the iteration given any start object.\n     *\n     * @param value  the value to start from\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.findNextByIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 178,
      "end_line": 200,
      "comment": "\n     * Finds the next object in the iteration given an iterator.\n     *\n     * @param iterator  the iterator to start from\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.hasNext()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Checks whether there are any more elements in the iteration to obtain.\n     *\n     * @return true if elements remain in the iteration\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 32)",
        "(line 210,col 9)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.next()",
      "begin_line": 219,
      "end_line": 229,
      "comment": "\n     * Gets the next element of the iteration.\n     *\n     * @return the next element from the iteration\n     * @throws NoSuchElementException if all the Iterators are exhausted\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 32)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 43)",
        "(line 225,col 9)-(line 225,col 38)",
        "(line 226,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 227,col 24)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectGraphIterator.remove()",
      "begin_line": 244,
      "end_line": 250,
      "comment": "\n     * Removes from the underlying collection the last element returned.\n     * \u003cp\u003e\n     * This method calls remove() on the underlying Iterator and it may\n     * throw an UnsupportedOperationException if the underlying Iterator\n     * does not support this method.\n     *\n     * @throws UnsupportedOperationException\n     *   if the remove operator is not supported by the underlying Iterator\n     * @throws IllegalStateException\n     *   if the next method has not yet been called, or the remove method has\n     *   already been called after the last call to the next method.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 34)",
        "(line 249,col 9)-(line 249,col 32)"
      ]
    }
  ]
}