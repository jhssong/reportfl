{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/ChainedClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChainedClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 127,
      "comment": "\n * Closure implementation that chains the specified closures together.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iClosures"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The closures to call in turn "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.chainedClosure(org.apache.commons.collections4.Closure\u003c? super E\u003e...)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "\n     * Factory method that performs validation and copies the parameter array.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param closures  the closures to chain, copied, no nulls\n     * @return the \u003ccode\u003echained\u003c/code\u003e closure\n     * @throws NullPointerException if the closures array is null\n     * @throws NullPointerException if any closure in the array is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 40)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.chainedClosure(java.util.Collection\u003c? extends org.apache.commons.collections4.Closure\u003c? super E\u003e\u003e)",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n     * Create a new Closure that calls each closure in turn, passing the\n     * result into the next closure. The ordering is that of the iterator()\n     * method on the collection.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param closures  a collection of closures to chain\n     * @return the \u003ccode\u003echained\u003c/code\u003e closure\n     * @throws NullPointerException if the closures collection is null\n     * @throws NullPointerException if any closure in the collection is null\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 71)",
        "(line 76,col 9)-(line 76,col 18)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.ChainedClosure(boolean, org.apache.commons.collections4.Closure\u003c? super E\u003e...)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Hidden constructor for the use by the static factory methods.\n     *\n     * @param clone  if {@code true} the input argument will be cloned\n     * @param closures  the closures to chain, no nulls\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 16)",
        "(line 92,col 9)-(line 92,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.ChainedClosure(org.apache.commons.collections4.Closure\u003c? super E\u003e...)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003echainedClosure\u003c/code\u003e if you want that.\n     *\n     * @param closures  the closures to chain, copied, no nulls\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.execute(E)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Execute a list of closures.\n     *\n     * @param input  the input object passed to each closure\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ChainedClosure.getClosures()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Gets the closures.\n     *\n     * @return a copy of the closures\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 47)"
      ]
    }
  ]
}