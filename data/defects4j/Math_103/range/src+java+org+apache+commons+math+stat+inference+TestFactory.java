{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/stat/inference/TestFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 65,
      "comment": "\n * Abstract factory to create inference test instances.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.TestFactory()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.newInstance()",
      "begin_line": 39,
      "end_line": 50,
      "comment": "\n     * Create an instance of a \u003ccode\u003eTestFactory\u003c/code\u003e\n     * \n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 35)",
        "(line 41,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createTTest()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Create a TTest instance.\n     * \n     * @return a new TTest instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactory.createChiSquareTest()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Create a ChiSquareTest instance.\n     * \n     * @return a new ChiSquareTest instance\n     ",
      "child_ranges": []
    }
  ]
}