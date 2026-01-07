{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ForClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ForClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 105,
      "comment": "\n * Closure implementation that calls another closure n times, like a for loop.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iCount"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The number of times to loop "
    },
    {
      "type": "field",
      "varNames": [
        "iClosure"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The closure to call "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ForClosure.forClosure(int, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     * Factory method that performs validation.\n     * \u003cp\u003e\n     * A null closure or zero count returns the \u003ccode\u003eNOPClosure\u003c/code\u003e.\n     * A count of one returns the specified closure.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param count  the number of times to execute the closure\n     * @param closure  the closure to execute, not null\n     * @return the \u003ccode\u003efor\u003c/code\u003e closure\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ForClosure.ForClosure(int, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eforClosure\u003c/code\u003e if you want that.\n     *\n     * @param count  the number of times to execute the closure\n     * @param closure  the closure to execute, not null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ForClosure.execute(E)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Executes the closure \u003ccode\u003ecount\u003c/code\u003e times.\n     *\n     * @param input  the input object\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ForClosure.getClosure()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Gets the closure.\n     *\n     * @return the closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ForClosure.getCount()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets the count.\n     *\n     * @return the count\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 22)"
      ]
    }
  ]
}