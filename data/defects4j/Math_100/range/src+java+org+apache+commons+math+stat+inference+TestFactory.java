{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/stat/inference/TestFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 67,
      "comment": "\n * Abstract factory to create inference test instances.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n * @deprecated as of 1.2, pluggability of test instances is now provided through\n *             constructors and setters.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.TestFactory()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.newInstance()",
      "begin_line": 41,
      "end_line": 52,
      "comment": "\n     * Create an instance of a \u003ccode\u003eTestFactory\u003c/code\u003e\n     * \n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 35)",
        "(line 43,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createTTest()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Create a TTest instance.\n     * \n     * @return a new TTest instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createChiSquareTest()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Create a ChiSquareTest instance.\n     * \n     * @return a new ChiSquareTest instance\n     ",
      "child_ranges": []
    }
  ]
}