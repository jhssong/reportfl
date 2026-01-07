{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/inference/TestFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.TestFactory"
      ],
      "begin_line": 28,
      "end_line": 55,
      "comment": "\n * A concrete inference test factory.  This is the default factory used by\n * Commons-Math.\n *  \n * @deprecated as of 1.2, pluggability of test instances is now provided through\n *             constructors and setters.\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestFactoryImpl.TestFactoryImpl()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor. \n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactoryImpl.createTTest()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Create a TTest instance.\n     * \n     * @return a new TTest instance\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestFactoryImpl.createChiSquareTest()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a ChiSquareTest instance.\n     * \n     * @return a new ChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 39)"
      ]
    }
  ]
}