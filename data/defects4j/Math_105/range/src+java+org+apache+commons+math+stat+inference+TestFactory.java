{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/inference/TestFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 64,
      "comment": "\n * Abstract factory to create inference test instances.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.TestFactory()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.newInstance()",
      "begin_line": 38,
      "end_line": 49,
      "comment": "\n     * Create an instance of a \u003ccode\u003eTestFactory\u003c/code\u003e\n     * \n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 35)",
        "(line 40,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createTTest()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Create a TTest instance.\n     * \n     * @return a new TTest instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createChiSquareTest()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Create a ChiSquareTest instance.\n     * \n     * @return a new ChiSquareTest instance\n     ",
      "child_ranges": []
    }
  ]
}