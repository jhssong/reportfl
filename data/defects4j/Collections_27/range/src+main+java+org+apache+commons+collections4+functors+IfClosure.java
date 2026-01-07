{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/IfClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IfClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 156,
      "comment": "\n * Closure implementation acts as an if statement calling one or other closure\n * based on a predicate.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicate"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The test "
    },
    {
      "type": "field",
      "varNames": [
        "iTrueClosure"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The closure to use if true "
    },
    {
      "type": "field",
      "varNames": [
        "iFalseClosure"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The closure to use if false "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.ifClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * This factory creates a closure that performs no action when\n     * the predicate is false.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param predicate  predicate to switch on\n     * @param trueClosure  closure used if true\n     * @return the \u003ccode\u003eif\u003c/code\u003e closure\n     * @throws NullPointerException if either argument is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.ifClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 70,
      "end_line": 80,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param predicate  predicate to switch on\n     * @param trueClosure  closure used if true\n     * @param falseClosure  closure used if false\n     * @return the \u003ccode\u003eif\u003c/code\u003e closure\n     * @throws NullPointerException if any argument is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.IfClosure.IfClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eifClosure\u003c/code\u003e if you want that.\n     * \u003cp\u003e\n     * This constructor creates a closure that performs no action when\n     * the predicate is false.\n     *\n     * @param predicate  predicate to switch on, not null\n     * @param trueClosure  closure used if true, not null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.IfClosure.IfClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eifClosure\u003c/code\u003e if you want that.\n     *\n     * @param predicate  predicate to switch on, not null\n     * @param trueClosure  closure used if true, not null\n     * @param falseClosure  closure used if false, not null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.execute(E)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Executes the true or false closure according to the result of the predicate.\n     *\n     * @param input  the input object\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.getPredicate()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Gets the predicate.\n     *\n     * @return the predicate\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.getTrueClosure()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Gets the closure called when true.\n     *\n     * @return the closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IfClosure.getFalseClosure()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Gets the closure called when false.\n     *\n     * @return the closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)"
      ]
    }
  ]
}