{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/WhileClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WhileClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 123,
      "comment": "\n * Closure implementation that executes a closure repeatedly until a condition is met,\n * like a do-while or while loop.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "comment": " The test condition "
    },
    {
      "type": "field",
      "varNames": [
        "iClosure"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The closure to call "
    },
    {
      "type": "field",
      "varNames": [
        "iDoLoop"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The flag, true is a do loop, false is a while "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.whileClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e, boolean)",
      "begin_line": 53,
      "end_line": 62,
      "comment": "\n     * Factory method that performs validation.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param predicate  the predicate used to evaluate when the loop terminates, not null\n     * @param closure  the closure the execute, not null\n     * @param doLoop  true to act as a do-while loop, always executing the closure once\n     * @return the \u003ccode\u003ewhile\u003c/code\u003e closure\n     * @throws IllegalArgumentException if the predicate or closure is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.WhileClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e, boolean)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003ewhileClosure\u003c/code\u003e if you want that.\n     *\n     * @param predicate  the predicate used to evaluate when the loop terminates, not null\n     * @param closure  the closure the execute, not null\n     * @param doLoop  true to act as a do-while loop, always executing the closure once\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.execute(E)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Executes the closure until the predicate is false.\n     *\n     * @param input  the input object\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.getPredicate()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the predicate in use.\n     *\n     * @return the predicate\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.getClosure()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets the closure.\n     *\n     * @return the closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.WhileClosure.isDoLoop()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Is the loop a do-while loop.\n     *\n     * @return true is do-while, false if while\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 23)"
      ]
    }
  ]
}